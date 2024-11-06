import java.util.Scanner;

class PasswordValidator {
    public static String check (String password){
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int notAllowed = 0;
        if (password.length() >= 6 && password.length() <= 13){
            for (char ch: password.toCharArray()){
                if (Character.isUpperCase(ch)) upperCase = 1;
                if (Character.isLowerCase(ch)) lowerCase = 1;
                if (Character.isDigit(ch)) number = 1;
                if (ch == 'T' || ch == '&') notAllowed = 1;
            }
            if (upperCase == 1 && lowerCase == 1 && number == 1 && notAllowed == 0){
                return "Password is allowed";
            }
        }
        return "Password is not allowed";
    }
}

public class Challenge_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("What is the password?");
            String password = scanner.next();
            System.out.println(PasswordValidator.check(password));
        }
    }
}