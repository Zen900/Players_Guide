import java.util.Scanner;
public class Challenge_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(""" 
                1. Rope
                2. Torches
                3. Climbing Equipment
                4. Clean Water
                5. Machete
                6. Canoe
                7. Food Supplies""");
        System.out.print("What number do you want to see the price of? ");
        int number = scanner.nextInt();
        String prices = switch (number) {
            case 1 -> "Rope costs 10 gold.";
            case 2 -> "Torches cost 15 gold.";
            case 3 -> "Climbing Equipment costs 25 gold.";
            case 4 -> "Clean Water costs 1 gold.";
            case 5 -> "Machete costs 20 gold.";
            case 6 -> "Canoe costs 200 gold.";
            case 7 -> "Food Supplies cost 1 gold.";
            default -> null;
        };
        System.out.println(prices);
    }
}
