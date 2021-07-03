package Day05;

import java.util.Arrays;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/16 9:08 下午
 */
public class Day05 {
    public static void main(String[] args) {
        int [] nums = {22,333,555,6667,11,332,523,77};
        for(int i = nums.length -1; i >= 0; i--){
            Arrays.sort(nums);
            System.out.println(nums[i]);
        }
    }
}