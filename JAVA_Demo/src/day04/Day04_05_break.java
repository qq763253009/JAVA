package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/13 1:20 下午
 */
public class Day04_05_break {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            sum += i;
//            if (sum >= 30) {
//                System.out.println("当i是" + i + "的时候超过30");
//                //break 是控制自己离自己最近那个能控制的结构
//                break;// 跳出循环， 结束整个循环 代码在循环后执行
//            }
//        }
//        System.out.println(sum);
        Scanner input = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("请输入一个分数");
            int score = input.nextInt();
            if (score < 80){
                continue;
            }
            index++;
        }
        System.out.println(index);
    }

}