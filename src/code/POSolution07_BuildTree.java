package code;

/**
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，给出
 * 前序遍历 preorder =[3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * @author: chanwahkit
 * @time: 2021/2/23 10:28
 * @level: easy
 * @solution: 前序遍历的第一位可以确定为根节点，中序遍历的两侧可以确定为左右子树，前序遍历的切分可以根据中序遍历左子树的长度切分
 * 前序=root+root.left+leftSize+root.right
 * 中序=root.left+leftSize+root+root.right
 */

public class POSolution07_BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int preBegin, int preEnd,
                              int[] inorder, int inBegin, int inEnd) {
        if (preBegin > preEnd) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preBegin]);
        int index = inBegin;
        for (int i = inBegin; i < inEnd; i++) {
            if (node.val == inorder[i]) {
                index = i;
            }
        }
        int leftSize = index - inBegin;
        node.left = buildTree(preorder, preBegin + 1, preBegin + leftSize, inorder, inBegin, index);
        node.right = buildTree(preorder, preBegin + leftSize + 1, preEnd, inorder, index + 1, inEnd);
        return node;
    }
}
