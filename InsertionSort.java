import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        System.out.println("Starting Insertion Sort...");

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Array after inserting " + key + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
