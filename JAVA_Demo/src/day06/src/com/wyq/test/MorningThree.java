package day06.src.com.wyq.test;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package com.wyq.test
 * @date 2021/5/23 11:22 下午
 */
public class MorningThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入第"+(i+1)+"个名字");
            names[i] =input.next();
        }

        for (int i =names.length-1 ; i >=0 ;i--){

            System.out.println(names[i]);

        }
    }
}