package Account;

// WithdrawalLimit already extends the Transaction , so the Saving account ( class) can use those functions.
public class Saving extends Account implements WithdrawalLimit{
	private double rate ;
	private double limit =1000;

	
	// set default rate when create an account
	public Saving() {
		setAccType("Saving");
		
	}
	public Saving(double rate, double limit) {
		super();
		this.rate = rate;
		this.limit = limit;
		setAccType("Saving");
	}
	// this could use to show user what rate they are getting.
	public double getRate() {
		return rate;
	}
	// for developer changing the rate later
	void setRate(double rate) {
		this.rate = rate;
	}
	// show user ther withdrawal limit
	public double getLimit() {
		return limit;
	}
	// for function that user can change the limit
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	
	@Override
	public void withdrawal(double amount) {
		checkCash(); // check 20, 50 and 100 notes
		withdrawalLimit(); // check monthly limit
		if(amount < limit) {
			if(getBalance() > amount) {
				setBalance(getBalance() - amount);
			}
			else
				System.out.println("The balance is not enough");
		}
		else
			System.out.println("Withdraw over limit");
		
	
	}

	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calculateInterestRate() {
				setBalance(getBalance()+(getBalance()*getRate()/100));
		
	}


	








	
	
	
}
