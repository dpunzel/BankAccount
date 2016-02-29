/**
 * A checking account is a Bank Account with transaction fees
 */
public class CheckingAccount extends BankAccount
{
   private int    _maxFreeWithdraws;
   private int    _monthlyWithdraws;
   private double _withdrawFee;

   /**
    * Constructs a checking account with an acct number, initial balance maximum
    * withdraws before charges occur, and withdraw fee when charges begin.
    * 
    * @param acct
    *           the account number
    * @param bal
    *           the initial balance
    * @param maxWD
    *           the maximum free withdraws per month without fee
    * @param wdFee
    *           withdraw fee for each withdraw above maximum free withdraws
    */
   public CheckingAccount(int acct, double bal, int maxWD, double wdFee)
   {
      super(acct, bal);
      _maxFreeWithdraws = maxWD;
      _withdrawFee = wdFee;
      _monthlyWithdraws = 0;
   }

   /**
    * Withdraws the amount plus increments the number of withdraws
    * 
    * @param amt
    *           the users amount to be withdrawn
    */
   public void withdraw(double amt)
   {
      super.withdraw(amt);
      _monthlyWithdraws++;
   }

   /**
    * Deducts withdraws fees from account balance and resets transactions to 0
    */
   public void deductFees()
   {
      double fee = 0;

      if (_monthlyWithdraws > _maxFreeWithdraws)
      {
         fee = _withdrawFee * (_monthlyWithdraws - _maxFreeWithdraws);
         super.withdraw(fee);
      }

      // reset transactions for upcoming month
      _monthlyWithdraws = 0;
   }

   /**
    * Gets and returns the current number on monthly withdraws
    * 
    * @return the number of monthly withdraws
    */
   public int getMonthlyWithdraws()
   {
      return _monthlyWithdraws;
   }

}
