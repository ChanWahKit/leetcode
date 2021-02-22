package code;

/**
 * @description: 翻转二叉树，递归转换
 * @author: chanwahkit
 * @time: 2021/2/22 21:13
 * @level: easy
 * @solution:
 */

public class Solution226__InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
