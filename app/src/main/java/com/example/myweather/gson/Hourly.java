package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

public class Hourly {
    public String cloud;
    public String cond_code;
    public String cond_txt;
    public String dew;
    public String hum;
    public String pop;
    public String pres;
    public String time;
    @SerializedName("tmp")
    public String temperature;
    public String wind_deg;
    public String wind_dir;
    public String wind_sc;
    public String wind_spd;
}
