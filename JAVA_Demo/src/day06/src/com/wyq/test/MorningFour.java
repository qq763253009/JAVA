package day06.src.com.wyq.test;

/**
 * @author wangyuqi
 * @title
 * @Package com.wyq.test
 * @date 2021/5/27 10:07 下午
 */
public class MorningFour {
    public static void main(String[] args) {
        int [] [] one = new int[5][3]; //第一种动态声明，同时给出一维和二维的长度.
        int [] [] two = new int[3][]; // 第二种动态声明，只给出一维数组，不给二维长度
        two[0] = new int[5]; // 如果想访问二维数组元素，需要先初始化二维数组初始化
        two[1] = new int[3];
        two[2] = new int[2];

    }
}