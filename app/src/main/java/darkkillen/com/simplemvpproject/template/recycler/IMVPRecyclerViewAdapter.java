package darkkillen.com.simplemvpproject.template.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import darkkillen.com.simplemvpproject.base.BasePresenter;
import darkkillen.com.simplemvpproject.base.BaseRecyclerAdapterPresenter;
import darkkillen.com.simplemvpproject.base.BaseView;
import darkkillen.com.simplemvpproject.model.ModelData;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface IMVPRecyclerViewAdapter {

    interface View extends BaseView<Presenter> {
        RecyclerView.ViewHolder getViewHolderViewTypeOne(ViewGroup parent);
        RecyclerView.ViewHolder getViewHolderViewTypeTwo(ViewGroup parent);
        RecyclerView.ViewHolder getViewHolderViewTypeThree(ViewGroup parent);
    }

    interface Presenter extends BaseRecyclerAdapterPresenter {
        void addData(ModelData data);
    }

}
