package darkkillen.com.simplemvpproject.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface BaseRecyclerAdapterPresenter {

    int getCount();

    int viewHolderIdentification(int position);

    RecyclerView.ViewHolder onCreateViewHolderIdentification(ViewGroup parent, int viewType);

    void onBindViewHolder(RecyclerView.ViewHolder holder, int position);

}
