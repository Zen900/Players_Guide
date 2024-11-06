import java.util.Arrays;
import java.util.Scanner;

public class Challenge_34 {
    public static void main(String[] args) {
        int moves = 1;
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " "};
        String[] randomNumbers;
        randomNumbers = randomPuzzle(numbers);
        board(randomNumbers);

        while (!Arrays.equals(numbers, randomNumbers)){
            randomNumbers = player(randomNumbers);
            board(randomNumbers);
            System.out.println("Moves: " + moves);
            moves++;
        }
            System.out.println("You won!");
    }

    public static String[] randomPuzzle(String[] numbers) {
        String[] randomNumbers = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        for (int a = 0; a <= 15; a++) {
            while (randomNumbers[a].equals("0")) {
                randomNumbers[a] = numbers[(int) (Math.random() * 16)];
            }
            for (int b = 0; b <= 15; b++) {
                if (randomNumbers[a].equals(numbers[b])) {
                    numbers[b] = "0";
                }
            }
        }
        return randomNumbers;
    }

    public static void board(String[] randomNumbers) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("————————————————");
            for (int j = 1; j <= 4; j++) {
                System.out.print("| " + randomNumbers[count] + " ");
                count++;
            }
            System.out.println("|");
        }
        System.out.println("————————————————");
    }

    public static String[] player (String[] randomNumbers){
        Scanner scanner = new Scanner(System.in);
        int emptySpace = 0;
        int user = -100;
        boolean check = true;
        while (check) {
            System.out.println("What do you want to do?");
            String playerAnswer = scanner.next();
            for (int i = 0;i<=15;i++){
                if (randomNumbers[i].equals(playerAnswer)) user = i;
                if (randomNumbers[i].equals(" ")) emptySpace = i;
            }
            if ((user - emptySpace) == 1 || (emptySpace - user) == 1 || (user - emptySpace) == 4 || (emptySpace - user) == 4){
                check = false;
                randomNumbers[emptySpace] = playerAnswer;
                randomNumbers[user] = " ";
            }
            else System.out.println("This is not possible, please try again");
        }
        return randomNumbers;
    }
}
