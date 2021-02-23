package code;

import java.util.HashMap;
import java.util.Map;
/**
 * @description: 根据一棵树的中序遍历与后序遍历构造二叉树。
 * 你可以假设树中没有重复的元素。
 * 例如，给出
 * 中序遍历 inorder =[9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * @author: chanwahkit
 * @time: 2021/2/23 10:28
 * @level: easy
 * @solution: 与给出前序遍历+中序遍历类似，
 * 中序=root.left+leftSize+root+root.right
 * 后序=root.left+leftSize+root.right+root
 */
public class Solution106_BuildTree {
    Map<Integer,Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        getHashMap(inorder);
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode buildTree(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd){
        if(inBegin>inEnd){
            return null;
        }
        TreeNode node = new TreeNode(postorder[postEnd]);
        int index = indexMap.get(node.val);
        int size = index-inBegin;
        node.left = buildTree(inorder,inBegin,index-1,postorder,postBegin,postBegin+size-1);
        node.right = buildTree(inorder,index+1,inEnd, postorder,postBegin+size,postEnd-1);
        return node;
    }

    public void getHashMap(int[] inorder){
        for(int i = 0; i < inorder.length; i++){
            indexMap.put(inorder[i], i);
        }
    }
}
