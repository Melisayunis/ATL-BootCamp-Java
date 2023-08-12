
import java.util.ArrayList;
import java.util.List;

/**
Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida.

Implementa métodos para que el personaje pueda atacar, recibir daño y curarse.
 */
public abstract class Personaje {
    protected String name;
    protected int experience;
    protected int level; // lvl max 100
    protected int hp; // hp max 255
    
    protected List<Item> items;

    public Personaje() {
    }

    public Personaje(String name) {
        this.name = name;
        this.experience = 1;
        this.level = 1;
        this.hp = 255;
        
        this.items = new ArrayList<>(); // los creo y agrego en el main
        /*
        Despues de crear item por item en el main y agregarle su respectivos atributos, 
        hay q agregarselo al personaje: siendo p1 el personaje y nuevoItem el item recien creado
        p1.getItems().add(nuevoItem)
        */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return level;
    }

    public void setLvl(int level) {
        this.level = level;
    }

    public int getLife() {
        return hp;
    }

    public void setLife(int life) {
        this.hp = life;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
   
    
    public int takeDamage(int dmg) {
        // Recibir daño, le resta al hp la cantidad "dmg" de daño recibido.
        hp -= dmg;
        if (hp <= 0) {
            hp = 0;
        }
        return hp;
    }
    
    public int cureMe(int point) {
        // Cura la cantidad "points" de vida del personaje
        hp += point;
        if (hp > 255) {
            hp = 255;
        }
        return hp;
    }
    
    public boolean isAlive() {
        return hp > 0;
    }

    public void levelUp() {
        if (experience >= 255) {
            level += 1;
            hp = 255;
            experience = 1;
            System.out.println("¡Felicidades ha subido al nivel " + level + "!");
        }
    }
    
    public void increaseExperience(int point) {
        // Le incrementa a la experiencia la cantidad "point" 
        experience += point;
        levelUp();
    }
    
    public int getTotalDefence(){
        int totalDefence = 0;
        for (Item item : items) {
            totalDefence += item.getDefense();
        }
        return totalDefence;
    }
    
    public int getTotalAttack(){
        int totalAttack = 0;
        for (Item item : items) {
            totalAttack += item.getAtack();
        }
        return totalAttack;
    }
    
    
}
