public class Solution1 {
    public int dayThung(int[] nums, int k) {
        int l = 1;
        int r = sum(nums) / k;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (checkAns(nums, mid, k)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return r;
    }

    public int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }

    public boolean checkAns(int nums[], int mid, int k) {
        int num = 0;

        for (int i = 0; i < nums.length; ++i) {
            num += nums[i] / mid;
            if (num >= k)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution1 med = new Solution1();
        int[] arr = { 5, 7, 8, 10, 2 };
        int k = 6;

        int ans = med.dayThung(arr, k);
        System.out.println("Max length: " + ans);
    }
}
