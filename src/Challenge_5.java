import java.util.Scanner;
public class Challenge_5 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next(); //describes an object
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next(); // describes if it is Big, Azure or Tattered
        String c = "of Doom"; //Stores a String "of Doom|
        String d = "3000"; /* stores the number "3000" */
        System.out.println("The " + b + " " + a + c + " " + d + "!");
    }
    // changes the names of the variables to make clear what they do
}
