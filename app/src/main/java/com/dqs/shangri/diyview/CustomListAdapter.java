package com.dqs.shangri.diyview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shangri on 2016/10/31.
 */

public class CustomListAdapter extends BaseAdapter {
    private List<ListBean> list;
    private Context context;

    public CustomListAdapter(Context context, List<ListBean> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ListBean getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder listViewHolder;

        if (convertView != null ) {
            listViewHolder = (ListViewHolder) convertView.getTag();
            listViewHolder.textView.setText(getItem(position).text);
        } else {
            convertView = View.inflate(context, R.layout.item, null);
            listViewHolder = new ListViewHolder((CustomLayout) convertView);
            convertView.setTag(listViewHolder);
            listViewHolder.textView.setText(getItem(position).text);
        }
        return convertView;
    }
}
