package Bank;

public class User {
    String BankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;
    double minBalance = 500;

    public User(String BankName, int userId, long accountNumber, String accountType, double balance) {
        this.BankName = BankName;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Details ");
        System.out.println("Bank Name:" + BankName);
        System.out.println("accountNumber: " + accountNumber);

    }

    void displayUserDetails() {
        System.out.println("User Name :" + userName);
        System.out.println("User ID :" + userId);

    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }

    void createAccountSummary() {
        System.out.println("The Summary containing the bank name " + BankName + " and" +
                "account number " + accountNumber + ",Account Type " + accountType + "and Balance " + balance);
    }

    // deposit balance deposit
    boolean deposit(double amount) {
        if (amount > -1) {
            balance += amount;

            return true;
        } else {
            return false;
        }
    }

    // minimum balance
    boolean minimumBalance() {

        if (balance > minBalance) {

            return true;
        } else {
            return false;
        }

    }

    // withdraw amount .
    boolean withdraw(double amount) {
        if (amount < balance && balance > minBalance) {
            return true;
        } else {
            return false;
        }
    }

    // Check Balance
    double checkBalance() {
        return balance;
    }

}
