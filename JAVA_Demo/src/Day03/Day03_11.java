package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/8 1:24 下午
 */
public class Day03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单词");
        String word = input.next();
        while(!word.equals("exit")){
            System.out.println("当前单词是"+word);
            System.out.println("请输入一个单词");
            word = input.next();
        }
        System.out.println("程序结束");

    }
}