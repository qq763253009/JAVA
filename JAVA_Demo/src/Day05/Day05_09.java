package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/21 1:31 下午
 */
public class Day05_09 {
    public static void main(String[] args) {
        int[][] nums = new int[10][]; // 初始化一维数组
        for (int i = 0; i < nums.length; i++){
            nums[i] = new int[i+1]; //初始化二维数组
            for (int j = 0 ; j < nums[i].length; j++){
                // 每行第一个元素和最后一个元素是1
                if (j == 0 || j==nums[i].length -1){
                    nums[i][j] = 1;
                }else {
                    nums[i][j] = nums[i-1][j] + nums [i-1][j-1];
                }
            }
        }
      for (int i = 0 ; i < nums.length; i++){
          for (int j = 0; j < nums[i].length; j++){
              System.out.print(nums[i][j]+"\t");
          }
          System.out.println();
      }
    }
}