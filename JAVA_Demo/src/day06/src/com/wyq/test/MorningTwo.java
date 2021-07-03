package day06.src.com.wyq.test;

/**
 * @author wangyuqi
 * @title
 * @Package com.wyq.test
 * @date 2021/5/23 11:14 下午
 */
public class MorningTwo {
    public static void main(String[] args) {
        double [] nums = {11,22,333,44,5.6,7.8};
        double d = 7.8;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if(d == nums[i]){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("没有找到这个数字");
        }else{
            System.out.println("找到这个数了"+"下标是"+index);
        }
    }
}