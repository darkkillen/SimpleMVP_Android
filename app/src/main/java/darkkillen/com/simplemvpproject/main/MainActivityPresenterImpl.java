package darkkillen.com.simplemvpproject.main;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MainActivityPresenterImpl implements IMainActivity.Presenter {

    private IMainActivity.View view;
    private final static String TAG = "MainActivityPresenterImpl";

    public MainActivityPresenterImpl(IMainActivity.View iView) {
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

    @Override
    public void onButtonClick() {
        view.setSampleText("Hello world! Simple MVP.");
    }
}
