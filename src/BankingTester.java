/**
 * A tester class to demonstrate inheritance using class hierarchy
 */
public class BankingTester
{

   public static void main(String[] args)
   {
      // create checking and savings accounts of all types

      // checking: acct:1111, bal:$1000, 3 free withdraws, $1.50 wd fee >=4
      CheckingAccount myChecking = new CheckingAccount(1111, 1000, 3, 1.5);

      // savings: acct:2222, bal:$1000, 10% interest (that would be awesome)
      SavingsAccount mySavings = new SavingsAccount(2222, 1000, 0.10);

      // child: acct:3333, bal:$100, 5% interest, 1% matching from bank on
      // deposits to account
      ChildSavingsAccount myGirls = new ChildSavingsAccount(3333, 100, 0.05,
            0.01);

      
      // print balances
      System.out.println("\nEXPECTED: Checking-$1000, Savings-$1000, Child-$100");
      System.out.printf("Checking Balance $%.2f\n", myChecking.getBalance());
      System.out.printf("Savings Balance $%.2f\n", mySavings.getBalance());
      System.out.printf("Childs Balance $%.2f\n", myGirls.getBalance());
      
      // deposit $100 to all savings accounts
      mySavings.deposit(100);
      myGirls.deposit(100);
      
      // print balances
      System.out.println("\nEXPECTED: Checking-$1000, Savings-$1100, Child-$201");
      System.out.printf("Checking Balance $%.2f\n", myChecking.getBalance());
      System.out.printf("Savings Balance $%.2f\n", mySavings.getBalance());
      System.out.printf("Childs Balance $%.2f\n", myGirls.getBalance());
      
      // make four withdraws from checking (the first 3 are free, the last we 
      // should be charged an extra $1.50) Four withdraws of $100 and then
      // deduct fees should deduct $1.50
      myChecking.withdraw(100);
      myChecking.withdraw(100);
      myChecking.withdraw(100);
      myChecking.withdraw(100);
      myChecking.deductFees();

      // print balances
      System.out.println("\nEXPECTED: Checking-$598.50, Savings-$1100, Child-$201");
      System.out.printf("Checking Balance $%.2f\n", myChecking.getBalance());
      System.out.printf("Savings Balance $%.2f\n", mySavings.getBalance());
      System.out.printf("Childs Balance $%.2f\n", myGirls.getBalance());

      
   }

}
