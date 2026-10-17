import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];

            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[] { i, indices.get(diff) };
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

        Solution2 solution = new Solution2();

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
