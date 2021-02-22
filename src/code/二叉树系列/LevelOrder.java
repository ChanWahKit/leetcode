package code.二叉树系列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *    返回其层序遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * @author: chanwahkit
 * @time: 2021/2/21 17:10
 */

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> assist = new LinkedList();
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null){
            assist.add(root);
        }
        while (assist.size()!=0){
            List<Integer> temp = new ArrayList<>();
            for (int i = assist.size()-1; i >= 0; i--) {
                TreeNode node = assist.poll();
                temp.add(node.val);
                if(node.left!=null){
                    assist.add(node.left);
                }
                if(node.right!=null){
                    assist.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
