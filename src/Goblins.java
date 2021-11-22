public class Goblins {

    private int attack;
    private int health;
    // we need to keep track of location on the grid
    private int row;
    private int col;

    public Goblins (int row, int col){
        attack = 5;
        health = 50;
        this.row = row;
        this.col = col;
    }

    // create a method that will be evoked when human and goblin collide

    public void attack(Humans gary){
        if(gary.getHealth() == 0){

        }
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString(){
        return "G";
    }
}
