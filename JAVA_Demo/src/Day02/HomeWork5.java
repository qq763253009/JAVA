package Day02;

public class HomeWork5 {
    public static void main(String[] args){
        int a = 20 , b = 20;
        boolean bo = ((++a % 3) ==0) && ((++a % 3) == 0);
        System.out.println("a的值是："+a+"，bo的值是"+bo);
        boolean bo2 =((++b %3) == 0) && ((++b % 7)== 0);
        System.out.println("b的值是："+b+"，bo2的值是"+bo2);
    }
}
