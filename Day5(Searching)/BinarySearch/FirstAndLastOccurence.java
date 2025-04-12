public class FirstAndLastOccurence {

    public static void main(String[] args) {
        int[] arr
                = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 14, 14, 14, 14, 14, 15, 16};
        int target = 3;
        int fristIndex = (serach(arr, target, "first"));
        int lastIndex = (serach(arr, target, "last"));
        System.out.println("First and last index of " + target +": ["+fristIndex+" , "+lastIndex+" ]");
    }
   
    static int serach(int[] arr, int target, String option) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int index = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                if (option.equals("first")) {
                    end = mid - 1; 
                }else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1; 
            }else {
                end = mid - 1;
            }
        }
        return index;
    }
}