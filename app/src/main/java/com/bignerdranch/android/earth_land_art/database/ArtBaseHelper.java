package com.bignerdranch.android.earth_land_art.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.earth_land_art.Art;

public class ArtBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;  //check this??
    private static final String DATABASE_NAME = "artbase.db";

    public ArtBaseHelper(Context context)   {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + ArtDbSchema.ArtTable.NAME + "(" +
        " _id integer primary key autoincrement, " +
                ArtDbSchema.ArtTable.Cols.UUID + ", " +
                ArtDbSchema.ArtTable.Cols.TITLE + ", " +
                ArtDbSchema.ArtTable.Cols.ARTIST + "," +
                ArtDbSchema.ArtTable.Cols.DESCRIPTION + "," +
                ArtDbSchema.ArtTable.Cols.DATE + "," +
                ArtDbSchema.ArtTable.Cols.LOCATION + ","    //check on this????
        );

    }
    @Override
    public void onUpgrage(SQLiteDatabase db, int oldVersion, int newVersion)   {

    }
}
