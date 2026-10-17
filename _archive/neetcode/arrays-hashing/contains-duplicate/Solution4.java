import java.util.HashSet;
import java.util.Set;

public class Solution4 {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() < nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        int[] otherNums = { 1, 2, 3, 4 };

        Solution4 solution = new Solution4();
        boolean result = solution.hasDuplicate(nums);
        boolean otherResult = solution.hasDuplicate(otherNums);

        System.out.println("Result: " + result);
        System.out.println("Other result: " + otherResult);
    }
}
