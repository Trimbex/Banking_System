public class Transactions
{
    String TransactionType;
    double amount;

    String Date;

    public Transactions(String transactionType, double amount) {
        TransactionType = transactionType;
        this.amount = amount;

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

    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append("--------------------------------------\n");
        sb.append("              TRANSACTION              \n");
        sb.append("--------------------------------------\n");


        switch (TransactionType) {
            case "deposit":
                sb.append("Type:    Deposit\n");
                break;
            case "withdraw":
                sb.append("Type:    Withdrawal\n");
                break;
            case "inquiry":
                sb.append("Type:    Balance Inquiry\n");
                break;
            default:
                sb.append("Type:    Unknown\n");
                break;
        }

        sb.append("Amount:  $" + amount).append("\n");
        sb.append("--------------------------------------\n");
        sb.append("\n");
        sb.append("--------------------------------------\n");

        return sb.toString();
    }
}

/*
*
* TODO:
*  ONLY FUNCTIONALITIES
*  Withdraw(double amount)
*  Deposit(double amount)
*  Transfer(Customer customer, double amount)
*
*
* */
