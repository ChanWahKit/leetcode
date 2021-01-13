package code.省份数量547;

public class FindCircleNum {
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

    public static void main(String[] args) {
        int[][] isConnect = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(new FindCircleNum().findCircleNum(isConnect));
    }
}
