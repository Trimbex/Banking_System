public class BankAccount
{

    String AccountType;
    double InitialBalance;

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
//TODO: Transaction history

}
