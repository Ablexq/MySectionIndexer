package com.xq.mysectionindexer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //    private RecyclerView mRv;
    //    private MyAdapter adapter;
    private ListView mLv;
    private PinyinComparator pinyinComparator;//排序规则
    private ArrayList<TempData> tempData;


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
        mLv.setAdapter(new MyLvAdapter(this, tempData));

    }

    private void initList() {
        tempData = new ArrayList<>();
        String[] array = new String[]{
                "后裔", "狄仁杰", "李元芳", "嫦娥", "王昭君", "妲己", "甄姬", "阿珂", "@", "兰陵王", "#", "黄忠", "张飞", "典韦"
        };

//        CharacterParser characterParser = new CharacterParser();
        for (int i = 0; i < array.length; i++) {
//            String string = characterParser.getSelling(array[i]);

            String string = Cn2Spell.getPinYin(array[i]);
            System.out.println(array[i] + "========" + string);
            tempData.add(new TempData(array[i], string));
        }

        pinyinComparator = new PinyinComparator();
        // 根据a-z进行排序源数据
        Collections.sort(tempData, pinyinComparator);//参数为排序的数据和规则

    }
}
