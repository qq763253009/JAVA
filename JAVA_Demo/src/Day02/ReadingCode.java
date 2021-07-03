package Day02;

public class ReadingCode {
    public static void main(String[] args){
        //第一题 定义的int整形，所以为0
        int i = 1;
        i *= 2;
        i++;
        System.out.println("i="+i);
        //第二题
        int i2 = 2;
        //将符号左边的值和右边的值进行相乘操作，最后将结果赋值给左边的变量
        i2 *= i2++;

        int j = 2;
        j *= j+1;

        int k = 2;
        k *= ++k;
        System.out.println(i2);
        System.out.println(j);
        System.out.println(k);
        //第三题
        int a = 3,b = 1;
        if(a == b){//编译报错
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //第四题 不会
        int a1 = 8, b1 = 3;
        System.out.println(a1>>>b1);//1
        System.out.println(a1>>>b1 | 2);//2

        int age = -1;
        if (age < 0){
            System.out.println("输入的数据有问题");
        }else if (age < 18){
            System.out.println("还未成年");
        }else {
            System.out.println("成年了");
        }

    }
}
