package com.study.wyq;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemodDay3 {
    public static void main(String[] args) {
//
//        List list = new ArrayList<>();
//        list.add(3);
//        list.add(10);
//        list.add(20);
//        for (int i = 0; i<list.getSize();i++){
//            System.out.println("集合的第"+i+"下标元素是："+list.get(i));
        Map<String,String> map = new HashMap<>();
        map.put("name","李四");
        map.put("age","20");
        System.out.println(map.get("age"));
    }
}
