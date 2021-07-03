package Day02;

public class HomeWork7 {
    public static void main(String[] args){
        int week = 2;
        week += 100;
        week %= 7;
        System.out.println("今天是周2,100天以后是周" + (week==0?"日":week));


    }
}
