package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/25 11:27 上午
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int  year = input.nextInt();

        System.out.print("请输入月：");
        int month = input.nextInt();

        System.out.print("请输入日：");
        int day = input.nextInt();

        int days =day;
        for (int i =1; i<=month ; i++){
            if ( i== 4|| i==6 ||i==9|| i==11){
                days += 30;
            }else if (i ==2 ){
                if (year % 4 ==0 && year %100 != 0 || year % 400 == 0){
                    days += 29;
                }else{
                    days += 28;
                }
            }else {
                days += 31;
            }
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
    }
}