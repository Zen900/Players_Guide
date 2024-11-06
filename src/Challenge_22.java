import java.util.Scanner;

public class Challenge_22 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manticoreHealth = 10;
        int cityHealth = 15;
        int round = 1;
        int distance = askForNumberInRange(scanner,"Player 1, how far away from the city do you want to station the Manticore? ",0,100);
        for (int i = 0;i<50;i++){
            System.out.println();
        }
        while (manticoreHealth > 0 && cityHealth > 0){
            System.out.println("STATUS: Round "+round+" City: "+cityHealth+"/15 Manticore: "+manticoreHealth+"/10");
            int cannon = calculateCannonDamage(round);
            System.out.println(RED + "The cannon is expected to deal "+cannon+" damage this round.");
            System.out.print(GREEN);
            int range = askForNumberInRange(scanner,"Enter desired cannon range: ",0,100);
            System.out.print(YELLOW);
            if (range == distance) {
                System.out.println("That round was a DIRECT HIT!");
                manticoreHealth -= cannon;
            }
            else cityHealth --;
            if (range > distance) System.out.println("That round OVERSHOT the target.");
            if (range <distance) System.out.println("That round FELL SHORT of the target.");
            System.out.println( BLUE+ "-----------------------------------------------------------");
            System.out.print(RESET);
            round ++;
        }
        if (cityHealth == 0) System.out.println("The city has been destroyed");
        else System.out.println("The Manticore has been destroyed! The city of Consolas has been saved! ");
    }
    private static int askForNumberInRange (Scanner scanner,String text, int min, int max){
        int number = max+1;
        int firstTime = 0;
        while (number < min || number > max){
            if (firstTime == 0) System.out.print(text);
            else System.out.print("This number is invalid, please enter a valid number: ");
            number = scanner.nextInt();
            firstTime++;
        }
        return number;
    }

    private static int calculateCannonDamage (int round){
        if (round % 5 == 0 && round % 3 == 0) return 10;
        else if (round % 5 == 0 || round % 3 == 0) return 3;
        else return 1;
    }
}
