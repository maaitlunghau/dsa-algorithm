public class Solution2 {
    public int recursionBinarySearch(int[] arr, int l, int r, int target) {
        if (l >= r)
            return -1;

        int mid = l + (r - l) / 2;

        if (arr[mid] < target)
            recursionBinarySearch(arr, mid + 1, r, target);
        else
            recursionBinarySearch(arr, l, mid - 1, target);

        return 1;
    }

    public static void main(String[] args) {
        Solution2 draft = new Solution2();
        int[] arr = { -2, 5, 8, 12, 16, 23, 45, 56 };

        int resultB = draft.recursionBinarySearch(arr, 0, arr.length - 1, 45);
        System.out.println("Result of Recursion Binary Search: " + resultB);
    }
}
