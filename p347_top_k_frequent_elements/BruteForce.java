package p347_top_k_frequent_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BruteForce {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        int[] results = new int[k];
        for (int i = 0; i < k; ++i) {
            results[i] = entries.get(i).getKey();
        }

        return results;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 1, 2, 2, 3 };
        int k1 = 2;
        System.out.println("Result of example 01: " + Arrays.toString(topKFrequent(nums1, k1)));

        int[] nums2 = { 1 };
        int k2 = 1;
        System.out.println("Result of example 02: " + Arrays.toString(topKFrequent(nums2, k2)));

        int[] nums3 = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k3 = 2;
        System.out.println("Result of example 03: " + Arrays.toString(topKFrequent(nums3, k3)));
    }
}
