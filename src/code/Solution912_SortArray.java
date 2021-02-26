package code;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @description: 给定数组排序
 * @author: chanwahkit
 * @time: 2021/2/25 10:34
 * @level: medium
 * @solution: 快速排序
 */

public class Solution912_SortArray {

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void sort(int[] nums, int lo, int hi) {
        /****** 前序遍历位置 ******/
        if (lo > hi) {
            return;
        }
        // 通过交换元素构建分界点 p
        int p = partition(nums, lo, hi);
        /************************/

        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= pivot) --high;
            nums[low] = nums[high];
            while (low < high && nums[low] <= pivot) ++low;
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution912_SortArray().sortArray(new int[]{1, 5, 4, 2})));
    }

}
