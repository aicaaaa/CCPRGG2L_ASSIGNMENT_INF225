import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Password must contain at least one alphabet and digit!");
        System.out.println("Password must be at least 8 characters in length: ");
        System.out.print("Enter password: ");

        String password = scan.nextLine();

        // Pattern
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");

        // Input String
        Matcher passwordMatch = passwordPattern.matcher(password);

        boolean isValid = passwordMatch.matches();

        if (isValid) {
            System.out.println("Password is valid! ");
        } else {
            System.out.println("Password is invalid! ");
        }

        scan.close();
    }
}