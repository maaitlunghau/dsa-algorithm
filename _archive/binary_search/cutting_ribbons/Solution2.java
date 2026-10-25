public class Solution2 {
    public int dayThung(int n, int k, int[] nums, int l, int r) {
        int L = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (countPieces(nums, mid) >= k) {
                L = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return L;
    }

    private int countPieces(int[] nums, int L) {
        if (L == 0)
            return Integer.MAX_VALUE;

        int total = 0;
        for (int num : nums) {
            total += num / L;
        }

        return total;
    }
}
