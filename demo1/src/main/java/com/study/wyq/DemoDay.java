package com.study.wyq;

public class DemoDay {

    public static void main(String[] args) {
        int c = add(false,4,8);
        System.out.println(c);
    }

    public static int add(boolean flag,int a, int b) {
            if (flag==true) {
                int sum = 0;
                sum = a + b;
                return sum;
            }
            else {
                int cs =0;
                cs =a-b;
                return cs;
            }

    }
}
        /*

        int i = 1;
        boolean falg = true;

        System.out.println(i);
        System.out.println(falg);


        int sum=0;
       for (int e=1;e<=5;e++){
        sum = sum+e;
           System.out.println(sum);


*/

/*
        int a = 20;
        while (6<a){
            System.out.println("111111");
        a--;
        }
*/
/*
        int a = 20;
        do {
            System.out.println("1111");
            a--;
        }while (6<a);
*/
