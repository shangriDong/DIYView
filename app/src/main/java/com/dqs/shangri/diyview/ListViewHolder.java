package com.dqs.shangri.diyview;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shangri on 2016/10/31.
 */

public class ListViewHolder {
    public TextView textView;
    public ImageView imageView;

    public ListViewHolder(CustomLayout view) {
        textView = (TextView) view.findViewById(R.id.text_view);
        imageView = (ImageView) view.findViewById(R.id.image_view);
    }
}
