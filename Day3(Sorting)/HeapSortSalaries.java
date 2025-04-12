public class HeapSortSalaries {
    public static void main(String[] args) {
        int[] a = {50000, 30000, 70000, 40000, 60000};
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(a, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heap(a, i, 0);
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void heap(int[] a, int n, int i) {
        int b = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && a[l] > a[b]) {
            b = l;
        }
        if (r < n && a[r] > a[b]) {
            b = r;
        }
        if (b != i) {
            int t = a[i];
            a[i] = a[b];
            a[b] = t;
            heap(a, n, b);
        }
    }
}