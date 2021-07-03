package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/15 7:56 下午
 */
public class Day04_Practice {
    public static void main(String[] args) {

        // 在数组中找最大值
        int[] number = {11, 33, 22, 44, 78, 97, 889, 44556, 7788,};
        int max = number[0]; //假设第一个最大
        for (int i = 0; i < number.length; i++) {
            // 和后面的元素 每个都比较大小
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(max);
        System.out.println("在数组中找最大值并输出下标");
        // 在数组中找最大值并输出下标
        int[] number1 = {11, 33, 22, 44, 78, 97, 889, 44556, 7788,};
        int max1 = number1[0];
        int index = 0;
        for (int i = 0; i < number1.length; i++) {
            if (number1[i] > max1) {
                index = i;
                continue;
            }
        }
        System.out.println(index);

        System.out.println("");

    }
}
