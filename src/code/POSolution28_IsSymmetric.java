package code;

/**
 * @description: 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * @author: chanwahkit
 * @time: 2021/2/22 21:18
 * @level: easy
 * @solution: 左右子树传入比较，如果值相等则正确，然后将左子树的左节点和右子树的右节点，左子树的右节点和右子树的左节点作比较相同则返回正确
 */

public class POSolution28_IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode first, TreeNode second) {
        if(first==null&&second==null){
            return true;
        }
        if(first==null||second==null){
            return false;
        }
        return first.val==second.val&&isSymmetric(first.left, second.right)&&isSymmetric(first.right, second.left);
    }
}
