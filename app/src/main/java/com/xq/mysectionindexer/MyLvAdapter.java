package com.xq.mysectionindexer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.ArrayList;

public class MyLvAdapter extends BaseAdapter implements SectionIndexer {

    private Context context;
    private ArrayList<String> lists = new ArrayList<>();

    public MyLvAdapter(Context context, ArrayList<String> lists) {
        this.context = context;
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder myHolder;
        if (convertView == null) {
            myHolder = new MyHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false);
            myHolder.mTv = (TextView) convertView.findViewById(R.id.tv);
            myHolder.tvLetter = (TextView) convertView.findViewById(R.id.tvLetter);
            convertView.setTag(myHolder);
        } else {
            myHolder = (MyHolder) convertView.getTag();
        }

        myHolder.mTv.setText(lists.get(position));

        //根据position获取分类的首字母的Char ascii值
        int section = getSectionForPosition(position);

        //如果当前位置等于该分类首字母的Char的位置 ，则认为是第一次出现
        if(position == getPositionForSection(section)){
            myHolder.tvLetter.setVisibility(View.VISIBLE);
            myHolder.tvLetter.setText(""+lists.get(position).charAt(0));
        }else{
            myHolder.tvLetter.setVisibility(View.GONE);
        }

        return convertView;
    }

    /*=======================================================================*/
    @Override
    public Object[] getSections() {
        return new Object[0];
    }

    @Override
    public int getPositionForSection(int sectionIndex) {
        for (int i = 0; i < lists.size(); i++) {
            char c = lists.get(i).substring(0,1).charAt(0);
            System.out.println("getPositionForSection c=======" + c);
            if (c == sectionIndex) {
                System.out.println("getPositionForSection i=======" + i);
                return i;
            }
        }

        return -1;
    }

    @Override
    public int getSectionForPosition(int position) {
        String str = lists.get(position).substring(0,1);
        System.out.println("getSectionForPosition str=======" + str);
        char c = str.charAt(0);
        System.out.println("getSectionForPosition c=======" + c);
        return c;
    }
    /*=======================================================================*/

    public class MyHolder {
        private TextView mTv;
        private TextView tvLetter;
    }
}
