package com.example.android.pets.data;

import android.provider.BaseColumns;


public final class PetContract {
    public static final String CONTENT_AUTHORITY = "com.example.android.pets.data";

    /**
     *
     */
    private PetContract() {}

    /**
     *
     */
    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = "_id";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for gender constants
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
