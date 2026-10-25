package p242_valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class HashMapCounting {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);

            if (map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        HashMapCounting solution = new HashMapCounting();

        String s1 = "anagram";
        String t1 = "nagaram";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println("Result of example 1: " + result1);

        String s2 = "rat";
        String t2 = "car";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println("Result of example 2: " + result2);
    }
}
