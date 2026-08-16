package HealthandFitnessStatusCalculator;

import java.util.Scanner;

public class Health {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        System.out.println("Height in metres: ");
        double Height = scanner.nextDouble();
        System.out.println("Enter weight in kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter Age:");
        int Age = scanner.nextInt();
        System.out.println("Enter daily active hours: ");
        Double dailyHours = scanner.nextDouble();
        System.out.println("Enter Daily water in Take: ");
        int WaterIntake = scanner.nextInt();
        System.out.println("Enter Daily Sleep Hourse: ");
        int sleepHours = scanner.nextInt();

        Double BMI = weight / (Height * Height);
        System.out.println("Name: " + name);
        System.out.println("BMI: " + BMI);

        if (BMI <= 18.5) {
            System.out.println("BMI Category: " + "Under weight");
        } else if (18.5 <= BMI && BMI <= 25) {
            System.out.println("BMI Category: " + "Normal weight");
        } else if (25 < BMI && BMI < 30) {
            System.out.println("BMI Category: " + "Overweight");
        } else {
            System.out.println("IBM category: " + "30 and above:Obese");
        }

        if (dailyHours >= 1) {
            System.out.println("Activity Status: " + dailyHours + " is good .");
        } else {
            System.out.println("Not good Activitis hourse!");
        }

        if (WaterIntake >= 2) {
            System.out.println("Wanter-intake status : " + WaterIntake + " litres is good ");
        } else {
            System.out.println("not good water intake ");
        }

        if (sleepHours >= 7 && sleepHours <= 9) {
            System.out.println("Sleep status: " + "hours is healthy .");
        } else {
            System.out.println("its less than 7 hours ,not good for health !");
        }

        String fineHealth = dailyHours >= 1 && WaterIntake >= 2 && sleepHours >= 7 && sleepHours <= 9 ? "Healthy"
                : "UnHealthy";

        System.out.println("Overall Fintness Status: " + fineHealth);

        boolean message = dailyHours >= 1 && WaterIntake >= 2 && sleepHours >= 7 && sleepHours <= 9;

        if (message) {
            System.out.println("Message: Continue maintaining the same routine.");
        } else {
            System.out.println("You are not able to maintain the Routine,maintain please.");
        }

    }
}
