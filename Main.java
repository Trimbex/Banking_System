public class Main {
    public static void main(String[] args)
    {
        System.out.println("fgfg");

            Customer cus = new Customer("youssef","mahmoud","yo","123","0100398","dff","checking",22);

            cus.deposit(100);

            cus.displayaccountdetails();
            cus.gettranshistory();

        Customer cus2 = new Customer("saif","mahmoud","sa","1232","0100398","dff","saving",40);
        cus2.withdraw(10);

        cus2.displayaccountdetails();
        cus2.gettranshistory();
    }
}