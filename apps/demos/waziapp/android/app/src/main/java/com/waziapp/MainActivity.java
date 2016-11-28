package com.waziapp;

import com.facebook.react.ReactActivity;
import com.cboy.rn.splashscreen.SplashScreen;
import android.os.Bundle;
public class MainActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  // here
        super.onCreate(savedInstanceState);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "Waziapp";
    }
}
