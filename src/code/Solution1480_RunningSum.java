package code;

/**
 * @description:
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * @author: chanwahkit
 * @time: 2021/2/22 17:57
 * @level: easy
 * @solution: 在原数组基础上做加法即可，注意从第1位开始
 */

class Solution1480_RunningSum {
    public int[] runningSum(int[] nums) {
        if(nums.length<=1) return nums;
        for(int i = 1; i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
