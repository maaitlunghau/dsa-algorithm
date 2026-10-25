package p896_monotonic_array;

public class DualFlagScan {

    public boolean isMonotonic(int[] nums) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                isAscending = false;
            }

            if (nums[i] < nums[i + 1]) {
                isDescending = false;
            }

            if (!isAscending && !isDescending) {
                return false;
            }
        }

        return isAscending || isDescending;
    }

    public static void main(String[] args) {
        DualFlagScan solution = new DualFlagScan();

        int[] nums = { 1, 2, 2, 3 };
        System.out.println("Result of example 1: " + solution.isMonotonic(nums));

        int[] nums2 = { 6, 5, 4, 4 };
        System.out.println("Result of example 2: " + solution.isMonotonic(nums2));

        int[] nums3 = { 1, 3, 2 };
        System.out.println("Result of example 3: " + solution.isMonotonic(nums3));

        int[] nums4 = { 2, 2, 2 };
        System.out.println("Result of example 4: " + solution.isMonotonic(nums4));
    }
}
