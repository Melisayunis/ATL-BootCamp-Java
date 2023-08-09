
// 3. Traductor simple:
// Crea una aplicación de traducción simple que tome palabras en un idioma
// y las traduzca a otro.
// Utiliza un HashMap para almacenar pares de palabras clave-valor que representen las traducciones.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Translator translator = new Translator();
        translator.addWords();
        boolean exit = true;
        int opc;

        do {
            menu();
            opc = read.nextInt();

            switch(opc) {
                case 1:
                    // Mostrar palabras a traducir
                    translator.showWords();
                    break;
                case 2:
                    // Elegir palabra para traducir (buscar)
                    translator.searchWord();
                    break;
                case 3:
                    // Agregar una palabra
                    translator.addWord();
                    break;
                case 4:
                    // Eliminar una palabra
                    translator.deleteWord();
                    break;
                case 5:
                    // Cambiar una traduccion
                    translator.changeTraduction();
                    break;
                case 0:
                    exit = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }
        } while (exit);
    }

    private static void menu() {
        System.out.println("\n  * Ingrese la opcion que desea realizar: ");
        System.out.println("    1: Mostrar lista de palabras."
                + "\n    2: Elegir palabra a traducir."
                + "\n    3: Agregar una palabra nueva."
                + "\n    4: Eliminar una palabra."
                + "\n    5: Cambiar una tradccion."
                + "\n    0: Salir." );
    }

}