import java.util.Scanner;

public class Challenge_18 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me five numbers:");
        for (int i = 0;i<5;i++){
            System.out.print("Number " + (i + 1) + ": ");
            firstArray[i] = scanner.nextInt();
        }
        int[] secondArray = new int[5];
        for (int i = 0;i<secondArray.length;i++){
            secondArray[i] = firstArray[i];
        }
        System.out.print("Content of first array: ");
        for (int j : firstArray) {
            System.out.print(j + " ");
        }
        System.out.print("\nContent of second array: ");
        for (int j : secondArray) {
            System.out.print(j + " ");
        }
    }
}