package code.二叉树系列;

/**
 * 116填充每个节点的下一个右侧节点指针
 */
public class ConnectNode {
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
