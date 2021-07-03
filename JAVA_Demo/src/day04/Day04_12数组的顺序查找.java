package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/15 7:40 下午
 */
public class Day04_12数组的顺序查找 {
    public static void main(String[] args) {
        int [] nums = {66,78,98,99,101,220,30,40,55};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number =input.nextInt();
        int index = -1;   // 查找数的下标
        for (int i =0 ;i < nums.length ; i++){
            if (number == nums[i]){
                index = i;
                break;
            }
            }
        if (index == -1){
            System.out.println("没有找到这个数字");
        }else {
            System.out.println("找到了这个数字");
            System.out.println("下标是"+index);
        }
        }
}
