public class FirstNegative {

    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 8, 1, -2, 9, 10, -7};
        System.out.println(searchNegative(arr));
    }

    static int searchNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return arr[i];
            }
        }
        return -1;
    }
}