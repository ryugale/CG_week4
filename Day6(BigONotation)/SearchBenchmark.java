import java.util.Arrays;
import java.util.Random;

public class SearchBenchmark {

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};
        int target = -1;

        for (int size : sizes) {
            int[] data = generateRandomArray(size);
            int[] sortedData = Arrays.copyOf(data, data.length);
            Arrays.sort(sortedData);

            System.out.println("\nDataset size: " + size);

            long start = System.nanoTime();
            linearSearch(data, target);
            long end = System.nanoTime();
            System.out.printf("Linear Search Time: %.3f ms%n", (end - start) / 1_000_000.0);

            start = System.nanoTime();
            binarySearch(sortedData, target);
            end = System.nanoTime();
            System.out.printf("Binary Search Time: %.3f ms%n", (end - start) / 1_000_000.0);
        }
    }

    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10); 
        }
        return arr;
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}