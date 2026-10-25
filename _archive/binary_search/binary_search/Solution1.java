public class Solution1 {

    public int basicBinarySearch(int[] arr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution1 draft = new Solution1();
        int[] arr = { -2, 5, 8, 12, 16, 23, 45, 56 };

        int resultA = draft.basicBinarySearch(arr, 0, arr.length - 1, 23);
        System.out.println("Result of Basic Binary Search: " + resultA);
    }
}
