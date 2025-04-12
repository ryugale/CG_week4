public class StringConcatBenchmark {

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nOperations Count: " + size);
            if (size <= 10_000) {
                long start = System.nanoTime();
                String str = "";
                for (int i = 0; i < size; i++) {
                    str += "a";
                }
                long end = System.nanoTime();
                System.out.printf("String Time: %.3f ms%n", (end - start) / 1_000_000.0);
            } else {
                System.out.println("String Time: Unusable (O(N²))");
            }
            long start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append("a");
            }
            long end = System.nanoTime();
            System.out.printf("StringBuilder Time: %.3f ms%n", (end - start) / 1_000_000.0);

            start = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sbuf.append("a");
            }
            end = System.nanoTime();
            System.out.printf("StringBuffer Time: %.3f ms%n", (end - start) / 1_000_000.0);
        }
    }
}