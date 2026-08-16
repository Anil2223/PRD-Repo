package LoginAttemptandSecurity;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Enter name:");
        username = scanner.nextLine();
        System.out.println("Enter pin : ");
        int pin = scanner.nextInt();
        String UserAttempt1;
        int pinAttempt1;

        int maxAttempt = 3;
        int Attempt = 1;
        while (Attempt <= maxAttempt) {
            int remainAttempt = maxAttempt - Attempt;
            System.out.println("Attempt " + Attempt);
            System.out.println("long in Name: ");
            scanner.nextLine();
            UserAttempt1 = scanner.nextLine();
            System.out.println("login pin : ");
            pinAttempt1 = scanner.nextInt();

            System.out.println("\n");
            if (username.equals(UserAttempt1)) {
                System.out.println("User Status:Correct");
            } else {
                System.out.println("User Status:InCorrect");
            }

            if (pin == pinAttempt1) {
                System.out.println("Pin Status: Correct");

            } else {
                System.out.println("Pin Status:InCorrect");
            }

            if (username.equals(UserAttempt1) && pin == pinAttempt1) {
                System.out.println("Login Result: Successful");
                System.out.println("Welcome Learners .");
                break;
            } else {
                System.out.println("Login Result: Failed ");
                System.out.println("Remaining Attempt: " + remainAttempt);
            }

            Attempt++;
        }

    }
}
