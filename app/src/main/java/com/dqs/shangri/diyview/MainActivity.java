package com.dqs.shangri.diyview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CustomListAdapter customListAdapter;
    private List<ListBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);

        list = new ArrayList<>();
        customListAdapter = new CustomListAdapter(this, list);

        listView.setAdapter(customListAdapter);

        for (int i = 0; i < 200; i ++) {
            list.add(new ListBean("qsdfasdadasdasdsadasdasdasdasdasdasdasdasdasd"));
        }

        customListAdapter.notifyDataSetInvalidated();
    }
}
