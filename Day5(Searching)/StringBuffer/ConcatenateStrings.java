public class ConcatenateStrings {

    public static void main(String[] args) {
        String[] arr = {"Concatenate", "Strings", "Efficiently",
            "Using"};
        StringBuffer strBuffer = new StringBuffer();
        for (String str : arr) {
            strBuffer.append(str);
        }
        System.out.println(strBuffer);
    }
}