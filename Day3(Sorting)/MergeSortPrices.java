public class MergeSortPrices {
    public static void main(String[] args) {
        int[] a = {300, 150, 200, 100, 250};
        sort(a, 0, a.length - 1);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] x = new int[n1];
        int[] y = new int[n2];
        for (int i = 0; i < n1; i++) {
            x[i] = a[l + i];
        }
        for (int j = 0; j < n2; j++) {
            y[j] = a[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (x[i] <= y[j]) {
                a[k++] = x[i++];
            } else {
                a[k++] = y[j++];
            }
        }
        while (i < n1) {
            a[k++] = x[i++];
        }
        while (j < n2) {
            a[k++] = y[j++];
        }
    }
}