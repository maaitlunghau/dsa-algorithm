package p01_two_sum;

import java.util.Arrays;

public class BruteForce {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[0];
    }

    static void main(String[] args) {
        BruteForce solution = new BruteForce();

        int[] numsA = { 2, 7, 11, 15 };
        int targetA = 9;
        System.out.println("Result A: " + Arrays.toString(solution.twoSum(numsA, targetA)));

        int[] numsB = { 3, 2, 4 };
        int targetB = 6;
        System.out.println("Result B: " + Arrays.toString(solution.twoSum(numsB, targetB)));

        int[] numsC = { 3, 3 };
        int targetC = 6;
        System.out.println("Result C: " + Arrays.toString(solution.twoSum(numsC, targetC)));
    }
}
