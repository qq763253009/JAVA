package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/9 10:11 下午
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入方程a的参数");
        double a = input.nextDouble();

        System.out.println("请输入方程b的参数");
        double b = input.nextDouble();

        System.out.println("请输入方程c的参数");
        double c = input.nextDouble();
        if (a != 0){
            double d = b * b - 4*a*c;
            if (d > 0){
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("两个解: x1 ="+x1 + ",x2 "+ x2);
            }else if (d == 0){
                double x = -b/(2*a);
                System.out.println("一个解：x = " + x);
            }else{
                System.out.println("在实数范围内无解");
            }
        }else if ( a ==0 && b !=0){
            double x = -c/b;
            System.out.println("一个解：x = " + x);
        }else {
            System.out.println("不是方程");
        }
    }
}