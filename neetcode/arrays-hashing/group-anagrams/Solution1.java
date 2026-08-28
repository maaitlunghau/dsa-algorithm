import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortKey = new String(chars);

            if (!map.containsKey(sortKey)) {
                map.put(sortKey, new ArrayList<>());
            }

            map.get(sortKey).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Example 1
        String[] strs1 = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println("Example 1 Output: " + solution.groupAnagrams(strs1));

        // Example 2
        String[] strs2 = { "x" };
        System.out.println("Example 2 Output: " + solution.groupAnagrams(strs2));

        // Example 3
        String[] strs3 = { "" };
        System.out.println("Example 3 Output: " + solution.groupAnagrams(strs3));
    }
}
