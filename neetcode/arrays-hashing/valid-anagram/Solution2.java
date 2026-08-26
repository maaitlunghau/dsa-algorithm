import java.util.Arrays;

public class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

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
