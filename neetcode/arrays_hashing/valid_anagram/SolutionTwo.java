package neetcode.arrays_hashing.valid_anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram
 * Solution Two: Two loop (for) with two Map (HashMap)
 */
public class SolutionTwo {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        SolutionTwo solution = new SolutionTwo();

        String s1 = "racecar";
        String t1 = "carrace";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println("Result of example 1: " + result1);

        String s2 = "jar";
        String t2 = "jam";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println("Result of example 2: " + result2);

        String s3 = "x";
        String t3 = "x";
        boolean result3 = solution.isAnagram(s3, t3);
        System.out.println("Result of example 3: " + result3);

        if (result1 == true && result2 == false && result3 == true) {
            System.out.println("\nPass Solution");
        } else {
            System.out.println("\nFailed Solution!");
        }
    }
}
