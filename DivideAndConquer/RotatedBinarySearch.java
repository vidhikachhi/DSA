package DivideAndConquer;

public class RotatedBinarySearch {

    static int search(int arr[], int si, int ei, int target) {
        if (si > ei) return -1;

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) return mid;

        // Check if left half is sorted
        if (arr[si] <= arr[mid]) {
            // Case: target in left half
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, si, mid - 1, target);
            } else {
                return search(arr, mid + 1, ei, target);
            }
        }
        // Else, right half must be sorted
        else {
            // Case: target in right half
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, mid + 1, ei, target);
            } else {
                return search(arr, si, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(arr, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}