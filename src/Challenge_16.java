import java.util.Scanner;
public class Challenge_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User 1, enter a number between 0 and 100: ");
        int userOne = scanner.nextInt();
        while (userOne < 0 || userOne >100){
            System.out.print("This number is not between 0 and 100. Please enter a number between 0 and 100: ");
            userOne = scanner.nextInt();
        }
        for (int i=0;i<50;i++) System.out.println();
        System.out.println("User 2, guess the number.");
        int userTwo = -1;
        while (userOne != userTwo){
            System.out.print("What is your next guess? ");
            userTwo = scanner.nextInt();
            if (userTwo < userOne) System.out.println(userTwo+ " is too low.");
            else if (userTwo > userOne) System.out.println(userTwo+ " is too high.");
        }
        System.out.println("You guessed the number!");
    }
}
