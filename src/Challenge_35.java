import java.util.Scanner;

public class Challenge_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"uncovered","nail","weight","trouble","cake","creepy","snake","painful","stranger"
                ,"detail","festive", "summer", "modern", "glorious", "fortunate", "superficial" };
        String guessingWord = words[(int) (Math.random() * words.length)];
        int lives = 5;
        String mistakes = "";
        String correct = "";
        String guess = "";
        int amountCorrect = 0;
        display(guessingWord, lives, mistakes,guess, correct);
        while (lives >0 && amountCorrect != guessingWord.length()){
            guess = letter(scanner, mistakes, correct);
            boolean check = check(guess, guessingWord);
            if (check) {
                correct += guess;
            }
            else {
                mistakes += guess;
                lives--;
            }
            amountCorrect = display(guessingWord, lives, mistakes,guess, correct);
        }
        if (lives >0){
            System.out.println("You won!");
        }
        else System.out.println("You have lost, the word was: " + guessingWord);
    }

    public static int display (String guessingWord, int lives, String mistakes, String guess, String correct){
        int amountCorrect = 0;
        System.out.print("Word: ");
        for (int i = 0;i<guessingWord.length();i++){
            boolean space = true;
            for (int j = 0;j<correct.length();j++){
                if (correct.substring(j,j+1).equals(guessingWord.substring(i,i+1))){
                    System.out.print(guessingWord.substring(i,i+1) + " ");
                    space = false;
                    amountCorrect++;
                }
            }
            if (space) {
                System.out.print("— ");
            }
        }
        System.out.println("| Remaining: " + lives + "| Incorrect: " + mistakes + "| Guess: " + guess);
        return amountCorrect;
    }

    private static String letter (Scanner scanner, String mistakes, String correct){
        String guess = "";
        while (guess.length() != 1){
            System.out.println("Pick a letter:");
            guess = scanner.nextLine();
            String guessed = mistakes + correct;
            for (int i = 0;i<guessed.length();i++){
                if (guessed.substring(i, i + 1).equals(guess)) {
                    guess = "";
                    break;
                }
            }
        }
        return guess;
    }

    public static boolean check (String guess,String guessingWord){
        for (int i = 0;i<guessingWord.length();i++){
            if (guess.equals(guessingWord.substring(i,i+1))){
                return true;
            }
        }
        return false;
    }
}