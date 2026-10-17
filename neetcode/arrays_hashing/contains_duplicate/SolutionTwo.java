package neetcode.arrays_hashing.contains_duplicate;

import java.util.Arrays;

/**
 * Contains Duplication
 * Solution Three: ONE LOOP (for)
 */
public class SolutionTwo {

    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SolutionTwo solution = new SolutionTwo();

        // Example 1
        int[] arr1 = { 1, 2, 3, 3 };
        boolean result1 = solution.hasDuplicate(arr1);
        System.out.println("Result of example 1: " + result1);

        // Example 2
        int[] arr2 = { 1, 2, 3, 4 };
        boolean result2 = solution.hasDuplicate(arr2);
        System.out.println("Result of example 2: " + result2);

        if (result1 & !result2) {
            System.out.println("\n✅ Passed");
        } else {
            System.out.println("\n❌ Wrong in something");
        }
    }
}
