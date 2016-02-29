import java.util.ArrayList;

/**
 * A tester class to demonstrate inheritance using class hierarchy
 * POLYMORPHISM EXAMPLE - With two compile errors (on purpose)
 */
public class BankingTester_Polymorphic
{

   public static void main(String[] args)
   {
      // create collection of all types
      ArrayList<BankAccount> accts = new ArrayList<>();

      // add checking: acct:1111, bal:$1000, 3 free withdraws, $1.50 wd fee >=4
      accts.add(new CheckingAccount(1111, 1000, 3, 1.5));

      // add savings: acct:2222, bal:$1000, 10% interest (that would be awesome)
      accts.add(new SavingsAccount(2222, 1000, 0.10));

      // add child: acct:3333, bal:$100, 5% interest, 1% matching from bank on
      // deposits to account
      accts.add(new ChildSavingsAccount(3333, 100, 0.05, 0.01));

      
      // print balances
      System.out.println("\nEXPECTED: $1000, $1000, $100");
      for(BankAccount account : accts)
      {
      	 System.out.printf("Balance $%.2f\n", account.getBalance());
	  }
	        
      // deposit $100 to all accounts
      for(int i = 0; i < accts.size(); i++)
      {
      	 accts.get(i).deposit(100);
	  }
	  
      // print balances
      System.out.println("\nEXPECTED: $1100, $1100, $201");
      for(BankAccount account : accts)
      {
      	 System.out.printf("Balance $%.2f\n", account.getBalance());
	  }
      
      // make four withdraws from checking (the first 3 are free, the last we 
      // should be charged an extra $1.50) Four withdraws of $100 and then
      // deduct fees should deduct $1.50
      accts.get(0).withdraw(100);
      accts.get(0).withdraw(100);
      accts.get(0).withdraw(100);
      accts.get(0).withdraw(100);
      accts.get(0).deductFees();

       System.out.println("\nEXPECTED: $698.50, $1100, $201");
       for(BankAccount account : accts)
       {
           System.out.printf("Balance $%.2f\n", account.getBalance());
       }

   }

}
