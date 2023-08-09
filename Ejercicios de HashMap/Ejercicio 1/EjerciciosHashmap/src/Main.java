
import java.util.HashMap;
import java.util.Scanner;

//  1. Contador de Palabras:
//  Escribe un programa que reciba una cadena de texto como entrada y cuente cuántas veces aparece cada palabra en el texto.
//  Utiliza un HashMap para almacenar las palabras como claves y sus frecuencias como valores.

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Words words = new Words();
        HashMap<String, Integer> wordMap = new HashMap<>();

        System.out.println("    -> Ingrese una frase a analizar:");
        String phrase = read.next();

        String[] expression = phrase.split(" ");

        for (String word : expression) {
            String cleanWord = words.wordToLowerCase(word);
            cleanWord = words.removeNonAlphanumeric(cleanWord);

            Integer count = wordMap.get(cleanWord);
            if (count == null) {
                count = 0;
            }
            count++;
            wordMap.put(cleanWord, count);
        }
        words.printWord(wordMap);
    }
}