package darkkillen.com.simplemvpproject.template.fragment;


import darkkillen.com.simplemvpproject.base.BasePresenter;
import darkkillen.com.simplemvpproject.base.BaseView;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface IMVPTemplate {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }

}
