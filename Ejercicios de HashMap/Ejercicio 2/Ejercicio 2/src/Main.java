

// 2. Agenda de contactos:
// Desarrolla una aplicación de agenda de contactos en la que los usuarios puedan agregar nombres
// y números de teléfono.

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = true;
        int opc;

       Contact contact = new Contact();

        do {
            menu();
            opc = read.nextInt();

            switch(opc) {
                case 1:
                    contact.addContact();
                    break;
                case 2:
                    contact.searchContact();
                    break;
                case 3:
                    contact.deleteContact();
                    break;
                case 4:
                    contact.showContact();
                    break;
                case 0:
                    exit = false;
                    System.out.println("  ¡Hasta luego! ");
                    break;
                default:
                    System.out.println("    -> La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }
        } while(exit);
    }

    private static void menu() {
        System.out.println("\n  -> Ingrese la opcion que desea realizar: ");
        System.out.println("    1: Agregar un nuevo contacto. "
                + "\n    2: Buscar un contacto."
                + "\n    3: Eliminar un contacto."
                + "\n    4: Mostrar los contactos."
                + "\n    0: Salir.");
    }

}