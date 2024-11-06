import java.awt.*;
import java.util.Scanner;
public class Challenge_11 {
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Target Row? ");
        int row = scanner.nextInt();
        System.out.print("Target Column? ");
        int column = scanner.nextInt();
        String blockOne = "("+row+", "+(column-1)+")";
        String blockTwo = "("+(row-1)+", "+column+")";
        String blockThree = "("+row+", "+(column+1)+")";
        String blockFour = "("+(row+1)+", "+column+")";
        System.out.println(RED + "Deploy to: ");
        System.out.println(blockOne);
        System.out.println(blockTwo);
        System.out.println(blockThree);
        System.out.println(blockFour);
        Toolkit.getDefaultToolkit().beep();
    }
}
