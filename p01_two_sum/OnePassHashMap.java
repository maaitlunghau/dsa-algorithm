package p01_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OnePassHashMap {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];

            if (indices.containsKey(diff)) {
                return new int[] { i, indices.get(diff) };
            }

            indices.put(nums[i], i);
        }

        return new int[0];
    }

    static void main(String[] args) {
        OnePassHashMap solution = new OnePassHashMap();

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
