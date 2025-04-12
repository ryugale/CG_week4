public class QuickSortPrices {
    public static void main(String[] args) {
        int[] a = {800, 400, 600, 200, 1000};
        quick(a, 0, a.length - 1);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void quick(int[] a, int l, int r) {
        if (l < r) {
            int p = part(a, l, r);
            quick(a, l, p - 1);
            quick(a, p + 1, r);
        }
    }

    static int part(int[] a, int l, int r) {
        int p = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] < p) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[r];
        a[r] = t;
        return i + 1;
    }
}