public class ReverseArray1 {

    // Function to reverse arr[] from start to end
    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Utility that prints out an array on a line
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line after printing the array
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        printArray(arr);
        reverseArray(arr, 0, n - 1);
        System.out.println("Reversed array is:");
        printArray(arr);
    }
}

