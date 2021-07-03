package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/18 11:26 下午
 */
public class Day05_08二维数组内存分析 {
    public static void main(String[] args) {
        // 二维数组动态初始化
        String[][] stus1 = new String[3][];
        stus1[0] = new String[3];
        stus1[1] = new String[5];
        stus1[1] = new String[6];
        stus1[1][0] = "小明";
        System.out.println(stus1[1][0]);

        // 二维数组静态初始化
//        int[][] nums2;
//        nums2 = new int{{1,2,3},{1,2,3,4},{3,2,1,1}};
//
//        int[]
        //1、声明一个二维数组，并且确定行数
        //因为每一行的列数不同，这里无法直接确定列数
        int[][] arr = new int[5][];

        // 2.确定每一行的列数
        for(int i = 0; i < arr.length;i++){
    	/*
			arr[0] 的列数是1
			arr[1] 的列数是2
			arr[2] 的列数是3
			arr[3] 的列数是4
			arr[4] 的列数是5
			*/
            arr[i] = new int[i+1];
        }
        // 3.确定元素的值
        for(int i = 0 ; i <arr.length; i++){
            for(int j = 0 ; j< arr[i].length; j++){
                arr[i][j]  = i+1;
            }
        }

            //4. 遍历显示
            for(int i = 0 ; i < arr.length; i++){
                for(int j =0; j <arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}