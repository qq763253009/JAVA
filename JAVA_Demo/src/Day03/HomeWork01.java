package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/7 12:59 下午
 */
public class HomeWork01 {
    public static void main(String[] args){
        System.out.println("从键盘输入一个整数");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("该数字是偶数");
        }else {
            System.out.println("该数字是奇数");
        }
    }
}