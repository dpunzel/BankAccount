/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
   private double _balance;
   private int    _acctNum;

   /**
    * Constructs a bank account with a given balance and account number.
    * 
    * @param acct
    *           the initial account number
    * @param bal
    *           the initial balance
    */
   public BankAccount(int acct, double bal)
   {
      _balance = bal;
      _acctNum = acct;
   }

   //public void deductFees();
    public void deductFees()
    {

    }
   /**
    * Deposits money into the bank account.
    * 
    * @param amt
    *           the amount to deposit
    */
   public void deposit(double amt)
   {
      _balance = _balance + amt;
   }

   /**
    * Withdraws money from the bank account.
    * 
    * @param amt
    *           the amount to withdraw
    */
   public void withdraw(double amt)
   {
      _balance = _balance - amt;
   }

   /**
    * Gets the current balance of the bank account.
    * 
    * @return the current balance
    */
   public double getBalance()
   {
      return _balance;
   }

   /**
    * Gets the account number of the bank account.
    * 
    * @return the account number
    */
   public int getAcctNumber()
   {
      return _acctNum;
   }
}
