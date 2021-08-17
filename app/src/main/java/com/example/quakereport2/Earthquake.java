package com.example.quakereport2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private double magnitude;
    private String City;
private String url;
private String Date;

    public String getUrl() {
        return url;
    }

//    public Earthquake(double magnitude, String city, String date) {
//        this.magnitude = magnitude;
//        City = city;
//
//        Date = date;
//    }

    public String getDate() {
        return Date;
    }
//    public long getmTimeInMilliseconds() {
//        return mTimeInMilliseconds;
//    }

    private long mTimeInMilliseconds;

    public double getMagnitude() {
        return magnitude;
    }

    public String getCity() {
        return City;
    }


    public Earthquake(double magnitude, String city, long mTimeInMilliseconds,String url) {
        this.magnitude = magnitude;
        City = city;
        url = url;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;    }
}
