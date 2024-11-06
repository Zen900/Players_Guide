import java.util.Scanner;

public class Challenge_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winnerPlayerOne = 0;
        int winnerPlayerTwo = 0;
        int draws = 0;
        while (true){
            String playerOne = "";
            String playerTwo = "";
            while (!playerOne.equals("rock") && !playerOne.equals("paper") && !playerOne.equals("scissors")){
                System.out.println("Player 1: rock, paper, scissors?");
                playerOne = scanner.next();
            }
            while (!playerTwo.equals("rock") && !playerTwo.equals("paper") && !playerTwo.equals("scissors")){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nPlayer 2: rock, paper, scissors?");
                playerTwo = scanner.next();
            }
            if ((playerOne.equals("rock") && playerTwo.equals("scissors")) ||
                    (playerOne.equals("paper") && playerTwo.equals("rock")) ||
                    (playerOne.equals("scissors") && playerTwo.equals("paper"))) {
                System.out.println("Player 1 is the winner of this round");
                winnerPlayerOne++;
            }
            else if (playerOne.equals(playerTwo)) {
                System.out.println("This round is a draw");
                draws++;
            }
            else {System.out.println("Player 2 is the winner of this round");
                winnerPlayerTwo++;
            }
            System.out.println("Wins: \n" + "Player One: " + winnerPlayerOne + "\nPlayer Two: " + winnerPlayerTwo);
            System.out.println("Draws: " + draws);
        }
    }
}