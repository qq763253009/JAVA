package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/18 12:18 下午
 */
public class Day05_07二维数组 {
    public static void main(String[] args) {
        // 三种形式
        String [][] one = new String[5][3];
//变量类型[][] 变量名 = new 变量类型 [][];
        String two[][];  // 不推荐使用
        String[] three[];//不推荐使用

        System.out.println("----------------");
        String[][] stus = new String[4][3];// 动态声明二维数组

        // 二维数组的一维元素是另外一个数组
        stus[0] = new String[3];

        stus[0][0] = "Tom";
        stus[0][1] = "22";
        stus[0][2] = "男";

        stus[1][0] = "Jerry";
        stus[1][1] = "24";
        stus[1][2] = "男";

        stus[2][0] = "Mary";
        stus[2][1] = "22";
        stus[2][2] = "女";

        System.out.println("姓名\t年龄\t性别");
        for (int i = 0; i < stus.length; i++){
            for (int j = 0; j < stus[i].length; j++) {
                System.out.print(stus[i][j]+"\t");
            }
            System.out.println();
        }

        // 二维数组在创建的时候，必须给出一维的长度，但是二维的长度可以给，也可以不给
        String[][] stus1 = new String[3][];

        stus1[0] = new String[3]; // 给出一段元素初始化有长度的数组
        stus1[1] = new String[5];
        stus1[1][0] = "小明";


        System.out.println(stus1[1][0]);

        // 遍历数组


    }
}