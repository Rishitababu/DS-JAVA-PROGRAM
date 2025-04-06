public class FindSum {

    // A function that returns the sum of first n natural numbers
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Record the start time
        long startTime = System.nanoTime();

        // Call the function
        findSum(10000000);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate time taken in seconds
        double timeTaken = (endTime - startTime) / 1e9;

        System.out.println("findSum(int n) took " + timeTaken + " seconds to execute");
    }
}

