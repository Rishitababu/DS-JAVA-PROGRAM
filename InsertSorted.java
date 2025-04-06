public class InsertSorted {
    public static int insertSorted(int[] arr, int n, int key, int capacity) {
        if (n >= capacity)
            return n;

        int i;
        
        for (i = n - 1; (i >= 0 && arr[i] > key); i--) {
            arr[i + 1] = arr[i];
        }

    
        arr[i + 1] = key;

        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[20]; 
        int[] initialValues = {12, 16, 20, 40, 50, 70};
        int n = initialValues.length;
        int key = 26;
        int capacity = arr.length;

        
        for (int i = 0; i < n; i++) {
            arr[i] = initialValues[i];
        }

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert key
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

