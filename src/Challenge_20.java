import java.util.Scanner;
public class Challenge_20 {
    public static void main(String[] args) {
        int result = askForNumber("What is the airspeed velocity of an unladen swallow?");
    }
    private static int askForNumber(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextInt();
    }
    private static int askForNumberInRange (String text, int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int number = scanner.nextInt();
        while (number < min || number > max) {
            System.out.println("This value in invalid, please enter a new value: ");
            number = scanner.nextInt();
        }
        return number;
    }
}
