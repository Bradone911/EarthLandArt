package com.bignerdranch.android.earth_land_art.database;

public class ArtDbSchema {
    public static final class ArtTable  {
        public static final String NAME = "artpieces";

        public static final class Cols  {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String ARTIST = "artist";
            public static final String LOCATION = "location";
            public static final String DESCRIPTION = "description";
//            weather, how is works, need what for it
        }
    }

}
