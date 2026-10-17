import java.util.HashMap;
import java.util.Map;

public class Solution3 {

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
        Solution3 solution = new Solution3();

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
