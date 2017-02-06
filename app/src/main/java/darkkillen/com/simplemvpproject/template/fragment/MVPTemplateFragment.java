package darkkillen.com.simplemvpproject.template.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import darkkillen.com.simplemvpproject.R;
import darkkillen.com.simplemvpproject.base.BaseFragment;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPTemplateFragment extends BaseFragment implements IMVPTemplate.View {

    private IMVPTemplate.Presenter mPresenter;
    private final static String TAG = "MVPTemplateFragment";

    public static MVPTemplateFragment newInstance() {
        MVPTemplateFragment fragment = new MVPTemplateFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MVPTemplatePresenterImpl(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);   //TODO: inflate layout HERE.
        initInflate(view);
        initial();
        mPresenter.viewOnCreateView();
        return view;
    }

    private void initInflate(View view) {
        // findViewById HERE.
    }

    private void initial() {
        // initial something HERE.
    }

}
