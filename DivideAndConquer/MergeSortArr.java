package DivideAndConquer;

public class MergeSortArr {
    static void mergesort(String arr[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    static void merge(String arr[], int si, int ei, int mid) {
        int i = si, j = mid + 1, k = 0;

        //temporary array to store and then will be pasted on og one
        String temparr[] = new String[1 + (ei - si)];

        //merging array accouding to criteria
        while (i <= mid && j <= ei) {
            if ((int) (arr[i].charAt(0)) <= (int) (arr[j].charAt(0)))
                temparr[k++] = arr[i++];
            else
                temparr[k++] = arr[j++];
        }

        //for remaining elements
        while (i <= mid)
            temparr[k++] = arr[i++];
        while (j <= ei)
            temparr[k++] = arr[j++];

            //copying all elements from temporary array to original one
        for (int p = 0; p < temparr.length; p++) {
            arr[si + p] = temparr[p];

        }
    }

    public static void main(String[] args) {
        String arr[] = { "vidhi", "nisha", "siddhi", "drishti" };
        mergesort(arr, 0, arr.length - 1);
        mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}