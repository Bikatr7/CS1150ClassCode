public class Worksheet7 
{

	   public static void main(String[] args) 
	   {
		
		BankAccount myAccount = new BankAccount(1234, 500);
		
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getAccountNumber());
		
		myAccount.setAccountNumber(12345);
		myAccount.setBalance(0);
		
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getAccountNumber());
		
	   }

}


class BankAccount 

{
	   private int accountNumber;
	   private double balance;
	
	   public BankAccount(int accountNumber, double balance) 
	   {
		this.accountNumber = accountNumber;
		this.balance = balance;
	   }
	   
	   public int getAccountNumber()
	   {
		   return this.accountNumber;
	   }
	   
	   public double getBalance()
	   {
		   return this.balance;
	   }
	
	   public void setAccountNumber(int accountNumber)
	   {
		   this.accountNumber = accountNumber;
	   }
	   
	   public void setBalance(double balance)
	   {
		  this.balance = balance;
	   }
		
	
	
	
} // BankAccount



