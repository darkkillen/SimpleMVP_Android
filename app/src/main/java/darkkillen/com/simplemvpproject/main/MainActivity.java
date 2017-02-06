package darkkillen.com.simplemvpproject.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import darkkillen.com.simplemvpproject.R;
import darkkillen.com.simplemvpproject.base.BaseActivity;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MainActivity extends BaseActivity implements IMainActivity.View {

    private IMainActivity.Presenter mPresenter;
    private final static String TAG = "MainActivity";

    private TextView tvSample;
    private Button btnSample;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenterImpl(this);
        initInflate();
        initInstance();
        mPresenter.viewOnCreate();
    }

    private void initInflate() {
        // findViewById HERE.
        tvSample = (TextView) findViewById(R.id.activity_main_tv_sample);
        btnSample = (Button) findViewById(R.id.activity_main_btn_sample);
    }

    private void initInstance() {
        // initial something HERE.
        btnSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onButtonClick();
            }
        });
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

    @Override
    public void setSampleText(String text) {
        tvSample.setText(text);
    }
}
