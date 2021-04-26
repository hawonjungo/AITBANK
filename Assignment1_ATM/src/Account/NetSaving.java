package Account;

public class NetSaving extends Account implements WithdrawalLimit {

	private double rate ;
	private double limit ;

	
	public NetSaving( ) {
		setAccType("Net Saving");
	}
		
	public NetSaving(double rate, double limit) {
		super();
		setBalance(0);
		this.rate = rate;
		this.limit = limit;
		setAccType("Net Saving");
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
