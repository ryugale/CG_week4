public class TwoDBinarySearch {

    public static void main(String[] args) {
        int[][] arr
                = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int target = 15;
        int i = serach2(arr, target);
        System.out.println(i);
        int j = serachInRow(arr, target, i);
        System.out.println(i + " " + j);

    }

    static int serach2(int[][] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid = 0, result = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid][0] == target) {
                return mid; 
            }else if (arr[mid][0] < target) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int serachInRow(int[][] arr, int target, int index) {
        int start = 0;
        int end = arr[index].length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[index][mid] == target) {
                return mid;
            } else if (arr[index][mid] < target) {
                start = mid + 1; 
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}