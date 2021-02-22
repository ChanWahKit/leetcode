package code.二叉树系列;

/**
 * @description:
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * @author: chanwahkit
 * @time: 2021/2/7 14:48
 * @solve: 自上而下，以第一棵树root1作为最终结果，如果左子树为空则将root2的相应树枝剪切到root1上，右子树也是同样
 */

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){
            return root1==null?root2:root1;
        }
        root1.val = root1.val+root2.val;
        if(root1.left==null){
            root1.left = root2.left;
            root2.left = null;
        }
        if(root1.right==null){
            root1.right = root2.right;
            root2.right = null;
        }
        mergeTrees(root1.left, root2.left);
        mergeTrees(root1.right, root2.right);
        return root1;
    }

    //官方解法
    public TreeNode mergeTree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTree(t1.left, t2.left);
        merged.right = mergeTree(t1.right, t2.right);
        return merged;
    }
}
