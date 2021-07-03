package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/10 1:13 下午
 */
public class Morning_04_Test_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = input.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("可以被3整除，也可以被5整除");
        } else {
            System.out.println("不可以同时被3，5整除");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("请输入一个分数");
        int score = input.nextInt();
        if (score > 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        int z = 100;
        while (z <= 999) {
            int ge = z % 10;
            int shi = z / 10 % 10;
            int bai = z / 100;
            int he = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (he == z) {
                System.out.println(z);
            }
            z++;
        }
    }

}