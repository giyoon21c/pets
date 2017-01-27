package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

public class PetDbHelper extends SQLiteOpenHelper {

    // Database Info
    private static final String DATABASE_NAME = PetEntry.TABLE_NAME;
    private static final int DATABASE_VERSION = 1;

    /**
     *
     * @param context
     * constructor called superclass SQLiteOpenHelper's constructor
     */
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     *
     * @param db
     * CREATE TABLE pets(_id INTEGER PRIMARY KEY AUTOINCREMENT,
     *                   name TEXT NOT NULL,
     *                   breed TEXT,
     *                   gender INTEGER NOT NULL,
     *                   weight INTEGER NOT NULL DEFAULT 0
     *                   );
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + DATABASE_NAME + " ( " +
                PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL," +
                PetEntry.COLUMN_PET_BREED + " TEXT," +
                PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, " +
                PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0" +
                ")";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        onCreate(db);
    }
}
