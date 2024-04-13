public class Customer
{
    int ID;
    String FName;



    String LName;

    String Username;

    String Password;

    String PhoneNo;
    String Address;

    Card card;

    BankAccount Account;

    public Customer(int ID, String FName, String LName, String username, String password, String phoneNo, String address, Card card, BankAccount account) {
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
        Username = username;
        Password = password;
        PhoneNo = phoneNo;
        Address = address;
        this.card = card;
        Account = account;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankAccount getAccount() {
        return Account;
    }

    public void setAccount(BankAccount account) {
        Account = account;
    }
}




