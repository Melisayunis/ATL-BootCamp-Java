

/**

 */
class Item {
    private String name;
    private int defense;
    private int atack;

    public Item() {
    }

    public Item(String name, int defense, int atack) {
        this.name = name;
        this.defense = defense;
        this.atack = atack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }
    
    
}
