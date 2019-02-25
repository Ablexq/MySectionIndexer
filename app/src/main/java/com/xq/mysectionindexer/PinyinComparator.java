package com.xq.mysectionindexer;

import java.util.Comparator;

public class PinyinComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        if (o1.toLowerCase().equals("@")
                || o2.toLowerCase().equals("#")) {
            return -1;
        } else if (o1.toLowerCase().equals("#")
                || o2.toLowerCase().equals("@")) {
            return 1;
        } else {
            return o1.toLowerCase().compareTo(o2.toLowerCase());//首字母的比较
        }
    }

}