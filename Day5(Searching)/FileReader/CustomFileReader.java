import java.io.*;

public class CustomFileReader {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("/mnt/D/Programming/CG/example.txt");
        BufferedReader buffer = new BufferedReader(file);
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }
        buffer.close();

    }
}