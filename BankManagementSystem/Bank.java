package BankManagementSystem;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bank Name:");
        String BankName = scanner.nextLine();
        System.out.println("Enter User ID:");
        int userId = scanner.nextInt();
        System.out.println("Enter userNmae :");
        String userName = scanner.nextLine();
        System.out.println("Enter Account number:");
        long accountNumber = scanner.nextLong();
        System.out.println("Enter Account type: ");
        String accountType = scanner.nextLine();
        System.out.println("Enter Balance: ");
        double balance = scanner.nextDouble();
        scanner.close();
        ;
        User user = new User();
        user.BankName = BankName;
        user.userId = userId;
        user.userName = userName;
        user.accountNumber = accountNumber;
        user.accountType = accountType;
        user.balance = balance;

        user.deposit(balance);

    }
}
