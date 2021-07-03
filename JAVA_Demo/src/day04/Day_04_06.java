package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/14 1:30 上午
 */
public class Day_04_06 {
    public static void main(String[] args){
        for (int i = 0; i< 5; i++){
            for ( int j = 0;j < 5; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    // 练习：三个班级，每个班级有四名学员，需要统计每个班级分别的平均分是多少？？
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.println("开始计算第"+i+"个班级的平均分");
            int sum = 0;
            for (int j =1; j <= 4; j++){
                System.out.println("请输入第"+i+"个班级的第"+j+"名学员第平均分");
                int score = input.nextInt();
                sum += score;
            }
            int avg = sum / 4;
            System.out.println("平均分是"+avg);

        }
    }
}