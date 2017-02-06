package darkkillen.com.simplemvpproject.main;


import darkkillen.com.simplemvpproject.base.BasePresenter;
import darkkillen.com.simplemvpproject.base.BaseView;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface IMainActivity {

    interface View extends BaseView<Presenter> {
        void setSampleText(String text);
    }

    interface Presenter extends BasePresenter {
        void onButtonClick();
    }

}
