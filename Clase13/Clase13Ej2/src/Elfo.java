
import java.util.Scanner;

/**

 */
public class Elfo extends Personaje {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void Elfo(){
        
    }
    
    public Elfo(String name, int lvl, int life) {
        super(name, lvl, life);
    }
    
    public Elfo crearElfo() {
        System.out.println("Ingrese el nombre del personaje: ");        
        return new Elfo(read.nextLine(), 1, 255);
    }
    
    
    @Override
    public int attack(){
        // devuelve la cantidad de vida que saca con el ataque, dependiendo el nivel y ¿el arma?
        int points = 0;
        
        if (level < 25) {
            points = 6;
        } else if (level >= 25 && level < 50) {
            points = 11;
        } else if (level >= 50 && level < 75) {
            points = 16;
        } else if (level >= 75) {
            points = 21;
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
