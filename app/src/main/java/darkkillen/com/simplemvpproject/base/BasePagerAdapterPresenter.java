package darkkillen.com.simplemvpproject.base;

import android.support.v4.app.Fragment;

/**
 * Created by darkkillen on 2/6/2017 AD.
 */

public interface BasePagerAdapterPresenter {

    int getCount();

    CharSequence getTabTitle(int position);

    Fragment getItem(int position);

}
