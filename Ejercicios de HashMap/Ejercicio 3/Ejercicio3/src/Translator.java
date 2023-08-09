import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    HashMap<String, String> translation = new HashMap<>();
    //Español - Italiano

    public void addWords() {
        translation.put("Pasta", "Pasta");
        translation.put("Crema", "Panna");
        translation.put("Cafe", "Caffè");
        translation.put("Ajo", "Aglio");
        translation.put("Cebolla", "Cipolla");
        translation.put("Manzana", "Mela");
        translation.put("Tomate", "Pomodoro");
        translation.put("Helado", "Gelatto");
        translation.put("Jamon", "Prosciutto");
        translation.put("Queso", "Formaggio");
    }

    public void addWord() {
        System.out.println("    -> Ingrese la palabra en español a agregar: ");
        String wordSpanish = read.next();
        System.out.println("    -> Ingrese la traducción al Italiano: ");
        String wordItalian = read.next();

        if (translation.get(wordSpanish) != null) {
            translation.put(wordSpanish, wordItalian);
            System.out.println(" * Traduccion cargada exitosamente.");
        } else System.out.println(" * La palabra ingresada ya exitia, intentelo nuevamente.");
    }

    public void showWords() {
        System.out.println(" * Las palabras traducidas son: ");
        for (Map.Entry<String, String> wordTraslate : translation.entrySet()) {
            System.out.println("\n - Español: " + wordTraslate.getKey()
            + "\n  - Italiano: " + wordTraslate.getValue());
        }
    }

    public void deleteWord() {
        System.out.println("    -> Ingrese la palabra en Español a eliminar: ");
        String wordSpanish = read.next();
        String wordItalian = translation.get(wordSpanish);

        if (wordItalian != null) {
            translation.remove(wordSpanish, wordItalian);
            System.out.println(" * Traducción eliminada correctamente.");
        } else System.out.println(" * La palabra ingresada no existe, intentelo nuevamente.");

    }

    public void searchWord() {
        System.out.println("    -> Ingrese la palabra en Español que desea traducir al Italiano: ");
        String wordSpanish = read.next();
        String wordItalian = translation.get(wordSpanish);

        if(wordItalian != null ) {
            System.out.println(" - Español: " + wordSpanish
                             + "\n - Italiano: " + wordItalian);
        }
    }

    public void changeTraduction() {
        System.out.println("    -> Ingrese la palabra en español que desea cambiarle la traducción: ");
        String wordSpanish = read.next();

        if (translation.containsKey(wordSpanish)) {
            System.out.println("    -> Ingrese la nueva traduccion al Italiano: ");
            String wordItalian = read.next();
            translation.put(wordSpanish, wordItalian);

            System.out.println(" * Traducción modificada exitosamente.");
        } else System.out.println(" * La palabra ingresada no se encuentó, intentelo nuevamente.");

    }
}
