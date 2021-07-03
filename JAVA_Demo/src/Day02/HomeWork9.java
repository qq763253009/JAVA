package Day02;

public class HomeWork9 {
    public static void main(String[] args){
    int year = 2020 ;
    boolean  AleapYear = year%4 == 0 && year%100 !=0 || year%400 == 0;
        System.out.println(year + (AleapYear ? "是闰年" : "不是闰年"));    }
}
