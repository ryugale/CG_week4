import java.util.Arrays;
import java.util.Random;

public class SortBenchmark {

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nDataset size: " + size);
            int[] original = generateRandomArray(size);

            if (size <= 10_000) { 
                int[] bubbleArray = Arrays.copyOf(original, original.length);
                long start = System.nanoTime();
                bubbleSort(bubbleArray);
                long end = System.nanoTime();
                System.out.printf("Bubble Sort Time: %.3f ms%n", (end - start) / 1_000_000.0);
            } else {
                System.out.println("Bubble Sort Time: Unfeasible");
            }

            int[] mergeArray = Arrays.copyOf(original, original.length);
            long start = System.nanoTime();
            mergeSort(mergeArray);
            long end = System.nanoTime();
            System.out.printf("Merge Sort Time: %.3f ms%n", (end - start) / 1_000_000.0);

            int[] quickArray = Arrays.copyOf(original, original.length);
            start = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            end = System.nanoTime();
            System.out.printf("Quick Sort Time: %.3f ms%n", (end - start) / 1_000_000.0);
        }
    }

    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        return rand.ints(size, 0, size * 10).toArray();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}