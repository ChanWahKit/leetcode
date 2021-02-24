package code;

import java.util.*;

/**
 * @description: 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 * 两棵树重复是指它们具有相同的结构以及相同的结点值。
 * 示例 1：
 * 1
 * / \
 * 2   3
 * /   / \
 * 4   2   4
 * /
 * 4
 * 下面是两个重复的子树：
 * <p>
 * 2
 * /
 * 4
 * 和
 * <p>
 * 4
 * 因此，你需要以列表的形式返回上述重复子树的根结点。
 * @author: chanwahkit
 * @time: 2021/2/24 10:52
 * @level: medium
 * @solution: 后序遍历序列化二叉树，记录每个子树结构
 */

public class Solution652_FindDuplicateSubtrees {
    Map<StringBuilder, Integer> distMap = new HashMap<>();
    LinkedList<TreeNode> result = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        find(root);
        return result;
    }

    public StringBuilder find(TreeNode node) {
        if (node == null) {
            return new StringBuilder("#");
        }
        StringBuilder left = find(node.left);
        StringBuilder right = find(node.right);
        StringBuilder nodeStr = left.append(",").append(right).append(",").append(node.val);
        int times = distMap.getOrDefault(nodeStr, 0);
        if (times == 1) {
            result.add(node);
        }
        distMap.put(nodeStr, ++times);
        return nodeStr;
    }
}
