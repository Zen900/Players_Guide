import java.util.Scanner;

public class Challenge_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] symbols = {"   ", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   " };
        int turn = 1;
        boolean isThereAWinner = false;
        System.out.println("Player one, what is your name?");
        String playerOne = scanner.nextLine();
        System.out.println("Player two, what is your name?");
        String playerTwo = scanner.nextLine();
        while (turn < 10 && !isThereAWinner) {
            board(symbols, turn, playerOne, playerTwo);
            player(scanner, symbols, turn);
            isThereAWinner = checkForWinner(symbols);
            turn++;
        }
        board(symbols, turn, playerOne, playerTwo);
        if (turn == 10){
            System.out.println("The game ended in a draw");
        } else if (turn % 2 == 0) {
            System.out.println("The winner is: " + playerTwo);
        }
        else System.out.println("The winner is: " + playerOne);
    }

    public static void board(String[] symbols, int turn, String playerOne, String playerTwo) {
        System.out.println();
        if (turn % 2 == 0) {
            System.out.println("It is " + playerOne + "'s turn.");
        } else System.out.println("It is " + playerTwo + "'s turn.");
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
            if (i == 2 || i == 5) {
                System.out.println();
                System.out.println("---+---+---");
            } else if (i != 8) System.out.print("|");
        }
        System.out.println();
    }

    public static void player(Scanner scanner, String[] symbols, int turn) {
        boolean check = true;
        System.out.println("What square do you want to play in?");
        while (check) {
            int user = scanner.nextInt();
            if ((user > 0 && user < 10) && symbols[user - 1].equals("   ")) {
                if (turn % 2 == 0) {
                    symbols[user - 1] = " X ";
                } else symbols[user - 1] = " O ";
                check = false;
            } else System.out.println("This is not possible, please try again");
        }
    }

    public static boolean checkForWinner(String[] symbols) {
        for (int i = 0; i < symbols.length; i+=3) {
            if (symbols[i].equals(symbols[i + 1]) && symbols[i].equals(symbols[i + 2]) && !symbols[i].equals("   ")) {
                return true;
            }
        }
        for (int i = 0;i<3;i++){
            if (symbols[i].equals(symbols[i + 3]) && symbols[i].equals(symbols[i + 6]) && !symbols[i].equals("   ")) {
                return true;
            }
        }
        return (symbols[0].equals(symbols[4]) && symbols[0].equals(symbols[8]) && !symbols[0].equals("   "))
                || (symbols[2].equals(symbols[4]) && symbols[2].equals(symbols[6]) && !symbols[2].equals("   "));
    }
}