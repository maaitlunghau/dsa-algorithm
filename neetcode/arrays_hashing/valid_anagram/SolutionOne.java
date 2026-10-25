package neetcode.arrays_hashing.valid_anagram;

import java.util.Arrays;

/**
 * Valid Anagram
 * Solution One: Compare equals with Arrays
 */
public class SolutionOne {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1); // aaccerr
        System.out.println(arr2); // aaccerr

        // Tại sao khi print char[] nhưng console vẫn hiển thị như một String ?
        // - Là vì cơ chế có sẵn của Java (Java có cách xử lí đặc biệt khi in char[])
        // - System.out.println() có overload nhận tham số kiểu char[].
        // - Khi truyền arr1 vào, Java sẽ in các ký tự trong mảng liên tiếp nhau,
        // - thay vì hiển thị cấu trúc mảng.

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

        String s1 = "racecar";
        String t1 = "carrace";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println("\nResult of example 1: " + result1);

        String s2 = "jar";
        String t2 = "jam";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println("\nResult of example 2: " + result2);

        String s3 = "x";
        String t3 = "x";
        boolean result3 = solution.isAnagram(s3, t3);
        System.out.println("\nResult of example 3: " + result3);

        if (result1 == true && result2 == false && result3 == true) {
            System.out.println("\nPass Solution");
        } else {
            System.out.println("\nFailed Solution!");
        }
    }
}
