package DivideAndConquer;

class MergeSort {
    static void mergesort(int si, int ei, int arr[]) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        mergesort(si, mid, arr);        // left
        mergesort(mid + 1, ei, arr);    // right
        merge(si, ei, mid, arr);        // merge
    }

    static void merge(int si, int ei, int mid, int arr[]) {
        int temp[] = new int[(ei - si) + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) 
                temp[k++] = arr[i++];
            else 
                temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        // Copy back to the original array
        for (k=0,i=si; k< temp.length;i++,k++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 3, 9, 2, 0, 4, 1, 7};
        mergesort(0, arr.length - 1, arr);

        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}