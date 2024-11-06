import java.util.Scanner;
public class Challenge_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-value of the enemy: ");
        int xValue = scanner.nextInt();
        System.out.print("Enter the y-value of the enemy: ");
        int yValue = scanner.nextInt();
        if (xValue == 0 & yValue == 0) {
            System.out.println("The enemy is here!");
            return;
        }
        System.out.print("The enemy is is to the ");
        if (yValue > 0) System.out.print("north");
        else if (yValue<0) System.out.print("south");
        if (xValue>0) System.out.print("east!");
        else if (xValue<0) System.out.print("west!");
    }
}
