package p217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class HashSetSizeCompare {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() < nums.length;
    }

    public static void main(String[] args) {
        HashSetSizeCompare solution = new HashSetSizeCompare();

        int[] nums = { 1, 2, 3, 1 };
        System.out.println("Result of example 1: " + solution.containsDuplicate(nums));

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Result of example 2: " + solution.containsDuplicate(nums2));

        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Result of example 3: " + solution.containsDuplicate(nums3));
    }
}
