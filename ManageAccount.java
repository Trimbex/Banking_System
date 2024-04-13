public class ManageAccount
{
    Customer customer;

    public ManageAccount(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /*
    TODO
     ChangePassword(String NewPassword)
     ChangeUserName(String NewUsername)
     ChangePhoneNumber(String number)
     ChangeAddress(String newaddress)
     */
}
