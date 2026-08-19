package Bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String BankName = "";
        int userId = 0;
        String userName = "";
        long accountNumber = 0;
        String accountType = "";
        double balance = 0;

        User user = new User(BankName, userId, accountNumber, accountType, balance);
        user.BankName = "BOB";
        user.userId = 01;
        user.accountNumber = 111213;
        user.userName = "Anil";
        user.accountType = "Saving";
        user.balance = 1000.0;

        user.displayBankDetails();
        user.displayUserDetails();
        user.displayAccountDetails();
        user.createAccountSummary();
        boolean deposit = user.deposit(balance);
        boolean minBalance = user.minimumBalance();
        String val = deposit ? "Deposit Successfully  " : " Not deposite !";
        String minVal = minBalance ? "Minimum balance available " : " Not maintain minimum Balance";

        double withdrawamount = 500;

        boolean withdraw = user.deposit(withdrawamount);
        String withdrawResult = withdraw ? "withdraw Successful." : "balance is insufficient";

        double currentBalance = user.checkBalance();
        
        System.out.println(minVal);
        System.out.println(val);
        System.out.println(withdrawResult);
        System.out.println("Current Balance: " + currentBalance);






        
    }

}
