package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 给定二叉树:[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * @author: chanwahkit
 * @time: 2021/2/22 21:23
 * @level: easy
 * @solution:
 */

public class POSolution32_LevelOrder {
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
