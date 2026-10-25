package p49_group_anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedKeyHashMap {

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
        SortedKeyHashMap solution = new SortedKeyHashMap();

        String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println("Result of example 1: " + solution.groupAnagrams(strs1));

        String[] strs2 = { "" };
        System.out.println("Result of example 2: " + solution.groupAnagrams(strs2));

        String[] strs3 = { "a" };
        System.out.println("Result of example 3: " + solution.groupAnagrams(strs3));
    }
}
