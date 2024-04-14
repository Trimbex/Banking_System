import java.util.Scanner;

public class Register {
    
    public Register() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter first name:");
        String FName = scanner.nextLine();
        
        System.out.println("Enter last name:");
        String LName = scanner.nextLine();
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        System.out.println("Enter phone number:");
        String phoneNo = scanner.nextLine();
        
        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Enter account type:");
        String accountType = scanner.nextLine();
        
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        
        
        
        BankAccount account = new BankAccount(accountType, initialBalance);
        Customer newCustomer = new Customer(FName, LName, username, password, phoneNo, address, accountType, initialBalance);
        
        
        Customer.customers.add(newCustomer);
        
       
        Customer.logininfo.put(username, password);
        
        
        newCustomer.setID(newCustomer.getID());
    }
}
