public class Main1 {

    // A function that returns the sum from 0 to n
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10000000;

        // Calculate the time taken by findSum()
        long startTime = System.nanoTime();
        findSum(n);
        long endTime = System.nanoTime();

        double timeTaken = (endTime - startTime) / 1e9; // convert nanoseconds to seconds
        System.out.printf("findSum(int n) took %.6f seconds to execute\n", timeTaken);
    }
}

