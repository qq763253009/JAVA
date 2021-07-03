package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/16 7:07 下午
 */

// 5.4  使用for和while分别计算1—100的所有偶数之和
public class Day05_Morning_Test {
    public static void main(String[] args) {
        int sum = 0;
        //1.循环变量的定义；循环条件的判断；循环条件的改变
        for (int i = 0; i <= 100; i++) {
            // 判读i 是否能被2整除
            if (i % 2 == 0) {
                //把被整除的数字 相加赋值给sum
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("------------------------");



        // while 循环版本
        sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println("------------------------");





        // 使用三种不同的方式声明一个长度为5的int型输入并为数组元素赋值，使用循环便利输出。
        int [] one = new int[5];
        one [0] = 1; // 数组名[下标]访问数组元素，为元素赋值
        one [1] = 2;
        one [2] = 3;
        one [3] = 4;
        one [4] = 5;

        int [] two ={11,22,33,44,66,77}; //静态声明，声明数组的同时，为每一个元素赋值, 数组的长度为元素的个数

        int [] three;
        three = new int[]{11,22,33,45,66,77,88}; //静态声明，可以断成2句声明

        for (int l = 0; l < one.length; l++){
            System.out.println(one[l]);
        }
    }
}