public class ConcatenateStrings2 {

    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        StringBuilder strBuilder = new StringBuilder();

        long start = System.nanoTime();
        for (int i = 1; i <= 1000000; i++) {
            strBuffer.append("Hello");
        }
        long end = System.nanoTime();
        System.out.println(
        "Time(in milliseconds) taken for String Buffer:
   " + (end - start) );
   
    start = System.nanoTime();
        for (int i = 1; i <= 1000000; i++) {
            strBuilder.append("Hello");
        }
        end = System.nanoTime();
        System.out.println(


    "Time(in milliseconds) taken for String Builder:
   " + (end - start) );
    }
   }