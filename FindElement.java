import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int size, elem;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        elem = scanner.nextInt();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = elem;
        size++; 

        System.out.print("Array after inserting element: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

