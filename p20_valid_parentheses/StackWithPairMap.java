package p20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class StackWithPairMap {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(
                ')', '(',
                '}', '{',
                ']', '[');

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackWithPairMap solution = new StackWithPairMap();

        String s = "()";
        System.out.println("Result of example 1: " + solution.isValid(s));

        String s2 = "()[]{}";
        System.out.println("Result of example 2: " + solution.isValid(s2));

        String s3 = "(]";
        System.out.println("Result of example 3: " + solution.isValid(s3));

        String s4 = "([])";
        System.out.println("Result of example 4: " + solution.isValid(s4));

        String s5 = "([)]";
        System.out.println("Result of example 5: " + solution.isValid(s5));
    }
}
