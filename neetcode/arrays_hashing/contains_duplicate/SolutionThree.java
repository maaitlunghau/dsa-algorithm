package neetcode.arrays_hashing.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplication
 * Solution Three: Set (Version 01)
 */
public class SolutionThree {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Approach 01 (combine contains() & add() method in Set)
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SolutionThree solution = new SolutionThree();

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
