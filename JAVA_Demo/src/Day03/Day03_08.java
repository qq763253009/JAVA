package Day03;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/6 10:52 下午
 */
public class Day03_08 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100){
            sum += i;
            i++;
        }
            System.out.println(sum);
        System.out.println("_______________________");

        int j = 1;
        while (j <= 100) {
            if (j % 3 == 0 && j % 7 == 0) {
                System.out.println(j);
            }
            j++;
        }
        System.out.println("——-----------------------");
        //练习 找到100～999之间的水仙花数
        int s = 100;
        while (s < 1000){
            int ge = s % 10;
            int shi = s / 10 % 10;
            int bai = s / 100;
            int he = ge * ge * ge + shi * shi * shi + bai* bai * bai;
          if (he == s){
              System.out.println(s);
          }
            s++;
        }
        // 数列练习 1 1 2 3 5 8 13 21 34 55 89 144
        int a = 1;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int l = 1;
        while (l <= 10){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            l++;
        }

    }
}