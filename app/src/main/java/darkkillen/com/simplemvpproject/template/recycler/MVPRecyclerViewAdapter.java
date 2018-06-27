package darkkillen.com.simplemvpproject.template.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import darkkillen.com.simplemvpproject.R;
import darkkillen.com.simplemvpproject.base.BaseRecyclerViewAdapter;
import darkkillen.com.simplemvpproject.model.ModelData;
import darkkillen.com.simplemvpproject.template.recycler.viewtype1.ViewHolderViewTypeOne;
import darkkillen.com.simplemvpproject.template.recycler.viewtype2.ViewHolderViewTypeTwo;
import darkkillen.com.simplemvpproject.template.recycler.viewtype3.ViewHolderViewTypeThree;

/**
 * Created by darkkillen on 1/25/2017 AD.
 */

public class MVPRecyclerViewAdapter extends BaseRecyclerViewAdapter implements IMVPRecyclerViewAdapter.View {

    private Context mContext;
    private IMVPRecyclerViewAdapter.Presenter mPresenter;

    public MVPRecyclerViewAdapter(Context context) {
        this.mContext = context;
        mPresenter = new MVPRecyclerViewAdapterPresenterImpl(this);
    }

    @Override
    public int getItemViewType(int position) {
        return mPresenter.viewHolderIdentification(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return mPresenter.onCreateViewHolderIdentification(parent, viewType);
        }

    @Override
    public RecyclerView.ViewHolder getViewHolderViewTypeOne(ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup vItem;
        vItem = (ViewGroup) mInflater.inflate(R.layout.viewholder_view_type_1, parent, false);
        return new ViewHolderViewTypeOne(vItem, mContext);
    }

    @Override
    public RecyclerView.ViewHolder getViewHolderViewTypeTwo(ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup vItem;
        vItem = (ViewGroup) mInflater.inflate(R.layout.viewholder_view_type_2, parent, false);
        return new ViewHolderViewTypeTwo(vItem, mContext);
    }

    @Override
    public RecyclerView.ViewHolder getViewHolderViewTypeThree(ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup vItem;
        vItem = (ViewGroup) mInflater.inflate(R.layout.viewholder_view_type_3, parent, false);
        return new ViewHolderViewTypeThree(vItem, mContext);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mPresenter.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return mPresenter.getCount();
    }

    public void addData(ModelData data) {
        mPresenter.addData(data);
    }

}


