import java.io.*;

public class WriteInFIle {

    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String userInput;
        try {
            FileWriter file = new FileWriter("/mnt/D/Programming/CG/README.md");
            while (true) {
                System.out.print(
                "Enter something or type \"exit\" to
finish: ");
 userInput = reader.readLine();
                if (userInput.equals("exit")) {
                    break;
                }
                file.write(userInput);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}