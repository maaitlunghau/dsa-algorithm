package neetcode.arrays_hashing.products_of_array_except_self;

import java.util.Arrays;

/**
 * Products of Array Except Self
 * Solution One: TWO LOOP (for)
 */
public class SolutionOne {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            int product = 1;

            for (int j = 0; j < nums.length; ++j) {
                if (i != j) {
                    product *= nums[j];
                }
            }

            output[i] = product;
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
