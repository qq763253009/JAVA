package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/5 11:05 下午
 */
public class Day03_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = input.nextInt();
        System.out.println("请输入第二个数字");
        int b = input.nextInt();
        System.out.println(a < b);
    }
}