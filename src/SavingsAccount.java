/**
 * A savings account is a Bank Account with interest
 */
public class SavingsAccount extends BankAccount
{
   private double _monthlyInterestRate;

   /**
    * Constructs a savings account with a given balance and account number and
    * interest rate.
    * 
    * @param acct
    *           the account number
    * @param bal
    *           the initial balance
    * @param intRate
    *           the interest rate
    */
   public SavingsAccount(int acct, double bal, double intRate)
   {
      super(acct, bal);
      _monthlyInterestRate = intRate;
   }

   /**
    * Gets and returns the annual interest rate
    * 
    * @return the annual interest rate
    */
   public double getInterestRate()
   {
      return _monthlyInterestRate;
   }
   
   /**
    * Deposits the monthly interest rate times the current balance
    */
   public void creditInterest()
   {
      deposit(getBalance() * _monthlyInterestRate);
   }
   
}
