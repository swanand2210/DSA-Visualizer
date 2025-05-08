import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        System.out.println("Starting Selection Sort...");

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                System.out.println("Swapping " + arr[i] + " and " + arr[minIndex]);
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            System.out.println("Array after pass " + (i + 1) + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
