package com.example.android.pets.data;

import android.provider.BaseColumns;


public final class PetContract {
    public static final String CONTENT_AUTHORITY = "com.example.android.pets.data";

    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";
        
    }
}
