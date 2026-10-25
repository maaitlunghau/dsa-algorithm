package neetcode.arrays_hashing.group_anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group Anagram
 * Solution One: One LOOP (for) & one Map (HashMap)
 */
public class SolutionOne {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            if (!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<String>());
            }

            anagrams.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

        String[] strs1 = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println("Result of example 1: " + solution.groupAnagrams(strs1));

        String[] strs2 = { "x" };
        System.out.println("Result of example 2: " + solution.groupAnagrams(strs2));

        String[] strs3 = { "" };
        System.out.println("Result of example 3: " + solution.groupAnagrams(strs3));
    }
}
