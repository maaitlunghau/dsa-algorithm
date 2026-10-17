package neetcode.arrays_hashing.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * Solution Two: TWO LOOP (for) & HashMap
 */
public class SolutionTwo {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];

            if (indices.containsKey(diff)) {
                int j = indices.get(diff);

                if (i != j) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        SolutionTwo solution = new SolutionTwo();

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
