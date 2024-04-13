public class LoanProcessing
{

   int LoanId;

   String term;

   String status; //approved rejected etc

   boolean IsRateFixed; // If false, then variable

   double rate;

   String Purpose;

   Customer customer;



   public LoanProcessing(Customer customer) {
      this.customer = customer;
   }

   public Customer getCustomer() {
      return customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }
}


/*
TODO:
 ApplyForLoan(Customer customer, double rate , boolean ratetype, String Term, String Purpose) return void
 CalculateInterest(Customer customer,double rate,boolean ratetype)
 CheckEligibility(Customer customer , double rate , boolean ratetype , String Term , String Purpose)
 */

