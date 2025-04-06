import java.util.Stack;

public class ArrayStack {

    // Function to reverse array using a stack
    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements to the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements back into the array to reverse it
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to next line
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArrayUsingStack(arr);

        System.out.print("Reversed Array: ");
        printArray(arr);
    }
}
        

