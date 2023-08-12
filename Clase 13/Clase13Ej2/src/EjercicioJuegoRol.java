
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida.
Implementa métodos para que el personaje pueda atacar, recibir daño y curarse. Luego, crea
clases derivadas como "Guerrero", "Mago" y "Arquero", que hereden de la clase base y añadan
atributos y métodos específicos para cada tipo de personaje. Por ejemplo, la clase "Guerrero"
podría tener un atributo adicional para la fuerza de ataque, mientras que la clase "Mago" podría
tener un método para lanzar hechizos. Crea instancias de los diferentes personajes y simula un
combate entre ellos.
 */
public class EjercicioJuegoRol {
    static List<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido, elige tu personaje y a jugar!");
        infoPersonaje(0);
        elegirPersonaje();
        System.out.println("");
        
        
    }
    
    private static void elegirPersonaje() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Personajes disponibles: " +
                "\n     -> Guerrero. " + 
                "\n     -> Mago. " + 
                "\n     -> Elfo. ");
        
        
        
        
    }
    
    // opc = 0 -> muestra la info basica de cada personaje al inicio.
    // opc != 0 -> muesra la info actual de los personajes creados.
    private static void infoPersonaje(int opc) {
        if (opc == 0) {
            System.out.println("Caracteristicas de cada personaje: "
                    + "\n     * Guerrero * "
                    + "\n -> Vida inicial: 255 | Fuerza min: 5 - Fuerza maxima: 20 | Curación: 8 "
                    + "\n     * Mago * "
                    + "\n -> Vida inicial: 255 | Fuerza min: 4 - Fuerza maxima: 20| Curación: 11"
                    + "\n     * Elfo  * " 
                    + "\n -> Vida inicial: 255 | Fuerza min: 6 - Fuerza maxima: 20 | Curación: 9");
        } else {
            System.out.println("Información actual de cada personaje: ");
            for (Personaje personaje : personajes){
                System.out.println("    -> Nombre: " + personaje.getName()
                + "\n   -> Nivel: " + personaje.getLvl()
                + "\n   -> Vida: " + personaje.getLife() );
            }
        }
    }
    
    private static void menu() {
        Scanner read = new Scanner(System.in);
        boolean exit = true;
        int option;
        
        do {
            System.out.println("\n Elija la opcion que desea realizar: "
                    + "\n     1- Crear un nuevo personaje."
                    + "\n     2- Mostrar información de los personajes."
                    + "\n     3- "
                    + "\n     4- "
                    + "\n     5- "
                    + "\n     6- "
                    + "\n     0- ");
            option = read.nextInt();
            
            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    infoPersonaje(1);
                    break;
                case 3:
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente: ");
                    break;
            }
            
        } while (exit);
        
        
        
        
        
    }


    
}
