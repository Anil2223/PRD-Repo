package BankManagementSystem;

public class User {
    String BankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

}
