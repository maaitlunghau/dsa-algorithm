package neetcode.arrays_hashing.products_of_array_except_self;

import java.util.Arrays;

/**
 * Products of Array Except Self
 * Solution Two: ONE LOOP (for) with prefix & suffix product
 */
public class SolutionTwo {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; ++i) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 6 };
        System.out.println("Result of example 01: " + Arrays.toString(productExceptSelf(nums1))); // [48, 24, 12, 8]

        int[] nums2 = { -1, 0, 1, 2, 3 };
        System.out.println("Result of example 02: " + Arrays.toString(productExceptSelf(nums2))); // [0, -6, 0, 0, 0]
    }
}
