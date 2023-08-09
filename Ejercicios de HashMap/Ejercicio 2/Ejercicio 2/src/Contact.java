import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Implementa funciones para agregar, buscar y eliminar contactos
// utilizando un HashMap donde los nombres son las claves y los números son los valores.
public class Contact {
    Scanner read =  new Scanner(System.in).useDelimiter("\n");
    Integer count = 0;

    HashMap<String, Integer> contactBook = new HashMap<>();

    public void addContact() {
        System.out.println("  -> Ingrese el nombre del contacto: ");
        String name = read.next();
        System.out.println("  -> Ingrese el numero de telefono: ");
        int phone = read.nextInt();
        Integer phoneNumber = Integer.valueOf(phone);

        if (contactBook.get(name) == null) {
            contactBook.put(name, phoneNumber);
            System.out.println(" * Contacto agregado exitosamente.");
        }
    }

    public void deleteContact() {
        System.out.println("  -> Ingrese el nombre del contacto a eliminar: ");
        String name = read.next();
        Integer phone = contactBook.get(name);

        if(phone != null) {
            contactBook.remove(name, phone);
            System.out.println(" * Contacto eliminado exitosamente.");
        } else System.out.println("     -> El contacto ingresado no existe. Intentelo nuevamente");

    }

    public void searchContact() {
        System.out.println("  -> Ingrese el nombre del contacto a buscar: ");
        String name = read.next();
        Integer phone = contactBook.get(name);

        if(phone != null) {
            System.out.println(" * El telefono del contacto " + name + " es: " + phone);
        } else System.out.println("   -> El contacto ingresado no existe. Intentelo nuevamente");
    }

    public void showContact() {
        System.out.println(" * Los contactos agendados son: ");
        for(Map.Entry<String, Integer> contact : contactBook.entrySet()) {
                System.out.println("\n    * Nombre: " + contact.getKey()
                               + "\n    * Telefono: " + contact.getValue());
        }
    }

}
