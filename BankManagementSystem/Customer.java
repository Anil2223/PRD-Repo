package BankManagementSystem;

public class Customer {
    String BankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;
    int minBalance = 500;

    public Customer(String BankName, int userId, long accountNumber, String accountType, double balance) {
        this.BankName = BankName;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name:" + BankName);
        System.out.println("User Id: " + userName);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accountType: " + accountType);

    }

    void displayUserDetails() {
        System.out.println("User Name :" + userName);
        System.out.println("User ID :" + userId);

    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
    }

    void createAccountSummary() {
        System.out.println("The Summary containing the bank name " + BankName + " and" +
                "account number " + accountNumber + ",Account Type " + accountType + "and Balance " + balance);
    }

    boolean minimumBalance() {
        boolean minimumBalance = false;
        if (minBalance <= balance) {
            minimumBalance = true;
        }

        return minimumBalance;

    }

}
