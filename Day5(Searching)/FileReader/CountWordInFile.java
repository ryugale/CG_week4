import java.io.*;

public class CountWordInFile {

    public static void main(String[] args) throws IOException {
        int count = 0;
        FileReader file = new FileReader("/mnt/D/Programming/CG/example.txt");
        BufferedReader buffer = new BufferedReader(file);
        String line, target = "ipsum";
        String[] arr;
        while ((line = buffer.readLine()) != null) {
            arr = line.split(" ");
            count = count + countWord(target, arr);
        }
        System.out.println(count);
        buffer.close();
    }

    static int countWord(String target, String[] arr) {
        int count = 0;
        for (String word : arr) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}