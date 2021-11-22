import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2 dimensional arrays is a grid/matrix - they're called arrays of arrays
        // indexes of rows will be >     0 1 2 3
        // indexes of cols will be >     1
        //                               2
        //                               3

        int BOARD_SIZE = 5;// 5 rows (side to side), 5 columns (up and down)
        // String called grid that takes in 2 arrays - we're making a new one that takes in rows and columns
        Object grid [][] = new Object[BOARD_SIZE][BOARD_SIZE];
        Humans larry = new Humans(2,2);
        Goblins gary = new Goblins(0,0);

        Scanner keyboard = new Scanner(System.in);


        while(true){
            resetGrid(grid, BOARD_SIZE);
            addToGrid(grid, larry);
            addToGrid(grid, gary);
            printGrid(grid, BOARD_SIZE);
            System.out.println("Enter: n/s/e/w to move around(q to quit)");
            System.out.println("Human health: " + larry.getHealth() + " | Human attack value: " + larry.getAttack());
            System.out.println("Goblin health: " + gary.getHealth() + " | Goblin attack value: " + gary.getAttack());
            String input = keyboard.next();
            if(input.equals("n")){
                if(larry.getRow() != 0){
                    larry.setRow(larry.getRow()-1);
                } else {
                    System.out.println("The character cannot move further!");
                }
            } else if (input.equals("s")){
                if(larry.getRow() != BOARD_SIZE-1){
                    larry.setRow(larry.getRow()+1);
                } else {
                    System.out.println("The character cannot move further!");
                }
            } else if (input.equals("w")){
                if(larry.getCol() != 0){
                    larry.setCol(larry.getCol()-1);
                } else {
                    System.out.println("The character cannot move further!");
                }
            } else if (input.equals("e")){
                if(larry.getCol() != BOARD_SIZE-1){
                    larry.setCol(larry.getCol()+1);
                } else {
                    System.out.println("The character cannot move further!");
                }
            } else if (input.equals("q")){
                System.out.println("The game has ended! Let's restart the game!");
                // somehow restart the game
            }

            //goblin and human encounter // attack method
            if(larry.getRow() == larry.getRow() && larry.getCol() == larry.getCol()){
                System.out.println("The human, named Larry, has collided with Gary, the Goblin!");

            }


        }



    }

    public static void addToGrid(Object grid [][],Object o){
        if(o instanceof Humans){
            Humans larry = (Humans) o;
            grid[larry.getRow()][larry.getCol()] = larry;
        } else if (o instanceof Goblins) {
            Goblins gary = (Goblins) o;
            grid[gary.getRow()][gary.getCol()] = gary;
        }
    }

    // this prints out the grid - it iterates or goes through the rows and columns
    // the printGrid is special method that has a nested for loop
    // the for loop will start at the 0 index of row, and go till the end and nested loop will do the same for column
    public static void printGrid(Object grid [][], int BOARD_SIZE){
        for(int row = 0; row < BOARD_SIZE; row++){
            for(int col = 0; col < BOARD_SIZE; col++){
                // this for loop will print out the spaces
                System.out.print(grid[row][col].toString() + " ");
            }
            System.out.println();
        }
    }

    public static void resetGrid(Object grid [][], int BOARD_SIZE){
        for(int row = 0; row < BOARD_SIZE; row++){
            for(int col = 0; col < BOARD_SIZE; col++){
                grid[row][col] = new Land();
            }
        }
    }



}
