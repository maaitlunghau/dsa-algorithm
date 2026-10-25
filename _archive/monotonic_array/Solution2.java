public class Solution2 {
    public boolean isMonotonic(int[] nums) {
        boolean isInc = true;
        boolean isDes = true;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] < nums[i + 1])
                isDes = false;

            if (nums[i] > nums[i + 1])
                isInc = false;

            if (!isInc && !isDes)
                return false;
        }

        return isInc || isDes;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] nums = { 1, 1, 1, 1 };
        System.out.println("Result: " + solution.isMonotonic(nums));
    }
}
