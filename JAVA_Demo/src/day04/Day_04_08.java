package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/14 11:39 下午
 */
public class Day_04_08 {
    public static void main(String[] args) {
        // 实现等腰三角形
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 空心三角形
        System.out.println("---------------------");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i * 2 - 1; x++) {
                if (i == 6) {
                    if (x % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (x == 1 || x == i * 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        // 九九乘法表
         for (int i =1; i <= 9; i++){
             for (int j =1; j <=i; j++){
                 System.out.print(j+"*"+i+"="+(i*j)+"\t");
             }
             System.out.println();
         }
    }
}