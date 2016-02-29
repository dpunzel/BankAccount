/**
 * A child savings account is a Bank Account with interest & matching monies
 */
public class ChildSavingsAccount extends SavingsAccount
{
   private double _matchingRate;

   /**
    * Constructs a childs savings account with acct number, initial balance,
    * interest rate, and a matching funds rate
    * 
    * @param acct
    *           the account number
    * @param bal
    *           the initial balance
    * @param intRate
    *           the interest rate
    * @param matchRate
    *           the matching rate
    */
   public ChildSavingsAccount(int acct, double bal, double intRate,
         double matchRate)
   {
      super(acct, bal, intRate);
      _matchingRate = matchRate;
   }


   /**
    * Gets and returns the matching rate percentage
    * 
    * @return the matching rate
    */
   public double getMatchRate()
   {
      return _matchingRate;
   }

   /**
    * deposits the amount plus the bank's matching monies
    * 
    * @param amt
    *           the child's deposit amount
    */
   public void deposit(double amt)
   {
      double matchingMonies = amt * _matchingRate;
      super.deposit(amt + matchingMonies);
   }

}
