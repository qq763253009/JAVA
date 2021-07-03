package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/15 12:28 下午
 */
public class Day_04_11数组练习 {
    public static void main(String[] args) {
        // 练习1：用一个数组存储26个小写英文字母，并遍历显示，显示要求如：a->A
        char [] arr = new char[26];
        arr[0] = 'a';
        for (int i = 1; i < arr.length; i++){
            arr[i] = (char)(arr[i-1]+1);
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]+"->"+(char)(arr[i]-32));
        }





        // 求数组总和
        int [] arrr = {11,22,33,55,66,7,88,99,44,50};
        int sum = 0;
        for (int i = 0; i < arrr.length; i++){
            sum += arrr[i];
        }
        System.out.println(sum);
        System.out.println("-----------------------");



        // 求数组平均值
        int [] arravg = {33,22,55,66,88,80,78,9};
        double sumavg = 0;
        for (int i = 0; i<arravg.length; i++){
            sumavg += arravg[i];
        }
        sumavg = sumavg / arravg.length;
        System.out.println(sumavg);
        System.out.println("---------------------");





        // 统计 奇 偶 个数
        int [] arrnumber = {33,22,55,66,88,80,78,9};
        int odd = 0;
        int even = 0;
        for (int i =0; i<arrnumber.length; i++){
            if (arrnumber[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("偶数的个数是："+even+"奇数的个数是："+odd);
    }
}