package com.xq.mysectionindexer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //    private RecyclerView mRv;
    private ArrayList<String> list;
    //    private MyAdapter adapter;
    private ListView mLv;
    private PinyinComparator pinyinComparator;//排序规则


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
//        mRv = ((RecyclerView) this.findViewById(R.id.rv));
//        mRv.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new MyAdapter(this, list);
//        mRv.setAdapter(adapter);

        mLv = ((ListView) this.findViewById(R.id.lv));
        mLv.setAdapter(new MyLvAdapter(this, list));

    }

    private void initList() {
        list = new ArrayList<>();
        list.add("dianwei");
        list.add("zhangfei");
        list.add("#");
        list.add("huangzhong");
        list.add("liyuanfang");
        list.add("lanlingwang");
        list.add("@");
        list.add("ake");
        list.add("zhenji");
        list.add("wangzhaojun");
        list.add("change");

        pinyinComparator = new PinyinComparator();
        // 根据a-z进行排序源数据
        Collections.sort(list, pinyinComparator);//参数为排序的数据和规则

    }
}
