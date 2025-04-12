import java.util.*;

public class DataStructureSearchBenchmark {

    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};
        int target = -1; 

        for (int size : sizes) {
            System.out.println("\nDataset size: " + size);
            int[] array = generateRandomArray(size);
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int num : array) {
                hashSet.add(num);
                treeSet.add(num);
            }
            long start = System.nanoTime();
            arraySearch(array, target);
            long end = System.nanoTime();
            System.out.printf("Array Search Time: %.3f ms%n", (end - start) / 1_000_000.0);

      
            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.printf("HashSet Search Time: %.3f ms%n", (end - start) / 1_000_000.0);

      
            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.printf("TreeSet Search Time: %.3f ms%n", (end - start) / 1_000_000.0);
        }
    }

    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        return rand.ints(size, 0, size * 10).toArray();
    }

    static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
}
