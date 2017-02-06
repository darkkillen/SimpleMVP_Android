package darkkillen.com.simplemvpproject.template.pager;

import darkkillen.com.simplemvpproject.base.BasePagerAdapterPresenter;
import darkkillen.com.simplemvpproject.model.ModelData;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface IMVPPagerAdapter {

    interface View {

    }

    interface Presenter extends BasePagerAdapterPresenter {
        void addData(ModelData data);
    }
}
