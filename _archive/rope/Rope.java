public class Rope {

    public boolean isValid(int[] nums, int m, int k) {
        int num = 0;

        for (int i = 0; i < nums.length; ++i) {
            num += nums[i] / m;

            if (num >= k) {
                return true;
            }
        }

        return false;
    }

    public int totalArr(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        return total;
    }

    public int maxRopeLength(int[] nums, int k) {
        int l = 1;
        int r = totalArr(nums) / k;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (isValid(nums, m, k)) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Rope app = new Rope();

        int[] nums = { 5, 9, 6, 2 };
        int k = 3;

        System.out.println(app.maxRopeLength(nums, k));
    }
}
