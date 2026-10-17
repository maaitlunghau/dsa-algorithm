package neetcode.arrays_hashing.two_sum;

import java.util.Arrays;

/**
 * Two Sum
 * Solution One: TWO LOOP (for)
 */
public class SolutionOne {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

        // Example 1
        int[] nums1 = { 3, 4, 5, 6 };
        int target1 = 7;
        System.out.println("The indices of i and j: " + Arrays.toString(solution.twoSum(nums1, target1)));

        // Example 2
        int[] nums2 = { 4, 5, 6 };
        int target2 = 10;
        System.out.println("The indices of i and j: " + Arrays.toString(solution.twoSum(nums2, target2)));
    }
}
