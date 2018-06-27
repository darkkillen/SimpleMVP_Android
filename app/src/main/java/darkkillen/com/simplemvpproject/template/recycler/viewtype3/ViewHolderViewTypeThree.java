package darkkillen.com.simplemvpproject.template.recycler.viewtype3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ViewHolderViewTypeThree extends RecyclerView.ViewHolder {

    private Context mContext;

        public ViewHolderViewTypeThree(View itemView, Context mContext) {
            super(itemView);
            this.mContext = mContext;
        }
    }