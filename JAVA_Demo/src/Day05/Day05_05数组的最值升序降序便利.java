package Day05;

import java.lang.reflect.Array;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/16 8:39 下午
 */
public class Day05_05数组的最值升序降序便利 {
    // 找出数组中最大值
    public static void main(String[] args){
        int [] nums = {11,22,33,55,66,11,22,3344};
        int max = nums[1];
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println("-----------------");



        // 找最值 及其下标
        int [] nums1 = {11,22,33,13,55,15,788,12,22};
        int max1 = nums [0];
        int index = 0;
        for (int i =1; i < nums1.length; i++){
            if (max1 < nums1[i]){
                max1 = nums1[i];
                index = i;
            }
        }
        System.out.println(max1+"数组下标是"+index);
    }
}