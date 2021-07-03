package Day03;

import java.util.Scanner;

/**
 * @author wangyuqi
 * @title
 * @Package Day03
 * @date 2021/5/9 10:29 下午
 */
public class HomeWork07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("年：");
        int year = input.nextInt();

        System.out.println("月：");
        int month = input.nextInt();

        System.out.println("日");
        int day = input.nextInt();

        int days = day;
        switch(month){
            case 12:
                //累加的1-11月
                days += 30;//这个30是代表11月份的满月天数
                //这里没有break，继续往下走
            case 11:
                //累加的1-10月
                days += 31;//这个31是代表10月的满月天数
                //这里没有break，继续往下走
            case 10:
                days += 30;//9月
            case 9:
                days += 31;//8月
            case 8:
                days += 31;//7月
            case 7:
                days += 30;//6月
            case 6:
                days += 31;//5月
            case 5:
                days += 30;//4月
            case 4:
                days += 31;//3月
            case 3:
                days += 28;//2月，因为2019年的2月是28天
            case 2:
                days += 31;//1月
        }

        //days 里面存的是这一天是这一年的第几天
        //已知2019年1月1日是星期二
        //假设我输入的就是1月1日，那么days中就是1
        int week = 1;//2018年12月31日的星期
        week += days;
        week %= 7;
        System.out.print(month+"月" + day +"日是这一年的第"+days+"天，是星期" + (week==0?"天":week)) ;

    }
}
