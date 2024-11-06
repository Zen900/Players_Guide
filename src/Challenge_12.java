import java.util.Scanner;
public class Challenge_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.println("Tick");
        else System.out.println("Tock");
    }
}
