package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/11 3:48 下午
 */
public class HomeWork01 {
    public static void main(String[] args) {
        int sum = 0;
        // 循环变量; 循环条件; 变量++
        for ( int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);


        // 求出 1——100 之间的偶数和
        int sumto = 0;
        for (int a = 0; a <= 100; a++){
            if (a % 2 == 0){
                sumto += a;
            }
            System.out.println(a);
        }
    }

}