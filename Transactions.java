public class Transactions
{
    String TransactionType;
    double amount;

    String Date;

    public Transactions(String transactionType, double amount, String date) {
        TransactionType = transactionType;
        this.amount = amount;
        Date = date;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
