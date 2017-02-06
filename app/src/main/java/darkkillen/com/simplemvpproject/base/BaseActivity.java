package darkkillen.com.simplemvpproject.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by darkkillen on 9/1/2016 AD.
 */

public class BaseActivity extends AppCompatActivity {

//    private FirebaseAnalytics mFirebaseAnalytics;

//    public BaseActivity() {
//        LocaleUtils.updateConfig(this);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new FirebaseAnalyticManager(this);
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }



}
