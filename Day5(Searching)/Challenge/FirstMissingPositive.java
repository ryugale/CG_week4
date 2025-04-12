public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num >= 1 && num <= n) {
                if (nums[num - 1] > 0) {
                    nums[num - 1] = -nums[num - 1];
                } else if (nums[num - 1] == 0) {
                    nums[num - 1] = -(n + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 6, 8, -1, -10, 15};
        System.out.println("First missing positive: "
                + firstMissingPositive(nums));
    }
}