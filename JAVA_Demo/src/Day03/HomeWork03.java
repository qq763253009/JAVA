package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/7 1:17 下午
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入总价");
        double discount = 1;
        double totalPrice = input.nextDouble();
        if (totalPrice >= 500) {
            discount = 0.5;
        } else if (totalPrice >= 400 ) {
            discount = 0.6;
        } else if (totalPrice >= 300) {
            discount = 0.7;
        } else if (totalPrice >= 200 ) {
            discount = 0.7;
        }else if (totalPrice >= 0 ){
            discount = 1;
        }else {
            System.out.println("输入有误！");
        }
        System.out.println("总价：" + totalPrice);
        System.out.println("折扣：" + discount);
        System.out.println("折扣后总价：" + totalPrice*discount);

    }
}
