package code.二叉树系列;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 给定一棵二叉搜索树，请找出其中第k大的节点。
 * @author: chanwahkit
 * @time: 2021/2/7 15:30
 */

public class KthLargest {
    int k = 0,result = 0;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        getLargest(root);
        return this.result;
    }
    public void getLargest(TreeNode root){
        if(root==null){return;}
        getLargest(root.right);
        if(--k==0){this.result = root.val;}
        getLargest(root.left);
    }
}
