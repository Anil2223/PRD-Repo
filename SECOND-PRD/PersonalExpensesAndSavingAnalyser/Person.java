package PersonalExpensesAndSavingAnalyser;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        int MonthlyIncome;
        int HomeContribution;
        int Rent;
        int FoodExpenses;
        int TravelExpenses;
        int EducationExpenses;
        int OtherExpenses;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter monthly Income:");
        MonthlyIncome = scanner.nextInt();
        System.out.println("Enter Home Contribution: ");
        HomeContribution = scanner.nextInt();
        System.out.println("Enter Rent expense:");
        Rent = scanner.nextInt();
        System.out.println("Food Expenses:");
        FoodExpenses = scanner.nextInt();
        System.out.println("TravelExpenses:");
        TravelExpenses = scanner.nextInt();
        System.out.println("Enter Education Expenses:");
        EducationExpenses = scanner.nextInt();
        System.out.println("Other Expenses:");
        OtherExpenses = scanner.nextInt();

        int totalExpenses = HomeContribution + Rent + FoodExpenses + FoodExpenses + TravelExpenses + EducationExpenses
                + OtherExpenses;
        System.out.println("\n");
        if (totalExpenses > MonthlyIncome) {
            System.out.println("Expenses Exceed max limit of Monthly Income");
            System.out.println("it can't calculated or Analyse !");
        } else {
            System.out.println("Monthly InCome: " + MonthlyIncome);
            System.out.println("Total Expenses:" + totalExpenses);
            int savings = MonthlyIncome - totalExpenses;
            System.out.println("Savings: " + savings);

            System.out.println("\n");

            double ExpensesPercentage = ((double) totalExpenses / MonthlyIncome) * 100;
            double SavingsPercentage = ((double) savings / MonthlyIncome) * 100;

            System.out.println("Expenses Percentage:" + ExpensesPercentage + " %");
            System.out.println("Savings Percentage: " + SavingsPercentage + " %");

            System.out.println("\n");
            if (SavingsPercentage < 10) {
                System.out.println("Financial Category: " + "Critical");
            } else if (SavingsPercentage > 10 && SavingsPercentage < 20) {
                System.out.println("Financial Category: " + "Need Improvement");
            } else if (SavingsPercentage > 20 && SavingsPercentage < 30) {
                System.out.println("Financial Category: " + "Good");
            } else {
                System.out.println("Financial Category:" + "Excellent");
                System.out.println("Message: Savings are healthy but can be improved.");
            }

        }

    }
}
