package com.example.android.cobasinkron;

import android.database.sqlite.SQLiteOpenHelper;

import com.clough.android.androiddbviewer.ADBVApplication;

/**
 * Created by x453 on 22/02/2017.
 */

public class CustomApplication extends ADBVApplication {

    @Override
    public SQLiteOpenHelper getDataBase() {
        return new DBController(getApplicationContext());
    }

}
