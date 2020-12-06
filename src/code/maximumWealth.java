package code;

/**
 * 循环统计每个人的总资产，同时记录最大资产
 */
public class maximumWealth {
    public int solution(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            if (wealth > max) max = wealth;
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] arr=new int[][]{{1,2,3},{3,2,1}};
        System.out.println(new maximumWealth().solution(arr));
    }
}
