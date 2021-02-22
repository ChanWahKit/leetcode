package code;

/**
 * @description:
 *给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

 * @author: chanwahkit
 * @time: 2021/2/22 21:24
 * @level: easy
 * @solution:
 * 对于题目描述来说：p、q可能出现的情况包括：
 * 1、pq分别位于最近祖先节点两边
 * 2、pq位于同一侧，且p是q的祖先节点
 * 3、pq位于同一侧，且q是p的祖先节点
 * 采用后序遍历，在访问到指定节点时返回
 */

public class POSolution68_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
}
