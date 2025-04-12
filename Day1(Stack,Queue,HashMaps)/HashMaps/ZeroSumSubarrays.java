import java.util.HashMap;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {6, -3, 3, 4, -2, -1, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                System.out.println("Subarray found from 0 to " + i);
            }
            if (map.containsKey(sum)) {
                System.out.println("Subarray found from " + (map.get(sum)
                        + 1) + " to " + i);
            }
            map.put(sum, i);
        }
    }
}