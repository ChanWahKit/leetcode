package code.二叉树系列;

/**
 * @description: 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * <p>
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *
 * 递归到叶子节点上一层，从此处起，每个根节点左节点拷贝到右节点后置为null，然后进入到当前右节点的末端，将原右节点接上
 * @author: chanwahkit
 * @time: 2021/2/3 14:04
 */
public class Flatten {
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode right = root.right;

        root.right = root.left;
        root.left = null;

        TreeNode p = root;
        while (p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}
