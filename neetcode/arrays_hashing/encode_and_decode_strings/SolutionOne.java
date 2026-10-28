package neetcode.arrays_hashing.encode_and_decode_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Encode and Decode Strings
 * Solution One: Length prefix with '#' delimiter
 */
public class SolutionOne {

    // ["Hello", "World"] -> 5#Hello5#World -> ["Hello", "World"]

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int hash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hash));

            int start = hash + 1;
            int end = start + len;
            result.add(str.substring(start, end));

            i = end;
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> tests = Arrays.asList(
                Arrays.asList("Hello", "World"),
                Arrays.asList(""),
                new ArrayList<String>(),
                Arrays.asList("a#b", "c"),
                Arrays.asList("3#abc", "", "12#"));

        for (List<String> strs : tests) {
            String encoded = encode(strs);
            List<String> decoded = decode(encoded);
            System.out.println(strs + " -> \"" + encoded + "\" -> " + decoded
                    + "  " + (strs.equals(decoded) ? "OK" : "SAI"));
        }
    }
}
