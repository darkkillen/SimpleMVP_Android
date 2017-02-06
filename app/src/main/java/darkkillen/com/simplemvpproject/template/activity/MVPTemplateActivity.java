package darkkillen.com.simplemvpproject.template.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import darkkillen.com.simplemvpproject.R;
import darkkillen.com.simplemvpproject.base.BaseActivity;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPTemplateActivity extends BaseActivity implements IMVPTemplate.View {

    private IMVPTemplate.Presenter mPresenter;
    private final static String TAG = "MVPTemplateActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //  TODO: Set Layout Here
        // Don't forgot to add activity in manifest.
        mPresenter = new MVPTemplatePresenterImpl(this);
        initInflate();
        initInstance();
        mPresenter.viewOnCreate();
    }

    private void initInflate() {
        // findViewById HERE.
    }

    private void initInstance() {
        // initial something HERE.
    }

    @Override
    public void onStart() {
        super.onStart();
        mPresenter.viewOnStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.viewOnResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.viewOnPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mPresenter.viewOnStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.viewOnDestroy();
    }

}
