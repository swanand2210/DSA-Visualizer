import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        System.out.println("Starting Bubble Sort...");

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Pass " + (i + 1));

            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("  Comparing " + arr[j] + " and " + arr[j + 1]);

                if (arr[j] > arr[j + 1]) {
                    System.out.println("  Swapping " + arr[j] + " and " + arr[j + 1]);
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Array after pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Array is sorted early.");
                break;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
