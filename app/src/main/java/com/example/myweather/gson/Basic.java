package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("cid")
    public String cityId;

    @SerializedName("location")
    public String cityName;

    public String parent_city;
    public String admin_area;
    public String cnty;
    public String lat;
    public String lon;
    public String tz;
    public String city;


    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;

        @SerializedName("utc")
        public String updateUtcTime;
    }
}
