package darkkillen.com.simplemvpproject.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by darkkillen on 9/7/2016 AD.
 */

public class NetworkUtils {
    public static boolean isNetworkAvailable(Context context){
        if (context!=null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivityManager!=null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if ((activeNetworkInfo != null) && (activeNetworkInfo.isConnected())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
