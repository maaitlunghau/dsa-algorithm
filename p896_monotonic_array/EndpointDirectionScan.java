package p896_monotonic_array;

public class EndpointDirectionScan {

    public boolean isMonotonic(int[] nums) {
        boolean isAscending = nums[0] <= nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; ++i) {
            if (isAscending && nums[i] > nums[i + 1]) {
                return false;
            }

            if (!isAscending && nums[i] < nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        EndpointDirectionScan solution = new EndpointDirectionScan();

        int[] nums = { 1, 2, 2, 3 };
        System.out.println("Result of example 1: " + solution.isMonotonic(nums));

        int[] nums2 = { 6, 5, 4, 4 };
        System.out.println("Result of example 2: " + solution.isMonotonic(nums2));

        int[] nums3 = { 1, 3, 2 };
        System.out.println("Result of example 3: " + solution.isMonotonic(nums3));
    }
}
