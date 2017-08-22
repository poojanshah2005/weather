package com.poojanshah.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coord implements Parcelable
{

    @SerializedName("lon")
    @Expose
    private Long lon;
    @SerializedName("lat")
    @Expose
    private Long lat;
    public final static Parcelable.Creator<Coord> CREATOR = new Creator<Coord>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Coord createFromParcel(Parcel in) {
            Coord instance = new Coord();
            instance.lon = ((Long) in.readValue((Long.class.getClassLoader())));
            instance.lat = ((Long) in.readValue((Long.class.getClassLoader())));
            return instance;
        }

        public Coord[] newArray(int size) {
            return (new Coord[size]);
        }

    }
            ;

    public Long getLon() {
        return lon;
    }

    public void setLon(Long lon) {
        this.lon = lon;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lon);
        dest.writeValue(lat);
    }

    public int describeContents() {
        return 0;
    }

}