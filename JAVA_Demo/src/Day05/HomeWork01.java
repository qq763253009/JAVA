package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/25 7:24 下午
 */

import java.util.Random;

/**
 * 模拟大乐透号码：
 *
 * * 一组大乐透号码由10个1-99之间的数字组成
 * * 打印大乐透号码信息
 */
public class HomeWork01 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99)+1;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}