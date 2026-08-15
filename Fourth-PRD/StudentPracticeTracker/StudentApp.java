package StudentPracticeTracker;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("===========================================================");
        System.out.println("Menu");
        System.out.println("============================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String StudentName = scanner.nextLine();
        System.out.println("Enter Course Name:");
        String CourseName = scanner.nextLine();
        System.out.println("Enter Compeleted Topics: ");
        int CompletedTopics = scanner.nextInt();
        System.out.println("Enter Questions Solved: ");
        int QuestionSolved = scanner.nextInt();

        Student s1 = new Student(StudentName, CourseName, CompletedTopics, QuestionSolved);

        System.out.println("1.View Student Details");
        System.out.println("2.View Progress");
        System.out.println("3.Add new Completed Topics");
        System.out.println("4.Add new Solved Questions");
        System.out.println("5.Exit");

        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();
        do {
            System.out.println("=======================================");
            System.out.println("MENU");
            System.out.println("========================================");
            switch (choice) {
                case 1:
                    s1.displayDetails();
                    break;
                case 2:
                    s1.displayProgress();
                    break;
                case 3:
                    System.out.println("How many new Topics did you completed ");
                    System.out.println("Enter new Topic:");
                    int Topics = scanner.nextInt();
                    s1.addTopics(Topics);
                    break;
                case 4:
                    System.out.println("How many new Questions did you Solved:");
                    System.out.println("Enter number of Questions:");
                    int NewSolvedQuestion = scanner.nextInt();
                    s1.addQuestions(NewSolvedQuestion);
                    break;
                case 5:
                    System.out.println("Thank you for using Student Practice Tracker.");
                    System.out.println("Keep practicing!");
                    break;
                default:
                    System.out.println("Invalide choice. Please try again !");
            }

            System.out.println("\n");

            System.out.println("Enter your choice :");
            choice = scanner.nextInt();

        } while (choice != 5);
        scanner.close();

    }
}
