package sharepreference.implementation.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class MyApplication extends Application {

    private static final String PREF_TITLE = "Tingtelpref";
    private static MyApplication myApplication;

    public static SharedPreferences getSharedPreferencesCustomer() {
        return myApplication.getSharedPreferences(PREF_TITLE, Context.MODE_PRIVATE);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;


    }

}
