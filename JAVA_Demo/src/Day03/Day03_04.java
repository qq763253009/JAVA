package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/6 12:19 上午
 */
public class Day03_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = input.nextInt();
        if ((year%4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
        int one;
        int a =20;
        if (a == 10){
            one = 100;
        }else {
            one = 1000;
        }
        System.out.println(one);
    }
}