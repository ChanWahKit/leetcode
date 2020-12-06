package code.一维数组的动态和1480;

import java.util.Arrays;

/**
 * 常规解法，结果数组result,第n个元素等于result[n-1]+nums[n]
 */
public class RunningSumOfficial {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i]+result[i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new  int[]{1,2,3,4};
        int[] result = new RunningSumOfficial().runningSum(arr);
        assert Arrays.toString(result).equals("[1, 3, 6, 10]");
    }
}
