package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Book extends AppCompatActivity implements PaymentResultListener {

    DatabaseReference reference = FirebaseDatabase.getInstance().getReference("bookings");


    TextView checkIn , checkOut , showCheckIn , showCheckOut,hotelname;
    Uri uri;
    Button pay;
    RadioGroup radioGroup;
    RadioButton standard,deluxe,executive;

    ImageView resort_image;
    TextView price , total;
    EditText nights , guests , name , phNumber , email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        FirebaseApp.initializeApp(Book.this);
        hotelname = findViewById(R.id.hotelName);
        radioGroup = findViewById(R.id.radioGroup);
        guests = findViewById(R.id.guests);
        standard = findViewById(R.id.standard);
        deluxe = findViewById(R.id.deluxe);
        executive = findViewById(R.id.executive);
        nights =findViewById(R.id.nights);
        total = findViewById(R.id.total);
        price = findViewById(R.id.price);
        checkIn = findViewById(R.id.checkIn);
        checkOut = findViewById(R.id.checkOut);
        showCheckIn = findViewById(R.id.showCheckIn);
        showCheckOut = findViewById(R.id.showCheckOut);
        name = findViewById(R.id.name);
        phNumber = findViewById(R.id.phNumber);
        email = findViewById(R.id.email);
        pay = findViewById(R.id.pay);
        resort_image = findViewById(R.id.resort_image);
        Intent intent=getIntent();
        int pictures = intent.getIntExtra("picture",0);
        resort_image.setImageResource(pictures);
        String resort_Name = getIntent().getStringExtra("resortName");
        hotelname.setText(resort_Name);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String noOfNightsText = nights.getText().toString();

                if (!noOfNightsText.isEmpty()) {
                    int noOfNights = Integer.parseInt(noOfNightsText);

                    if (checkedId == R.id.standard){
                        price.setText("1000");
                        total.setText(""+noOfNights*1000);
                    } else if (checkedId == R.id.deluxe) {
                        price.setText("1800");
                        total.setText(""+noOfNights*1800);
                    } else if (checkedId == R.id.executive) {
                        price.setText("2400");
                        total.setText(""+noOfNights*2400);
                    }else {
                        price.setText("0");
                        total.setText("0");
                    }
                }
            }
        });
        checkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog1();
            }
        });



        Checkout.preload(Book.this);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guest = guests.getText().toString();
                String prices = price.getText().toString();
                String showCheckIns = showCheckIn.getText().toString();
                String showCheckOuts = showCheckOut.getText().toString();
                String names = name.getText().toString();
                String phNumbers = phNumber.getText().toString();
                String emails = email.getText().toString();
                if (guest.isEmpty() || prices.isEmpty() ||showCheckIns.isEmpty() ||showCheckOuts.isEmpty() ||names.isEmpty() ||phNumbers.isEmpty() ||emails.isEmpty()){
                    Toast.makeText(Book.this, "Please enter the details", Toast.LENGTH_SHORT).show();
                }else {
//                    Booking booking = new Booking(guest, prices, showCheckIns, showCheckOuts, names, phNumbers, emails);
//                    reference.push().setValue(booking);
                    startPayment(Integer.parseInt(total.getText().toString()));
                }
            }
        });
    }

    public  void  startPayment(int amount){
        Checkout checkout = new Checkout();
        checkout.setKeyID("rzp_test_h9qN2lPcsDOYu8");

        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name","Payment");
            jsonObject.put("description","hello");
            jsonObject.put("theme.color", "#3399cc");
            jsonObject.put("currency", "INR");
            jsonObject.put("amount", amount*100);//pass amount in currency subunits
            jsonObject.put("prefill.email", "shreyacr1206@gmail.com");
            jsonObject.put("prefill.contact","7204321382");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            jsonObject.put("retry", retryObj);

            checkout.open(Book.this,jsonObject);
        }catch (Exception e){
            Toast.makeText(Book.this, "error ", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onPaymentSuccess(String s) {
        String hotel_name=hotelname.getText().toString();
        String guest = guests.getText().toString();
        String prices = price.getText().toString();
        String showCheckIns = showCheckIn.getText().toString();
        String showCheckOuts = showCheckOut.getText().toString();
        String names = name.getText().toString();
        String phNumbers = phNumber.getText().toString();
        String emails = email.getText().toString();
        String totals = total.getText().toString();
        String duration =nights.getText().toString();
        String bookingId = reference.push().getKey();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String userId = user.getUid();
        Booking booking = new Booking(hotel_name,guest, prices, showCheckIns, showCheckOuts, names, phNumbers, emails , totals,duration);
        booking.setBookingId(bookingId);
        reference.child(userId).child(bookingId).setValue(booking);
        Toast.makeText(Book.this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(Book.this, "failed", Toast.LENGTH_SHORT).show();
    }


    private void openDialog() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                // Adjust the month value by adding 1
                int newMonth = month + 1;
                // Format the date components with leading zeros if needed
                String formattedMonth = String.format(Locale.US, "%02d", newMonth);
                String formattedDayOfMonth = String.format(Locale.US, "%02d", dayOfMonth);
                // Concatenate the date components in the desired order
                String selectedDate = formattedDayOfMonth + "/" + formattedMonth + "/" + year;
                showCheckIn.setText(selectedDate);
                showCheckOut.setText("");
            }
        }, currentYear, currentMonth, currentDay);

        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());

        dialog.show();
    }

    private void openDialog1() {
        // Get the selected check-in date
        String checkInDate = showCheckIn.getText().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        Date selectedCheckInDate;
        try {
            selectedCheckInDate = dateFormat.parse(checkInDate);
        } catch (ParseException e) {
            // Handle parsing exception if needed
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedCheckInDate);

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                // Adjust the month value by adding 1
                int adjustedMonth = month + 1;
                // Format the date components with leading zeros if needed
                String formattedMonth = String.format(Locale.US, "%02d", adjustedMonth);
                String formattedDayOfMonth = String.format(Locale.US, "%02d", dayOfMonth);
                // Concatenate the date components in the desired order
                String selectedDate = formattedDayOfMonth + "/" + formattedMonth + "/" + year;
                showCheckOut.setText(selectedDate);
            }
        }, currentYear, currentMonth, currentDay);

        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());

        dialog.show();
    }
}