package com.xq.mysectionindexer;

import java.util.Comparator;

public class PinyinComparator implements Comparator<TempData> {

    public int compare(TempData o1, TempData o2) {
        if (o1.getIndex().equals("@")
                || o2.getIndex().equals("#")) {
            return -1;
        } else if (o1.getIndex().equals("#")
                || o2.getIndex().equals("@")) {
            return 1;
        } else {
            return o1.getIndex().compareTo(o2.getIndex());
        }
    }

}