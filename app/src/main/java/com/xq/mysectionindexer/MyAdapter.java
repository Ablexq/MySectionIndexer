//package com.xq.mysectionindexer;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.SectionIndexer;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//
//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> implements SectionIndexer {
//
//    private Context context;
//    private ArrayList<String> lists = new ArrayList<>();
//
//    public MyAdapter(Context context, ArrayList<String> lists) {
//        this.context = context;
//        this.lists = lists;
//    }
//
//    @Override
//    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false));
//    }
//
//    @Override
//    public void onBindViewHolder(MyHolder holder, int position) {
////        System.out.println("onBindViewHolder========" + lists.get(position));
//        holder.mTv.setText(lists.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return lists.size();
//    }
//
//    /*==========================================================================*/
//    @Override
//    public Object[] getSections() {
//        return new Object[0];
//    }
//
//    @Override
//    public int getPositionForSection(int sectionIndex) {
//        for (int i = 0; i < lists.size(); i++) {
//            char c = lists.get(i).charAt(0);
//            System.out.println("getPositionForSection c=======" + c);
//            if (c == sectionIndex) {
//                System.out.println("getPositionForSection i=======" + i);
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//    @Override
//    public int getSectionForPosition(int position) {
//        String str = lists.get(position);
//        System.out.println("getSectionForPosition str=======" + str);
//        char c = str.charAt(0);
//        System.out.println("getSectionForPosition c=======" + c);
//        return c;
//    }
//
//    /*===========================================================================*/
//
//    public class MyHolder extends RecyclerView.ViewHolder {
//
//        private TextView mTv;
//
//        public MyHolder(View itemView) {
//            super(itemView);
//
//            mTv = ((TextView) itemView.findViewById(R.id.tv));
//        }
//    }
//
//
//}
