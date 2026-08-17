package BankManagementSystem;

public class Bank {
    public static void main(String[] args) {
        String BankName = "";
        int userId = 0;
        String userName = "";
        long accountNumber = 0;
        String accountType = "";
        double balance = 0;

        Customer customer = new Customer(BankName, userId, accountNumber, accountType, balance);
        customer.BankName = "BOB";
        customer.userId = 01;
        customer.accountNumber = 111213;
        customer.userName = "Anil";
        customer.accountType = "Saving";
        customer.balance = 1000.0;

        customer.displayBankDetails();
        customer.displayUserDetails();
        customer.displayAccountDetails();
        customer.createAccountSummary();
        boolean minBalance = customer.minimumBalance();

        String val = minBalance ? "minimum Balance is maintained " : "minimum Balance is not maintained !";
        System.out.println(val);

    }
}
