package day04;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/15 12:25 上午
 */
public class Day_04_09数组 {
    public static void main(String[] args) {
        int [] arr = new int[5];// 数组的动态声明 ,只分配了数组的空间，没有为数组元素赋值
        int [] arr1 = {1,2,3,4,5,6,80,88,99}; // 数组的静态声明，分配数组内存空间的同时，为每个元素赋值
        System.out.println(arr1[0]);
        System.out.println(arr1.length);
    }
}