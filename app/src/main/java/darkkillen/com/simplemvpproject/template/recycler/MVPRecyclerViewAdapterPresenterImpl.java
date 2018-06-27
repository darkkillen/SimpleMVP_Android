package darkkillen.com.simplemvpproject.template.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import darkkillen.com.simplemvpproject.model.ModelData;

/**
 * Created by darkkillen on 8/16/2016 AD.
 */

public class MVPRecyclerViewAdapterPresenterImpl implements IMVPRecyclerViewAdapter.Presenter {

    private IMVPRecyclerViewAdapter.View view;
    private static final int VIEW_TYPE_ONE = 0;
    private static final int VIEW_TYPE_TWO = 1;
    private static final int VIEW_TYPE_THREE = 2;
    private ModelData data;

    public MVPRecyclerViewAdapterPresenterImpl(IMVPRecyclerViewAdapter.View view) {
        this.view = view;
    }

    @Override
    public int getCount() {
        if (data == null) return 0;
        return 3;
    }

    @Override
    public int viewHolderIdentification(int position) {
        switch (position) {
            case 0:
                return VIEW_TYPE_ONE;
            case 1:
                return VIEW_TYPE_TWO;
            case 2:
                return VIEW_TYPE_THREE;
            default:
                return -1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolderIdentification(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_ONE:
                return view.getViewHolderViewTypeOne(parent);
            case VIEW_TYPE_TWO:
                return view.getViewHolderViewTypeTwo(parent);
            case VIEW_TYPE_THREE:
                return view.getViewHolderViewTypeThree(parent);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public void addData(ModelData data) {
        this.data = data;
    }

}
