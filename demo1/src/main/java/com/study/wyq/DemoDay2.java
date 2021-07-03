package com.study.wyq;

import java.util.HashMap;
import java.util.Map;

public class DemoDay2 {
    public static void main(String[] args) {

//        int array [] = {1,3,55,777,4,7};
//        int array [] = new int[4];
//        array[0]=1;
//        array[1]=2;
//        array[2]=3;
//        array[3]=6;
        String r[] = {"文字1","文字2","文字3"};
        for (int i = 0;i<r.length;i++){

            System.out.println("第"+i+"个元素是"+r[i]);
            Map<String,String> map = new HashMap<>();
            map.put("name","李四");
            map.put("age","20");
            System.out.println(map.get("age"));
        }
    }
}
