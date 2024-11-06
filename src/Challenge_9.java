import java.util.Scanner;
public class Challenge_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chocolate eggs were gathered this day?");
        int chocolateEggs = scanner.nextInt();
        int sisters = chocolateEggs / 4;
        int duckbear = chocolateEggs % 4;
        System.out.println("The sisters each gets "+sisters+" chocolate eggs and there are "+duckbear+" chocolate " +
                "eggs left for the duckbear");
        // With 1,2,3,6,7 and 11 chocolate eggs, the duckbear gets more than each sister.
    }
}
