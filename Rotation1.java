import java.io.*; 
class Rotation1 { 
// Function to rotate array 
static void rotate(int arr[], int d, int n) 
{ 
// Storing rotated version of array 
int temp[] = new int[n]; 
// Keeping track of the current index 
        // of temp[] 
        int j = 0; 
  
        // Storing the n - d elements of 
        // array arr[] to the front of temp[] 
        for (int i = d; i < n; i++) { 
            temp[j] = arr[i]; 
            j++; 
        } 
  
        // Storing the first d elements of array arr[] 
        // into temp 
        for (int i = 0; i < d; i++) { 
            temp[j] = arr[i]; 
            j++; 
        } 
  
        // Copying the elements of temp[] in arr[] 
        // to get the final rotated array 
        for (int i = 0; i < n; i++) { 
            arr[i] = temp[i]; 
        } 
    } 
  
    // Function to print elements of array 
    static void printTheArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int N = arr.length; 
        int d = 2; 
  
        // Function calling 
        rotate(arr, d, N); 
        printTheArray(arr, N); 
    }
}
