package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/16 10:40 下午
 */
public class Day05_06冒泡排序 {
    public static void main(String[] args) {
        int[] nums = {22, 333, 555, 6667, 11, 332, 523, 77};

        // 外层循环控制比较轮次，循环次数为数组长度-1轮
        for (int i = 0; i < nums.length -1; i++) {
            // 内曾循环控制比较的次数，循环次数为数组长度-1-i，内层循环递减
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //练习



        int [] num = {99,33,55,454,12,353,213};
        // 外层循环 循环轮次
        for (int i = 0; i < num.length -1 ; i ++){
            // 内层循环 循环次数
            for(int j = 0; j < num.length -1 -i; j++){
                if(num[j] > num[j+1]){
                   int demo = num[j];
                    num[j] = num[j+1];
                    num [j+1] = demo;
                }
            }
            System.out.println(num[i]);
        }
        }
    }

