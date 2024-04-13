import java.util.ArrayList;

public class BankAccount
{

    String AccountType;
    double InitialBalance;

    ArrayList<Transactions> transactions ;//Transaction Log

    public BankAccount(String accountType,double initialBalance) {
        AccountType = accountType;
        transactions = new ArrayList<>();
        InitialBalance   = initialBalance;
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

    public void PerformTransaction( String TransactionType, double amount){

        if(TransactionType== "deposit"){
            InitialBalance+= amount;
            Transactions currtransaction = new Transactions(TransactionType, amount);
           transactions.add(currtransaction);

        }
        if(TransactionType== "withdraw"){
            if(InitialBalance > amount) {


                InitialBalance -= amount;
                Transactions currtransaction = new Transactions(TransactionType, amount);
                transactions.add(currtransaction);
            }
            else{
                System.out.println("Insufficient amount for withdrawal");
            }
        }

    }



}
/*
TODO:
 PerformTransaction(Transactions transaction, double amount);
 GetTransactionHistory()
 DisplayAccountDetails()
 */
