
public class Account {
	
	private AccountHolder holder;
	private double balance = 0.0;
	
	public Account(double amt, AccountHolder holder1) {
		
		holder = holder1;
		balance = amt;
		
	}
	
	public void deposit(double amt) {
		
		balance += amt;
	}
	
	public void withdraw(double amt) {
		
		balance -= amt;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public AccountHolder getHolder() {
		
		return holder;
	}
	
	public void setBalance(double amt) {
		
		balance = amt;
	}
	
	public void setHolder(AccountHolder holder1) {
		
		holder = holder1;
	}

}
