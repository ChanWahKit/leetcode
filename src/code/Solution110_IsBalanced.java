package code;

/**
 * @description: 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * @author: chanwahkit
 * @time: 2021/2/22 21:14
 * @level: easy
 * @solution:
 */

public class Solution110_IsBalanced {

    //自上而下
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getHeight(root.right) - getHeight(root.left)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }


    //自下而上
    public boolean isBalance(TreeNode root) {
        return find(root) != -1;
    }

    public int find(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = find(root.left);
        if (left == -1) {
            return -1;
        }
        int right = find(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right)+1 : -1;
    }
}
