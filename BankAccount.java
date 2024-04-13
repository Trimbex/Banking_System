import java.util.ArrayList;

public class BankAccount
{

    String AccountType;
    double InitialBalance;

    ArrayList<String> Transactions = new ArrayList<>(); //Transaction Log

    public BankAccount(String accountType) {
        AccountType = accountType;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public double getInitialBalance() {
        return InitialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        InitialBalance = initialBalance;
    }


}
/*
TODO:
 PerformTransaction(Transactions transaction, double amount);
 GetTransactionHistory()
 DisplayAccountDetails()
 */
