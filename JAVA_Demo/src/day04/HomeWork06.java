package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/25 11:34 上午
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("年：");
        int year = input.nextInt();

        System.out.print("月：");
        int month = input.nextInt();

        System.out.print("日：");
        int day = input.nextInt();
        /**
         （1）先算出，这一天距离2000年1月1日是第几天
         ①第month月的day天
         ②第year年的[1,month-1]的满月
         ③从[2000,year-1]的满年天数
         （2）用总天数%5，看余数，余数是1,2,3是打鱼，4和0是晒网
         */

        int days = day;    //①第month月的day天
        //②累加[1,month-1]的满月天数
        for (int i = 0; i < month; i++) { //这个i代表月份
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 31;
            }
        }
        //③从[2000,year-1]的满年天数

        for (int i = 2000; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }
        if (days % 5 == 1 || days % 5 == 2 || days % 5 == 3) {
            System.out.println("打鱼");
        } else {
            System.out.println("晒网");
        }
    }
}