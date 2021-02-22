package code;
/**
 * @description: 给定二叉树根结点root，此外树的每个结点的值要么是 0，要么是 1。
 *
 * 返回移除了所有不包含 1 的子树的原二叉树。
 *
 * ( 节点 X 的子树为 X 本身，以及所有 X 的后代。)
 * 输入: [1,null,0,0,1]
 * 输出: [1,null,0,null,1]
 * @author: chanwahkit
 * @time: 2021/2/22 21:23
 * @level: medium
 * @solution: 采用后序遍历的方法，如果节点的左子树为null而且右子树也为null的时候，如果当前节点的值=0，即该点可以做剪枝
 */
public class Solution814_pruneTree{
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right =  pruneTree(root.right);
        return root.val==0&&root.left==null&&root.right==null?null:root;
    }
}
