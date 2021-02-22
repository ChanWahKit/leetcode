package code;

/**
 * @description:
 * @author: chanwahkit
 * @time: 2021/2/22 18:18
 * @level：easy
 * @solution: 循环统计每个人的总资产，同时记录最大资产
 */

public class Solution1672_MaximumWealth {
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
}
