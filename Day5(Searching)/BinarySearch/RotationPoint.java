public class RotationPoint {

    public static void main(String[] args) {
        int[] arr = {11, 14, 16, 18, 20, 21, 3, 6, 8};
        System.out.println(findRotatedPoint(arr));
    }

    static int findRotatedPoint(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1; 
            }else if (arr[mid] < arr[end]) {
                end = mid; 
            }else {
                return mid;
            }
        }
        return -1;
    }
}