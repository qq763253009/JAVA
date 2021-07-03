package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/8 1:34 下午
 */
public class Day03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  word;
        boolean flag; //flag 继续循环
        do { //先执行后判断，适用于循环条件依赖循环操作的情况
            flag = false;
            System.out.println("请输入一个单词");
            word = input.next();
            if (!word.equals("exit")){
                System.out.println("您当前输入的单词是："+word);
                flag = true;
            }else {
                System.out.println("程序结束");
            }
        }while (flag);

    }
}