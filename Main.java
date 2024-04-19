public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer cus = new Customer("youssef", "mahmoud", "yo", "123", "0100398", "dff", "checking", 22);
        // Deposit some amount to the customer's account
        cus.deposit(100);
        // Display account details and transaction history
        cus.displayaccountdetails();
        cus.gettranshistory();

        // Create another customer
        Customer cus2 = new Customer("saif", "mahmoud", "sa", "1232", "0100398", "dff", "saving", 40);
        // Add the first customer to the customer list and login info
        Customer.logininfo.put(cus.getUsername(), cus.getPassword());
        Customer.customers.add(cus);

        // Change some details of the second customer
        ManageAccount manageAccount = new ManageAccount(cus2);
        manageAccount.changePassword("2222222");
        manageAccount.changeUserName("newUsername");
        manageAccount.changePhoneNumber("newPhoneNumber");
        manageAccount.changeAddress("newAddress");

        // Display the updated details of the second customer
        System.out.println(cus2.getUsername());
        System.out.println(cus2.getPhoneNo());
        System.out.println(cus2.getAddress());

        // Test LoanProcessing
        LoanProcessing loanProcessing = new LoanProcessing(cus);
        double loanRate = 0.1; // 10%
        boolean fixedRate = true;
        String term = "Short term";
        String purpose = "Business";

        // Apply for a loan
        loanProcessing.ApplyForLoan(cus, loanRate, fixedRate, term, purpose);

        // Check if the customer is eligible for the loan
        boolean isEligible = loanProcessing.CheckEligibility(cus, loanRate, fixedRate, term, purpose);
        if (isEligible) {
            System.out.println("Customer is eligible for the loan.");
        } else {
            System.out.println("Customer is not eligible for the loan.");
        }

        // Calculate and display the interest for the loan
        double interest = loanProcessing.CalculateInterest(cus, loanRate, fixedRate);
        System.out.println("Interest for the loan: " + interest);
    }
}
