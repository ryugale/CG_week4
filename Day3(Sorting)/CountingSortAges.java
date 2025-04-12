public class CountingSortAges {
    public static void main(String[] args) {
        int[] a = {12, 14, 11, 13, 14, 12, 10};
        int[] c = new int[19];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        int i = 0;
        for (int j = 10; j <= 18; j++) {
            while (c[j]-- > 0) {
                a[i++] = j;
            }
        }
        for (int x : a) {
            System.out.print(x + " ");
        }

        
    }   
}
