import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-2, 9, 5, 1, 3, 4, 8, 9, 2, -10};
        Arrays.sort(arr);
        int target = 1;
        System.out.println(serach(arr, target));
    }

    static int serach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; 
            }else if (arr[mid] < target) {
                start = mid + 1; 
            }else {
                end = mid - 1;
            }
        }
        return -
1;

    }
}