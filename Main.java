public class Main {
    public static void main(String[] args)
    {
        System.out.println("fgfg");

            Customer cus = new Customer("youssef","mahmoud","yo","123","0100398","dff","checking",22);

            cus.deposit(100);

            cus.displayaccountdetails();
            cus.gettranshistory();

        Customer cus2 = new Customer("saif","mahmoud","sa","1232","0100398","dff","saving",40);

        Customer.logininfo.put(cus.getUsername(),cus.getPassword());
        Customer.customers.add(cus);

        ManageAccount manageAccount = new ManageAccount(cus2);
        System.out.println(cus2.getPassword());

        manageAccount.changePassword("2222222");
        System.out.println(cus2.getPassword());

        manageAccount.changeUserName("newUsername");
        manageAccount.changePhoneNumber("newPhoneNumber");
        manageAccount.changeAddress("newAddress");
        System.out.println(cus2.getUsername());
        System.out.println(cus2.getPhoneNo());
        System.out.println(cus2.getAddress());

        
    }
}