package com.example.android.quakereport;

import android.os.AsyncTask;

import java.util.List;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long timeInMillisecods;

    Earthquake(String magnitude, String place, String time){

    }

    Earthquake(double mMagnitude,String mLocation ,long timeInMillisecods){
        this.mMagnitude=mMagnitude;
        this.mLocation=mLocation;
        this.timeInMillisecods=timeInMillisecods;

    }

    public double getmMagnitude(){
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getTimeInMillisecods() {
        return timeInMillisecods;
    }


}
