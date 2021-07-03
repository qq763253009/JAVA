package Day02;

public class HomeWork8 {
    public static void main(String[] args){
        int x = 20;
        int y = 40;
        int z = 100;
        //条件判断的结果是true，条件运算符整体结果为结果x，赋值给变量。
        int max = x > y ? x:y;
        System.out.println(max);
        //判断条件的结果是false，条件运算符整体结果为结果z，赋值给变量。
        max = max > z ? max:z;
        System.out.println(max);


    }
}
