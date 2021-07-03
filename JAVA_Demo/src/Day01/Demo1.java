package Day01;

public class Demo1 {
    public static void main(String[] args) {
        String name ="打工人";
        int myAge = 24;
        String gender = "男";
        System.out.println("你好，"+name+",我的年龄"
                +myAge+",\n目前在北京");
        System.out.println("Hello world");

        // 作业 题目1
        System.out.println("善学如春起之苗");
        System.out.println("不见其增，日有所长");
        System.out.println("作业3");
        System.out.println("作业4");
        // 作业 题目2
        byte byte1= -128;
        System.out.println(byte1);
        float f2 = -3.14F;
        System.out.println(f2);
        double d1 = -3.4;
        double d2 = 3.4;
        System.out.println(d1);
        System.out.println(d2);

        int a = 10;
        int b = 20;
        System.out.println("这是互换前的值");
        System.out.println("互换前：");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int tmep = a;
        a = b;
        b = tmep;
        System.out.println("这是互换后的值");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x = 100;
        int y = 200;
        System.out.println("x,y的和为：" + (x+y));
        System.out.println("x,y的差为：" + (x-y));
        System.out.println("x,y的积为：" + (x*y));
        System.out.println("x,y的商为：" + (x/y));



    }
}
