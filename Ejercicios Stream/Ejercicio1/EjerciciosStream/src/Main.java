import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        llenarListaNombres(listNames);

        ArrayList<Integer> tablaNumeros = new ArrayList<>();
        llenarNumerosTabla(tablaNumeros);

        // ej1(listNames);
        // ej2(listNames);
        // ej3(tablaNumeros);
        // ej4(tablaNumeros);
        // ej5(listNames);
        // ej6();
        // ej7();
    }

    private static void ej1(ArrayList<String> listNames) {
        /*
            1. Imprimir Nombres en Mayúsculas:
        Toma una lista de nombres y utiliza forEach para imprimir
        en la consola cada nombre en mayúsculas.
         */

        System.out.println("\n Da la siguiente lista de nombres: ");
        mostrarListaNombres(listNames);

        System.out.println("\n Los nombres en mayusculas son: ");
        mostrarNombresMayus(listNames);

    }

    private static void ej2(ArrayList<String> listNames) {
        /*
          2. Imprimir Palabras al Revés:
        Dado un arreglo de palabras, utiliza forEach para imprimir en la
        consola cada palabra escrita al revés.
         */
        listNames.forEach(name -> {
            imprimirPalabrasAlReves(name);
        });
    }

    private static void ej3 (ArrayList<Integer> tabla) {
        /*
        3. Tabla de Multiplicar:
        Utiliza forEach para imprimir en la consola la tabla de multiplicar de un número específico.
         */
        System.out.println(" Ingrese un numero para mostrar su tabla de multiplicar: ");
        int numero = read.nextInt();

        tabla.forEach(number -> {
            System.out.println(String.format("%s x %s = %s", numero, number, (numero*number)));
        });
    }

    private static void ej4(ArrayList<Integer> tabla) {
        /*   4. Duplicar Números:
        Dado un arreglo de números enteros, utiliza la operación map para
        crear un nuevo arreglo donde cada número se duplique.          */
        //int duplicate;

        List<Integer> duplicateNumber = tabla.stream()
                .map(duplicate -> (duplicate * 2)).toList();

        //tabla.forEach(num -> System.out.println(String.format("Original: %s", num)));
        //duplicateNumber.forEach(num -> System.out.println(String.format("Doble: %s", num)));
    }

    private static void ej5(ArrayList<String> listNames){
        /*   5.Transformar Nombres en Longitudes:
        Toma una lista de nombres y utiliza la operación map para crear una lista
        de las longitudes de cada nombre.
        */

        List<Integer> longName = listNames.stream()
                .map(name -> name.length()  )
                .toList();

        longName.forEach(num -> System.out.println(String.format(
                "Longitud: %s.", num)));
    }

    private static void ej6() {
    /*  6. Convertir Temperaturas de Celsius a Fahrenheit:
        Dada una lista de temperaturas en grados Celsius, utiliza la operación map para crear
        una lista de las mismas temperaturas en grados Fahrenheit. La fórmula de conversión es: F = C * 9/5 + 32.
     */
        ArrayList<Integer> listCelsius = new ArrayList<>();
        llenarListaCelsuis(listCelsius);

        List<Double> listFahrenheit = listCelsius.stream()
                .map(celsius -> ( (celsius * 1.8) + 32) )
                .toList();
        listFahrenheit.forEach(grados -> System.out.println(String.format("Fahrenheit: %s.", grados)));
    }

    private static void ej7() {
        /*   7. Extracción de Años de Fechas:
        Toma una lista de objetos Date (o LocalDate en Java 8+) y utiliza la operación map para
        crear una lista de los años correspondientes.
         */
        ArrayList<LocalDate> listaFechas = new ArrayList<>();
        llenarFechas(listaFechas);

        List<Integer> aniosSolamente = listaFechas.stream().
                map( anio -> anio.getYear() )
                .toList();
        aniosSolamente.forEach(anio -> System.out.println(String.format("Año: %s.", anio)));
    }

    private static void llenarFechas(ArrayList<LocalDate> listaFechas){
        listaFechas.add(LocalDate.now());
        listaFechas.add(LocalDate.of(2023, 8, 8));
        listaFechas.add(LocalDate.of(1991, 10, 20));
        listaFechas.add(LocalDate.of(1989, 1, 13));
        listaFechas.add(LocalDate.of(1991, 11, 29));
        listaFechas.add(LocalDate.of(1991, 7, 14));
        listaFechas.add(LocalDate.of(2020, 7, 28));
        listaFechas.add(LocalDate.of(2023, 2, 25));
        listaFechas.add(LocalDate.of(2022, 2, 22));
    }

    private static void llenarListaCelsuis(ArrayList<Integer> listaCelsius) {
        listaCelsius.add(35);
        listaCelsius.add(15);
        listaCelsius.add(12);
        listaCelsius.add(-10);
        listaCelsius.add(30);
        listaCelsius.add(18);
        listaCelsius.add(20);
        listaCelsius.add(22);
        listaCelsius.add(25);

    }

    private static void llenarNumerosTabla(ArrayList<Integer> tabla) {
        for (int i = 1; i <= 10; i++) {
            tabla.add(i);
        }
    }

    private static void imprimirPalabrasAlReves(String name) {
        String reverseName = "";
        int tam = name.length()-1;

        for (int i = 0; i < name.length(); i++) {
            if (i == name.length()-1) {
                reverseName += name.toLowerCase().substring(tam-i, tam-i+1);

            } else if (i == 0) {
                reverseName += name.toUpperCase().substring(tam-i, tam-i+1);

            } else reverseName += name.substring(tam-i, tam-i+1);

        }
        System.out.println(String.format(" Palabra: %s. \n Palabra al reves: %s.", name, reverseName));
    }

    private static void llenarListaNombres(ArrayList<String> listNames){
        listNames.add("Melisa");
        listNames.add("Belen");
        listNames.add("Cintia");
        listNames.add("Janet");
        listNames.add("Ivonne");
        listNames.add("Baam");
        listNames.add("Joaquin");
        listNames.add("Analia");
        listNames.add("Pedro");
        listNames.add("Nahuel");
    }

    private static void mostrarListaNombres(ArrayList<String> listNames) {
        /*
        for (String name : listNames) {
            System.out.println(name);
        }*/

        (listNames).forEach(name -> {
            System.out.println(name);
        });
    }

    private static void mostrarNombresMayus(ArrayList<String> listNames) {
        listNames.forEach(name -> {
            System.out.println(String.format(" Original: %s", name ));
            System.out.println(String.format(" Masyusculas: %s", name.toUpperCase()));
        });
    }


}