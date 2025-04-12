import java.util.*;

public class SearchWord {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("The quick brown fox jumps over the lazy dog.","Java is a versatile programming language.","Artificial intelligence is fascinating.","Practice makes perfect.");
        String target = "Practice";
        System.out.println(serachWord(sentences, target));
    }

    static String serachWord(List<String> sentences, String target) {
        for (String sentence : sentences) {
            if (sentence.contains(target)) {
                return sentence;
            }
        }
        return "Not Found ";
    }
}