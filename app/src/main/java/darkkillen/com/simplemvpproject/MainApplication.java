package darkkillen.com.simplemvpproject;

import android.app.Application;

import darkkillen.com.simplemvpproject.manager.Contextor;

/**
 * Created by darkkillen on 8/17/2016 AD.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Contextor
        Contextor.getInstance().init(getApplicationContext());
    }

}

