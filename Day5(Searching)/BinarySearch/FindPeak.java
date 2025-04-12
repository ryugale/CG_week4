public class FindPeak {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2, 1};
        System.out.println(findPeak(arr, 0, arr.length - 1));
    }

    static int findPeak(int[] arr, int start, int end) {
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; 
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}