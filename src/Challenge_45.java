import java.util.Scanner;
public class Challenge_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int gridSize;
        int[][] grid;
        boolean fountainEnabled = false;
        String direction;
        gridSize = gridSize(0,scanner);
        grid = new int[gridSize][gridSize];
        while (!(row == 0 && column == 0 && fountainEnabled)){
            System.out.println("You are in the room at (Row=" + row + ", Column=" + column + ")." );
            informationForUser(row, column, fountainEnabled, grid);
            direction = userInput(row,column, grid, scanner);
            switch (direction) {
                case "move north":
                    row += 1;
                    break;
                case "move south":
                    row -= 1;
                    break;
                case "move east":
                    column += 1;
                    break;
                case "move west":
                    column -= 1;
                    break;
                case "enable fountain": if (row == grid.length -4 && column == grid.length -2){
                    fountainEnabled = true;
                }
            }
            System.out.println("----------------------------------------------------------------------------------");
        }
        System.out.println("You are in the room at (Row=" + row + ", Column=" + column + ")." );
        System.out.println("The Fountain of Objects has been reactivated, and you have escaped with your life!");
        System.out.println("You win!");
    }


    public static String userInput(int row, int column, int[][] grid, Scanner scanner){
        String user = "";
        boolean isLocationInMap = true;
        while (isLocationInMap){
            System.out.print("What do you want to do? ");
            user = scanner.nextLine().toLowerCase();

            if (user.equals("move north") && row != grid.length -1){
                isLocationInMap = false;
            }
            if (user.equals("move south") && row != 0){
                isLocationInMap = false;
            }
            if (user.equals("move east") && column != grid.length -1){
                isLocationInMap = false;
            }
            if (user.equals("move west") && column != 0){
                isLocationInMap = false;
            }
            if (user.equals("enable fountain")){
                isLocationInMap = false;
            }
        }
        return user;
    }

    public static void informationForUser(int row, int column, boolean fountainEnabled, int grid[][]){
        if (row == 0 && column == 0 && !fountainEnabled){
            System.out.println("You see light coming from the cavern entrance.");
        }
        if (row == grid.length -4 && column == grid.length -2 && !fountainEnabled){
            System.out.println("you hear water dripping in this room. The Fountain of Objects is here!");
        }
        if (row == grid.length -4 && column == grid.length -2 && fountainEnabled){
            System.out.println("You hear the rushing waters from the Fountain of Objects. It has been reactivated!");
        }
    }

    public static int gridSize(int gridSize, Scanner scanner){
        String user;
        while (gridSize == 0){
            System.out.print("Do you want to play a small, medium or large game? ");
            user = scanner.nextLine();
            switch (user){
                case "small": gridSize = 4;
                    break;
                case "medium": gridSize = 6;
                    break;
                case "large": gridSize = 8;
                    break;
            }
        }
        return gridSize;
    }
}