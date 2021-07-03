package Day03;

import java.util.Scanner;
/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/6 10:00 下午
 */
public class Day03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int score = input.nextInt();
        switch (score){
            case 1:
                System.out.println("金牌");
                break;
            case 2:
                System.out.println("银牌");
                break;
            case 3:
                System.out.println("铜牌");
                break;
            default:
                System.out.println("谢谢参与");
                break;
        }
    }
}