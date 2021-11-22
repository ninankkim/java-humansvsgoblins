import java.util.ArrayList;

public class Humans {
    private ArrayList<String> inventory;
    private int attack;
    private int health;
    // we need to keep track of location on the grid
    private int row;
    private int col;


    public Humans (int row, int col){
        inventory = new ArrayList<String>();
        attack = 10;
        health = 100;
        this.row = row;
        this.col = col;
    }



    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() { return col;}

    public void setCol(int col) {
        this.col = col;
    }





    public void addToInventory(String item){
        inventory.add(item);
        if(item.equals("Sword")){
            attack = attack + 10;
        }
    }



    @Override
    public String toString(){
        return "H";
    }
}
