package code;

/**
 * @description: 填充每个节点的下一个右侧节点指针
 * @author: chanwahkit
 * @time: 2021/2/22 18:33
 * @level: medium
 * @solution:
 */

public class Solution116_ConnectNode {
    public TreeNode connect(TreeNode root) {
        if(root==null){
            return null;
        }
        connectNode(root.left, root.right);
        return root;
    }

    public void connectNode(TreeNode left, TreeNode right){
        if(right==null||left==null){
            return;
        }
        left.next = right;
        connectNode(left.left,left.right);
        connectNode(right.left,right.right);
        connectNode(left.right, right.left);
    }
}
