package com.wesleyseago.android.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Wesley on 1/27/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore (Parse).
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "i1ur4vHQJtEtAeOvIhglJcMgrdgEKNgJEGE42yG3", "vYio4lKm42VaQGaSpws1Pd38W9ohphcgJkpWEpsn");

        // Test Parse
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}
