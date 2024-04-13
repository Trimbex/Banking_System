import java.util.ArrayList;
import java.util.HashMap;

public class Customer
{

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    private static int nextuID = 1;

    String UID;
    String FName;
    String LName;
    String Username;
    String Password;
    String PhoneNo;
    String Address;

    BankAccount Account;

    public Customer(String UID, String FName, String LName, String username, String password, String phoneNo, String address, BankAccount account) {
        this.UID =  GenerateUserID() ;
        this.FName = FName;
        this.LName = LName;
        Username = username;
        Password = password;
        PhoneNo = phoneNo;
        Address = address;

        Account = account;
    }

    public String getID() {
        return UID;
    }

    public void setID(String UID) {
        this.UID = UID;
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


    public BankAccount getAccount() {
        return Account;
    }

    public void setAccount(BankAccount account) {
        Account = account;
    }

    public Customer getCustomerByName(String userName) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(userName)) {
                return customer;
            }
        }
        return null; 
    }

    public  String GenerateUserID() {
       
        String role = "CUS"; 
        String generatedUserID = role + String.format("%03d", nextuID++);
        return generatedUserID;
    }

}





/*
TODO:
  GetCustomerByName(String UserName) (returns customer object) Done
  GenerateUserID() Done

 */




