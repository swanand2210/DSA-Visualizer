import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== DSA Visualizer ====");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.print("Choose an option (1 to 5): ");
        int choice = sc.nextInt();

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (choice == 1 || choice == 2) {
            System.out.print("Enter the element to search: ");
            int key = sc.nextInt();

            if (choice == 1) {
                LinearSearch.search(arr, key);
            } else {
                Arrays.sort(arr);
                System.out.println("Sorted array: " + Arrays.toString(arr));
                BinarySearch.search(arr, key);
            }
        } else if (choice == 3) {
            BubbleSort.sort(arr);
        } else if (choice == 4) {
            SelectionSort.sort(arr);
        } else if (choice == 5) {
            InsertionSort.sort(arr);
        } else {
            System.out.println("Invalid option selected.");
        }

        sc.close();
    }
}
