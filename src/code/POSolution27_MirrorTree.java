package code;

/**
 * @description: 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *   4
 *  /  \
 *  2   7
 * / \  / \
 * 1  3 6  9
 * 镜像输出：
 *
 *   4
 *  /  \
 *  7   2
 * / \  / \
 * 9  6 3 1
 *
 * @author: chanwahkit
 * @time: 2021/2/22 21:19
 * @level: easy
 * @solution:
 */

public class POSolution27_MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
