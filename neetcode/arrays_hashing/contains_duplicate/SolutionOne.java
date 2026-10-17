package neetcode.arrays_hashing.contains_duplicate;

/**
 * Contains Duplication
 * Solution Three: TWO LOOP (for)
 */
public class SolutionOne {

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

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
