package neetcode.stack.valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Valid Parentheses
 * Solution One: Using Deque with Map (HashMap)
 */
public class SolutionOne {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(
                ')', '(',
                '}', '{',
                ']', '[');

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) { // NGOẶC ĐÓNG
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            } else { // NGOẶC MỞ
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        SolutionOne solution = new SolutionOne();

        String s = "[]";
        boolean result1 = solution.isValid(s);
        System.out.println("Result of example 1: " + result1);

        String s2 = "([{}])";
        boolean result2 = solution.isValid(s2);
        System.out.println("Result of example 2: " + result2);

        String s3 = "[(])";
        boolean result3 = solution.isValid(s3);
        System.out.println("Result of example 3: " + result3);

        if (result1 == true && result2 == true && result3 == false) {
            System.out.println("\nPass Solution");
        } else {
            System.out.println("\nFailed Solution!");
        }
    }
}
