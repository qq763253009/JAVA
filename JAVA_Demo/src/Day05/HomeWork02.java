package Day05;

/**
 * @author wangyuqi
 * @title
 * @Package Day05
 * @date 2021/5/25 7:30 下午
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pu = new String[hua.length * dian.length];
        for (int i = 0, k = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++,k++) {
                pu[k] = hua[i] + dian[j];
            }
        }
        for (int i = 1; i <= pu.length; i++) {
            System.out.print(pu[i - 1] + " ");
            if (i % 13 == 0) {
                System.out.println();
            }
        }
    }
}