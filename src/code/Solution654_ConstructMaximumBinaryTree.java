package code;

/**
 * @description:
 * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
 *
 * 二叉树的根是数组 nums 中的最大元素。
 * 左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
 * 右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
 * @author: chanwahkit
 * @time: 2021/2/22 18:41
 * @level: medium
 * @solution: 分别对左右子树进行递归生成
 */

public class Solution654_ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0 ,nums.length-1);
    }
    public TreeNode constructMaximumBinaryTree(int[] nums, int begin, int end) {
        if(begin>end){
            return null;
        }
        int location = findLocation(nums, begin, end);
        TreeNode root = new TreeNode(nums[location]);
        root.left = constructMaximumBinaryTree(nums, begin, location-1);
        root.right = constructMaximumBinaryTree(nums, location+1, end);
        return root;
    }

    public int findLocation(int[] nums, int begin ,int end){
        int location = begin;
        for(int i = begin; i <= end; i++){
            if(nums[location]< nums[i]){
                location = i;
            }
        }
        return location;
    }
}
