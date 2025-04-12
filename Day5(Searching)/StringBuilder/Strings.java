import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.print("Enter any number to reverse: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        str.append(word);
        System.out.println("Reversed string: " + str.reverse());
    }
}