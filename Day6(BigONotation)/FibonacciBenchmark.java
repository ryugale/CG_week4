public class FibonacciBenchmark {

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("\nFibonacci(" + n + "):");

            if (n <= 30) {
                long start = System.nanoTime();
                int result = fibonacciRecursive(n);
                long end = System.nanoTime();
                System.out.printf("Recursive Result: %d, Time: %.3f ms%n", result, (end - start) / 1_000_000.0);
            } else {
                System.out.println("Recursive Time: Unfeasible (O(2^N))");
            }

            long start = System.nanoTime();
            int result = fibonacciIterative(n);
            long end = System.nanoTime();
            System.out.printf("Iterative Result: %d, Time: %.3f ms%n", result, (end - start) / 1_000_000.0);
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}