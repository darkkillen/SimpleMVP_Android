package darkkillen.com.simplemvpproject.template.recycler.viewtype1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ViewHolderViewTypeOne extends RecyclerView.ViewHolder {

    private Context mContext;

    public ViewHolderViewTypeOne(View itemView, Context mContext) {
        super(itemView);
        this.mContext = mContext;
    }
}