import java.util.Scanner;
public class Challenge_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many provinces do you have?");
        int provinces = scanner.nextInt();
        System.out.println("How many duchies do you have?");
        int duchy = scanner.nextInt();
        System.out.println("How many estates do you have?");
        int estates = scanner.nextInt();
        int points = estates + 3*duchy + 6*provinces;
        System.out.println("Total points: " + points);
    }
}
