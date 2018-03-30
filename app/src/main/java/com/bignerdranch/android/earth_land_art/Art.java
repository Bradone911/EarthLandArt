package com.bignerdranch.android.earth_land_art;

import java.sql.Date;
import java.util.UUID;

public class Art {

    private UUID mId;// what is the mId used for
    private String mTitle;
    private Date mDate;
    private String mArtist;
    private String mLocation;   //check to see if this is needed
    private String mDescription;

    public Art() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

//    public void setId(UUID id) {      check on the set???
//        mId = id;
//    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getArtist() {
        return mArtist;
    }

//    public void setArtist(String artist) {      check on this???????
//        mArtist = artist;
//    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

}