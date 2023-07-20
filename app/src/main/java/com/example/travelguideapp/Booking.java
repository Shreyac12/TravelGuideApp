package com.example.travelguideapp;

import com.google.firebase.database.FirebaseDatabase;

public class Booking {
    String resortName;
    String hotel_name,guest,prices,showCheckIns,showCheckOuts,names,phNumbers,emails,bookingId,totals,duration;

    public Booking(String hotel_name,String guest, String prices, String showCheckIns, String showCheckOuts, String names, String phNumbers, String emails, String totals, String duration) {
        this.guest = guest;
        this.prices = prices;
        this.showCheckIns = showCheckIns;
        this.showCheckOuts = showCheckOuts;
        this.names = names;
        this.phNumbers = phNumbers;
        this.emails = emails;
        this.totals = totals;
        this.duration = duration;
        this.hotel_name = hotel_name;
        // Generate a unique booking ID
        this.bookingId = FirebaseDatabase.getInstance().getReference("bookings").push().getKey();
    }
    public Booking(){
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getTotals() {
        return totals;
    }

    public void setTotals(String totals) {
        this.totals = totals;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getShowCheckIns() {
        return showCheckIns;
    }

    public void setShowCheckIns(String showCheckIns) {
        this.showCheckIns = showCheckIns;
    }

    public String getShowCheckOuts() {
        return showCheckOuts;
    }

    public void setShowCheckOuts(String showCheckOuts) {
        this.showCheckOuts = showCheckOuts;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhNumbers() {
        return phNumbers;
    }

    public void setPhNumbers(String phNumbers) {
        this.phNumbers = phNumbers;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }


    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }
}
