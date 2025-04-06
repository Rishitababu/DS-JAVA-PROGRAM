public class ReverseArray2 {

    // Function to reverse arr[] from start to end using recursion
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // Move to the next line after printing
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr, 0, size - 1);

        System.out.println("Reversed array:");
        printArray(arr);
    }
}

