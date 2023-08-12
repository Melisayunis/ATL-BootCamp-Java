
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una
figura geométrica genérica. Luego, crea clases derivadas como "Triangulo", "Rectangulo" y
"Circulo", que hereden de la clase base y sobreescriban los métodos para calcular el área y el
perímetro según su forma específica. 

* Crea instancias de las diferentes figuras y muestra sus áreas y perímetros.
 */
public class Main {
    static List<Figura> figures = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        boolean exit = true;
        int option;
        
        do {
            System.out.println("\n " + "Ingrese la opcion deseada: " +
                    "\n     1: Crear una figura." + 
                    //"\n     2: Calcular el area de una figura." +
                    //"\n     3: Calcular el perimetro de una figura." +
                    "\n     4: Calcular el total de las areas." +
                    "\n     5: Calcular el total de los perimetros." + 
                    "\n     0: Salir." + "\n ");
            option = read.nextInt();
            
            switch (option) {
                case 1:
                    crearFigura();
                    break;
               /* case 2:
                    mostrarArea();
                    break;
                case 3:
                    
                    break;*/
                case 4:
                    totalAreas();
                    break;
                case 5:
                    totalPerimetros();
                    break;
                case 0:
                    exit = false;
                    System.out.println("Hasta luego! \n");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta. Intentelo nuevamente.");
                    break;
            }
        } while (exit);   
    }

    private static void crearFigura() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿Qué figura desea crear?" +
                "\n     1: Rectangulo." + 
                "\n     2: Triangulo." + 
                "\n     3: Circulo.");
        int option = read.nextInt();
        
        switch (option) {
            case 1:
                Rectangulo rectangle = new Rectangulo();
                cargarRectangulo(rectangle);
                figures.add(rectangle);
                break;
            case 2:
                Triangulo triangle = new Triangulo();
                cargarTriangulo(triangle);
                figures.add(triangle);
                break;
            case 3:
                Circulo circle = new Circulo();
                cargarCirculo(circle);
                figures.add(circle);
                break;
            default: 
                System.out.println("La opcion ingresada no corresponde a una figura, vuelva a intentarlo.");
                break;
        }
    }
    
    private static void cargarRectangulo(Rectangulo rectangle) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo en centimetros: ");
        rectangle.setBase(read.nextDouble());
        System.out.println("Ingrese la altura del rectangulo en centimetros: ");
        rectangle.setAltura(read.nextDouble());
    }
    
    private static void cargarTriangulo(Triangulo triangle) {
        Scanner read = new Scanner(System.in);
        double lado;
        
        System.out.println("Ingrese la base del triangulo en centimetros: ");
        triangle.setBase(read.nextDouble());
        System.out.println("Ingrese la altura del triangulo en centimetros:");
        triangle.setAltura(read.nextDouble());
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el lado " + (i+1) + " en centimetros: ");
            lado = read.nextDouble();
            switch (i) {
                case 0:
                    triangle.setLado1(lado);
                    break;
                case 1:
                    triangle.setLado2(lado);
                    break;
                case 2:
                    triangle.setLado3(lado);
                    break;
            } 
        }
    }
    
    private static void cargarCirculo(Circulo circle) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en centimetros: ");
        circle.setRadio(read.nextDouble());
    }

    private static void totalAreas() {
        double sumaAreas = 0;
        
        for (Figura figura : figures) {
            sumaAreas += figura.area();
        }
        System.out.println("La suma de todas las areas es: " + sumaAreas + " centimetros.");
    }
    
    private static void totalPerimetros() {
        double sumaPerimetros = 0;
        
        for (Figura figura : figures) {
            sumaPerimetros += figura.perimetro();
        }
        System.out.println("La suma de todas las areas es: " + sumaPerimetros + " centimetros.");
    }
    
        /*
    como al recorrer el la lista de figuras, se si lo q encuentro es un rectangulo, triangulo o circulo??
    
    private static void mostrarArea() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿El área de qué figura desea?" +
                "\n     1: Rectangulo." + 
                "\n     2: Triangulo." + 
                "\n     3: Circulo.");
        int option = read.nextInt();
        
        switch (option) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default: 
                System.out.println("La opcion ingresada no corresponde a una figura, vuelva a intentarlo.");
                break;
        }
    }
    */
}
