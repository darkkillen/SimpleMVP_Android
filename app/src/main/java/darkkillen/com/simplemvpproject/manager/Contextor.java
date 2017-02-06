package darkkillen.com.simplemvpproject.manager;

import android.content.Context;

/**
 * Created by darkkillen on 1/31/17.
 */

public class Contextor {

    private static Contextor instance;

    public static Contextor getInstance() {
        if (instance == null)
            instance = new Contextor();
        return instance;
    }

    private Context mContext;

    private Contextor() {
    }

    public void init(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

}
