public class LinearSearch {

    public static int search(int[] arr, int key) {
        System.out.println("Starting Linear Search...");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Checking index " + i + ": " + arr[i]);
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return i;
            }
        }

        System.out.println("Element not found.");
        return -1;
    }
}
