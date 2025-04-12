public class InsertionSortIDs {
    public static void main(String[] args) {
        int[] a = {105, 101, 109, 102, 108};
        for (int i = 1; i < a.length; i++) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}