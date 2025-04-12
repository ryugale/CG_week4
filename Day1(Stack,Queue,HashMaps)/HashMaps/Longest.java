import java.util.HashSet;

public class Longest {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);

            }
        }

        System.out.println("Longest consecutive sequence length: "
                + longest);
    }
}