package code.一维数组的动态和1480;

/**
 * 用了递归，效果不好
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        System.out.println(getSum(nums.length-1,nums, result));
        return result;
    }

    public Integer getSum(int n, int[] nums, int[] result) {
        if (n == 0) {
            result[n] = nums[0];
            return nums[0];
        }else {
            int temp = nums[n]+getSum(n-1, nums, result);
            result[n] = temp;
            return temp;
        }
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        new RunningSum().runningSum(nums);
    }
}
