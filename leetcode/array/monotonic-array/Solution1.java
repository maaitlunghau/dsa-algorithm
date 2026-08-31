public class Solution1 {
    public boolean isMonotonic(int[] nums) {
        boolean isAscending = nums[0] <= nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; ++i) {
            if (isAscending && nums[i] > nums[i + 1])
                return false;

            if (!isAscending && nums[i] < nums[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] nums = { 1, 1, 1, 1 };
        System.out.println("Result: " + solution.isMonotonic(nums));
    }
}
