package Account;

public class NetSaving extends Account implements WithdrawalLimit {

	private double rate;
	private double limit ;

	
	public NetSaving( ) {
		setAccType("NetSaving");
	}
		
	public NetSaving(double rate, double limit) {
		super();
		setBalance(0);
		this.rate = rate;
		this.limit = limit;
		setAccType("NetSaving");
	}


	public double getLimit() {
		return limit;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
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
	// input the body with Monthly parameter
	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateInterestRate() {
		setBalance(getBalance()+(getBalance()*getRate()/150));
		
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public void checkCash() {
		// TODO Auto-generated method stub
		
	}




}
