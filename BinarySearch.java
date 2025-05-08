public class BinarySearch {

    public static int search(int[] arr, int key) {
        System.out.println("Starting Binary Search...");

        int start = 0, end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            System.out.println("Checking middle index " + mid + ": " + arr[mid]);

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return mid;
            } else if (arr[mid] < key) {
                System.out.println("Searching right half...");
                start = mid + 1;
            } else {
                System.out.println("Searching left half...");
                end = mid - 1;
            }
        }

        System.out.println("Element not found.");
        return -1;
    }
}
