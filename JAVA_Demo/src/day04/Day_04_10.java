package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/15 12:14 下午
 */
public class Day_04_10 {
    public static void main(String[] args) {
        /* 数组命名方式1,2
        int [] three = new int[5];
        int three []

        int three = new int[5];  动态声明
        int four = {44,55,66,77,88}; 静态声明1
        静态声明2 可以断成两次完成
        int[] five
        five = new int [] {44,55,66,77}
           */

        int [] nums = {11,22,33,55,66,77,88};
        for (int i  = 0;i <nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
}