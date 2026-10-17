public class Solution1 {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        int[] otherNums = { 1, 2, 3, 4 };

        Solution1 solution = new Solution1();
        boolean result = solution.hasDuplicate(nums);
        boolean otherResult = solution.hasDuplicate(otherNums);

        System.out.println("Result: " + result);
        System.out.println("Other result: " + otherResult);
    }
}