package day06.src.com.wyq.test;

/**
 * @author wangyuqi
 * @title
 * @Package com.wyq.test
 * @date 2021/5/23 11:03 下午
 */
public class Morning_Test01 {
    public static void main(String[] args) {
        int[] nums = {11,22,335,67,888,9992,1123};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}