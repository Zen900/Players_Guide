public class Challenge_17 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static void main(String[] args) {
        for (int i = 1;i<101;i++){
            System.out.print(RESET + i+ ": ");
            if (i%3==0 && i%5==0) System.out.println(BLUE + "Electric and Fire");
            else if (i%3==0) System.out.println(RED + "Fire");
            else if (i%5==0) System.out.println(YELLOW + "Electric");
            else System.out.println("Normal");
        }
    }
}
