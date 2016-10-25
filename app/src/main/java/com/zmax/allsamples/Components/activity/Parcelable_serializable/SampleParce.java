package com.zmax.allsamples.Components.activity.Parcelable_serializable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Kasturi on 23-Sep-16.
 */

public class SampleParce implements Parcelable {

    private String username;

    private  String password;

    public SampleParce(String username,String password)
    {
        this.username = username;
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    protected SampleParce(Parcel in)
    {
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<SampleParce> CREATOR = new Parcelable.Creator<SampleParce>()
    {
        @Override
        public SampleParce createFromParcel(Parcel source)
        {
            return new SampleParce(source);
        }

        @Override
        public SampleParce[] newArray(int size)
        {
            return new SampleParce[size];
        }
    };
}
