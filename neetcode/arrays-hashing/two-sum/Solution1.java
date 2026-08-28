import java.util.Arrays;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        // Example 1
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;
        System.out.println("Example 1 Output: " + Arrays.toString(solution.twoSum(nums, target)));

        // Example 2
        int[] nums2 = { 4, 5, 6 };
        int target2 = 10;
        System.out.println("Example 2 Output: " + Arrays.toString(solution.twoSum(nums2, target2)));

        // Example 3
        int[] nums3 = { 5, 5 };
        int target3 = 10;
        System.out.println("Example 3 Output: " + Arrays.toString(solution.twoSum(nums3, target3)));

    }
}
