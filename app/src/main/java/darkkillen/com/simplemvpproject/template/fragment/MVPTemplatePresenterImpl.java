package darkkillen.com.simplemvpproject.template.fragment;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPTemplatePresenterImpl implements IMVPTemplate.Presenter {

    private IMVPTemplate.View view;
    private final static String TAG = "MVPTemplatePresenterImpl";

    public MVPTemplatePresenterImpl(IMVPTemplate.View iView) {
        this.view = iView;
    }

    @Override
    public void viewOnCreate() {

    }

    @Override
    public void viewOnStart() {

    }

    @Override
    public void viewOnResume() {

    }

    @Override
    public void viewOnPause() {

    }

    @Override
    public void viewOnStop() {

    }

    @Override
    public void viewOnDestroy() {

    }

    @Override
    public void viewOnCreateView() {

    }

    @Override
    public void viewOnDestroyView() {

    }
}
