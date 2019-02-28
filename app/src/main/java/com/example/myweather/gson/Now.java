package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    public String cloud;
    public String cond_code;
    public String cond_txt;
    public String fl;
    public String hum;
    public String pcpn;
    public String pres;
    @SerializedName("tmp")
    public String temperature;
    public String vis;
    public String wind_deg;
    public String wind_dir;
    public String wind_sc;
    public String wind_spd;

    @SerializedName("cond")
    public More more;

    public class More {
        public String code;
        @SerializedName("txt")
        public String info;
    }

}
