package com.example.inna.cat_directory;


import android.os.Parcel;
import android.os.Parcelable;

public class CatsInfo implements Parcelable {
    private String mName;
    private String mDescription;
    private String mCharacter;
    public CatsInfo(String name, String description, String character ) {
        mName = name;
        mDescription = description;
        mCharacter = character;
    }
    public CatsInfo(Parcel in) {
        String[] data = new String[3];
        in.readStringArray(data);
        mName = data[0];
        mDescription = data[1];
        mCharacter = data[2];
    }
    public void setCatName(String name) {
        mName = name;
    }
    public String getCatName() {
        return mName;
    }
    public void setDescription(String description) {
        mDescription = description;
    }
    public String getDescription() {
        return mDescription;
    }
    public String getCharacter() {
        return mCharacter;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {
                mName, mDescription, mCharacter
        });
    }
    public static final Parcelable.Creator<CatsInfo> CREATOR = new Parcelable.Creator<CatsInfo>() {
        @Override
        public CatsInfo createFromParcel(Parcel source) {
            return new CatsInfo(source);
        }
        @Override
        public CatsInfo[] newArray(int size) {
            return new CatsInfo[size];
        }
    };
}
