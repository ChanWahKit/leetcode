package code;

/**
 * @description:
 * @author: chanwahkit
 * @time: 2021/2/22 18:22
 * @level: medium
 * @solution: 深度优先搜索，通过visit数组标记端点是否已经遍历
 */

public class Solution547_FindCircleNum {
    public int findCircleNum(int[][] isConnected) {
        //端点数
        int point = isConnected.length;
        boolean[] visit = new boolean[point];
        int circle = 0;
        for (int i = 0; i < point; i++) {
            if (!visit[i]) {
                dfs(isConnected, visit, i);
                circle++;
            }
        }
        return circle;
    }

    private void dfs(int[][] isConnected, boolean[] visit, int begin) {
        for (int end = 0; end < isConnected.length; end++) {
            if (isConnected[begin][end] == 1 && !visit[end]) {
                visit[begin] = true;
                dfs(isConnected, visit, end);
            }
        }
    }
}
