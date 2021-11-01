/* This class stores data about a balance account*/

public class Account {
	
	private AccountHolder holder; // This will either be a Corporate or Individual holder
	private double balance = 0.0; // Starting balance
	
	/* Constructor initializes the starting amount for the balance
	 * and the account holder type
	 * @param amt is the balance
	 * @param holder1 is the account holder type
	 */
	
	public Account(double amt, AccountHolder holder1) {
		
		holder = holder1;
		balance = amt;
		
	}
	
	// Deposit will add to the balance
	public void deposit(double amt) {
		
		balance += amt;
	}
	
	// Withdraw will subtract to the balance
	public void withdraw(double amt) {
		
		balance -= amt;
	}
	
	// return the current balance
	public double getBalance() {
		
		return balance;
	}
	
	// return the holder
	public AccountHolder getHolder() {
		
		return holder;
	}
	
	// change the balance
	public void setBalance(double amt) {
		
		balance = amt;
	}
	
	// change the holder
	public void setHolder(AccountHolder holder1) {
		
		holder = holder1;
	}

}
