package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/6 10:00 下午
 */
public class Day03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入0-100分");
        int score = input.nextInt();
        if (score >= 90){
            System.out.println("优秀");
        }else if (score >= 80){
            System.out.println("良好");
        }else if (score >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}