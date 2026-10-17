import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        /**
         * 1 Loop
         */
        // for (int i = 0; i < s.length(); ++i) {
        // map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        // map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        // }

        /**
         * 2 Loop
         */
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Example 1
        String s1 = "racecar", t1 = "carrace";
        System.out.println("Example 1: " + solution.isAnagram(s1, t1));

        // Example 2
        String s2 = "jar", t2 = "jam";
        System.out.println("Example 2: " + solution.isAnagram(s2, t2));

        // Example 3
        String s3 = "x", t3 = "x";
        System.out.println("Example 3: " + solution.isAnagram(s3, t3));
    }
}
