import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        int[] otherNums = { 1, 2, 3, 4 };

        Solution3 solution = new Solution3();
        boolean result = solution.hasDuplicate(nums);
        boolean otherResult = solution.hasDuplicate(otherNums);

        System.out.println("Result: " + result);
        System.out.println("Other result: " + otherResult);
    }
}
