package day04;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package day04
 * @date 2021/5/13 6:59 下午
 */
public class NotesOnHomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int positive = 0;
//        int negative = 0;
//        while (true){
//            System.out.println("请输入整数（0）结束");
//            int num = input.nextInt();
//            if (num == 0){
//                break;
//            }else if (num > 0){
//                positive++;
//            }else {
//                negative++;
//            }
//        }
//        System.out.println("正数："+positive+"负数:"+negative);

        System.out.println("ATM 取款机");
        //~~~~~ ATM 取款机
        //  1、存款
        //	2、取款
        //	3、显示余额
        //	4、退出
        double balance = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("=========ATM=======");
            System.out.println("\t1、存款");
            System.out.println("\t2、取款");
            System.out.println("\t3、显示余额");
            System.out.println("\t4、退出");
            System.out.print("请选择：");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("存款的金额");
                    double money = input.nextInt();
                    balance += money;
                    break;

                case 2:
                    System.out.println("取款的余额");

                case 3:
                    System.out.println("现在的余额：" + balance);

                case 4:
                    flag = false;
                    break;
            }
        }

        //continue  **使用场景：结束本次循环，继续下一次的循环**

        for (int i = 1; i <= 10; i++) {
            //需求：不打印3的倍数
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("练习：打印1-100之间的整数，跳过7的倍数和7结尾的数");
        //练习：打印1-100之间的整数，跳过7的倍数和7结尾的数

        for (int q = 0; q <= 100; q++) {
            if (q % 7 == 0 || q % 10 == 7) {
                continue;
            }
            System.out.println(q);
        }
    }
}