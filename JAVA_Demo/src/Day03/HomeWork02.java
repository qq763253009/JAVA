package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/7 1:08 下午
 */
public class HomeWork02 {
    public static void main(String[] agrs){
        Scanner determineType = new Scanner(System.in);
        System.out.println("请输入一个字符");
        //输入单个字符
        char c = determineType.next().charAt(0);
        if (c >= '0' && c <= '9'){
            System.out.println("输入的是一个数字");
        }else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ){
            System.out.println("输入的是一个字母");
        }else {
            System.out.println(c+"输入内容非数字，也非字母");
        }
    }
}