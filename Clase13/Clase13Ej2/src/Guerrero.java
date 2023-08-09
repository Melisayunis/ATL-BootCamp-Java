
import java.util.Scanner;

/**

 */
public class Guerrero extends Personaje {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void Guerrero(){
        
    }

    public Guerrero(String name, int lvl, int life) {
        super(name, lvl, life);
    }
     
    public Guerrero crearGuerrero() {
        System.out.println("Ingrese el nombre del personaje: ");
        return new Guerrero(read.nextLine(), 1, 255);
    }
    
    
    
    @Override
    public int attack(){
        // devuelve la cantidad de vida que saca con el ataque, dependiendo el nivel y ¿el arma?
        int points = 0;
        
        if (level < 25) {
            points = 5;
        } else if (level >= 25 && level < 50) {
            points = 10;
        } else if (level >= 50 && level < 75) {
            points = 15;
        } else if (level >= 75) {
            points = 20;
        }

       return points; 
    }
   
    @Override //daño
    public void damage(){
        
    }
    
    @Override
    public void cure(){
        
    }
    
}
