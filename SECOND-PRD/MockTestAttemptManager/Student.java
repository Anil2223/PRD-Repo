package MockTestAttemptManager;

import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        System.out.println("Student Practice Tracker");
        Scanner scanner = new Scanner(System.in);
        int totalAttempt = 3;
        int Attempt = 1;
        int score;
        while (Attempt <= totalAttempt) {
            int remainingAttempt = totalAttempt - Attempt;
            System.out.println("Enter your " + Attempt + " Attempt score: ");
            score = scanner.nextInt();
            String result = (score > 60) ? "Pass" : "Fail";
            if (score <= 60) {
                System.out.println("your score is less than 60");
                System.out.println("you are " + result);
                System.out.println("Remaining Attempt: " + remainingAttempt);
                System.out.println("\n");
            } else if (score > 60) {
                System.out.println("Attemp :" + Attempt);
                System.out.println("Score: " + score);
                System.out.println("Result: " + result);
                System.out.println("\n");
                System.out.println("Best Score: " + score);
                System.out.println("Final Result: MOC TEST CLEARED");
                System.out.println("Message: Student Passed on attempt " + Attempt);
                break;

            }
            Attempt++;

        }

    }
}