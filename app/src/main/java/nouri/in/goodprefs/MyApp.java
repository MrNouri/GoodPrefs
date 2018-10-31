package nouri.in.goodprefs;

import android.app.Application;

import nouri.in.goodprefslib.GoodPrefs;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Init GoodPrefs lib
        GoodPrefs.init(getApplicationContext());
    }
}
