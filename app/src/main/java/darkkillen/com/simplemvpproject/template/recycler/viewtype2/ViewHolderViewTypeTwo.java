package darkkillen.com.simplemvpproject.template.recycler.viewtype2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ViewHolderViewTypeTwo extends RecyclerView.ViewHolder {

    private Context mContext;

        public ViewHolderViewTypeTwo(View itemView, Context mContext) {
            super(itemView);
            this.mContext = mContext;
        }
    }