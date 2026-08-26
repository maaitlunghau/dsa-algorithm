import java.util.Arrays;

public class Solution2 {

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
        int[] nums = { 1, 2, 3, 3 };
        int[] otherNums = { 1, 2, 3, 4 };

        Solution2 solution = new Solution2();
        boolean result = solution.hasDuplicate(nums);
        boolean otherResult = solution.hasDuplicate(otherNums);

        System.out.println("Result: " + result);
        System.out.println("Other result: " + otherResult);
    }
}
