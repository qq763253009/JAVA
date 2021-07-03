package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/13 12:57 下午
 */
public class Day04_04 {
    public static void main(String[] args) {
        int i = 100;
        for (;i <= 999;) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            int he = bai * bai * bai + shi * shi * shi + ge * ge * ge;
            if (he == i) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);
    }

}