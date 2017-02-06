package darkkillen.com.simplemvpproject.template.pager;

import android.support.v4.app.Fragment;
import darkkillen.com.simplemvpproject.model.ModelData;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPPagerAdapterPresenterImpl implements IMVPPagerAdapter.Presenter {

    private IMVPPagerAdapter.View view;
    private final static String TAG = "MVPPagerAdapterPresenterImpl";
    private ModelData data;

    public MVPPagerAdapterPresenterImpl(IMVPPagerAdapter.View iView) {
        this.view = iView;
    }

    @Override
        public int getCount() {
            return 0;
        }

    @Override
    public CharSequence getTabTitle(int position) {
            return null;
        }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public void addData(ModelData data) {
        this.data = data;
    }
}
