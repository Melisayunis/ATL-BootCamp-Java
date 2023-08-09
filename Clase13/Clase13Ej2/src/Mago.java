
import java.util.Scanner;

/**

 */
public class Mago extends Personaje {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void Mago(){
        
    }
    
    public Mago(String name, int lvl, int life) {
        super(name, lvl, life);
    }
    
    public Mago crearMago() {
        System.out.println("Ingrese el nombre del personaje: ");        
        return new Mago(read.nextLine(), 1, 255);
    }
    
    
    
    
    @Override
    public int attack(){
        // devuelve la cantidad de vida que saca con el ataque, dependiendo el nivel y ¿el arma?
        int points = 0;
        
        if (level < 25) {
            points = 4;
        } else if (level >= 25 && level < 50) {
            points = 9;
        } else if (level >= 50 && level < 75) {
            points = 14;
        } else if (level >= 75) {
            points = 19;
        }
        
       return points; 
    }
   
    @Override
    public void damage(){
        
    }
    
    @Override
    public void cure(){
        
    }
}
