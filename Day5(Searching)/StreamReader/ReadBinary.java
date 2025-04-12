import java.io.*;

public class ReadBinary {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream("/mnt/D/Programming/CG/README.md");
            InputStreamReader input = new InputStreamReader(file);
            BufferedReader buffer = new BufferedReader(input);
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}