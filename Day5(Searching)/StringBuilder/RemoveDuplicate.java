import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to remove duplicates: ");
        String str = sc.next();
        StringBuilder result = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!hs.contains(ch)) {
                hs.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}