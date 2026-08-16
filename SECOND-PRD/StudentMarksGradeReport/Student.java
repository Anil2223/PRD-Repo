package StudentMarksGradeReport;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String name;
        int subjectOnemarks;
        int subjectTwomarks;
        int subjectThreemarks;
        int subjectFourmarks;
        int subjectFivemarks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        name = scanner.nextLine();

        System.out.println("Enter subject one marks: ");
        subjectOnemarks = scanner.nextInt();
        while (subjectOnemarks < 0 || subjectOnemarks >= 100) {
            System.out.println("Marks must be 0 to 100 ");
            System.out.println("Enter subje one marks: ");
            subjectOnemarks = scanner.nextInt();
        }

        System.out.println("Enter subject two marks:");
        subjectTwomarks = scanner.nextInt();
        while (subjectTwomarks < 0 || subjectTwomarks >= 100) {
            System.out.println("Marks must be 0 to 100 ");
            System.out.println("Enter subje one marks: ");
            subjectTwomarks = scanner.nextInt();
        }

        System.out.println("Enter subject three marks:");
        subjectThreemarks = scanner.nextInt();
        while (subjectThreemarks < 0 || subjectThreemarks >= 100) {
            System.out.println("Marks must be 0 to 100 ");
            System.out.println("Enter subje one marks: ");
            subjectThreemarks = scanner.nextInt();
        }

        System.out.println("Enter subject four marks:");
        subjectFourmarks = scanner.nextInt();
        while (subjectFourmarks < 0 || subjectFourmarks >= 100) {
            System.out.println("Marks must be 0 to 100 ");
            System.out.println("Enter subje one marks: ");
            subjectFourmarks = scanner.nextInt();
        }

        System.out.println("Enter subject Five marks:");
        subjectFivemarks = scanner.nextInt();
        while (subjectFivemarks < 0 || subjectFivemarks >= 100) {
            System.out.println("Marks must be 0 to 100 ");
            System.out.println("Enter subje one marks: ");
            subjectFivemarks = scanner.nextInt();
        }

        int totalmarks = subjectOnemarks + subjectTwomarks + subjectThreemarks + subjectFourmarks + subjectFivemarks;

        double averagemarks = ((double) totalmarks / 5);
        double percentage = averagemarks;

        int passedSubjects = 0;
        int failedSubjects = 0;

        if (subjectOnemarks >= 35) {
            passedSubjects++;
        } else {
            failedSubjects++;
        }

        if (subjectTwomarks >= 35) {
            passedSubjects++;
        } else {
            failedSubjects++;
        }

        if (subjectThreemarks >= 35) {
            passedSubjects++;
        } else {
            failedSubjects++;
        }

        if (subjectFourmarks >= 35) {
            passedSubjects++;
        } else {
            failedSubjects++;
        }

        if (subjectFourmarks >= 35) {
            passedSubjects++;
        } else {
            failedSubjects++;
        }

        String finalResult = subjectOnemarks >= 35 &&
                subjectTwomarks >= 35 &&
                subjectThreemarks >= 35 &&
                subjectFourmarks >= 35 &&
                subjectFivemarks >= 35 ? "Pass" : "Fail";

        String Grade;
        if (percentage >= 90) {
            Grade = "A+";
        } else if (percentage <= 80 || percentage <= 90) {
            Grade = "A";
        } else if (percentage <= 70 || percentage <= 80) {
            Grade = "B";

        } else if (percentage >= 60 || percentage >= 70) {
            Grade = "C";
        } else if (percentage >= 50 || percentage <= 60) {
            Grade = "D";
        } else {
            Grade = "Below 50 percentage so you need Improvement";
        }

        System.out.println("Student Name :" + name);
        System.out.println("Total Marks : " + totalmarks);
        System.out.println("Average Marks: " + averagemarks);
        System.out.println("Percentage: " + percentage + " %");
        System.out.println("Passed Subjects: " + passedSubjects);
        System.out.println("Failed Subjects: " + failedSubjects);
        System.out.println("Overall Result : " + finalResult);
        System.out.println("Grade: " + Grade);

        if (finalResult == "Pass") {
            System.out.println("Next-Level Eligibility: Eligible");
        } else {
            System.out.println("Next-Level Eligibility: NoT Eligible");
        }

    }
}
