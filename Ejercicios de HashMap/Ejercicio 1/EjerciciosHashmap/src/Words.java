import java.util.HashMap;
import java.util.Map;

public class Words {

    public static String wordToLowerCase(String word) {
        String lowerWord = word.toLowerCase();
        return lowerWord;
    }

    public static String removeNonAlphanumeric(String word) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLetterOrDigit(letter)) {
                output.append(letter);
            }
        }
        return output.toString();
    }

    public static void printWord(HashMap<String, Integer> wordMap) {
        for (Map.Entry<String, Integer> word : wordMap.entrySet()) {
            System.out.println("\n   * Palabra: " + word.getKey()
                             + "\n   * Repeticiones: " + word.getValue());
        }
    }
}
