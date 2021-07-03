package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/14 8:56 下午
 */
public class Day04_07 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //  从上到下由多* 变少
        for (int i = 1; i <= 6 ; i++){
            for (int j = 1; j <= 7 - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 1; i <= 6 ; i++){
            for (int j = 1; j <= 6-i ; j++){
                System.out.print(" ");
            }
            for (int x = 1;x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}