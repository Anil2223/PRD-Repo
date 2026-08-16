package AttendanceandConsistencyTracker;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int Present = 0;
        int Absent = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total working days :");
        int totalDay = scanner.nextInt();
        int day = 1;
        while (day <= totalDay) {
            System.out.println("Enter status for day " + day);
            Present += scanner.nextInt();
            Absent += scanner.nextInt();
            day++;
        }

        double Attendancepercentage = ((double) Present / totalDay) * 100;
        double RequiredPercentage = 75.0;
        System.out.println("Total working days: " + totalDay);
        System.out.println("Total Present Days:" + Present);
        System.out.println("Total Absent Days:" + Absent);
        System.out.println("\n");
        System.out.println("Total Attendance : " + Attendancepercentage + "%");
        System.out.println("Required Percentage : " + RequiredPercentage + " %");

        if (Attendancepercentage >= RequiredPercentage) {
            System.out.println("Eligibility Status: Eligible");
            System.out.println("Consistency Status:Good Attendance");
        } else {
            System.out.println("Eligibitlity Status: Not Eligible");
            System.out.println("Need to Improve Consistency !");
        }

    }
}
