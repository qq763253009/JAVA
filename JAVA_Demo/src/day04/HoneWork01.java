package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/18 1:19 上午
 */
public class HoneWork01 {
    public static void main(String[] args) {
        int i = 0;
        int i2 = 10;
        while (i < 5) {
            i++;
            i2++;
            if (i >= 2 || i2 < 15) {
                System.out.println(i);
                System.out.println(i2);
            }
        }
        while (i2 < 20) {
            i++;
            i2++;
            if (i > 8 || i2 < 18) ;
            System.out.println(i);
            System.out.println(i);

        }
    }
}