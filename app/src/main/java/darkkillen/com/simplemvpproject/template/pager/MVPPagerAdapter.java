package darkkillen.com.simplemvpproject.template.pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import darkkillen.com.simplemvpproject.base.BasePagerAdapter;
import darkkillen.com.simplemvpproject.model.ModelData;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPPagerAdapter extends BasePagerAdapter implements IMVPPagerAdapter.View {

    private IMVPPagerAdapter.Presenter mPresenter;
    private final static String TAG = "MVPPagerAdapter";
    private Context mContext;

    public MVPPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
        mPresenter = new MVPPagerAdapterPresenterImpl(this);
    }

    @Override
    public Fragment getItem(int position) {
        return mPresenter.getItem(position);
    }

    @Override
    public int getCount() {
        return mPresenter.getCount();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mPresenter.getTabTitle(position);
    }

    public void addData(ModelData data) {
        mPresenter.addData(data);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
