package Account;

public class Fixed extends Account implements WithdrawalLimit{
	private double rate;
	private boolean isBreakContract;
	
	public Fixed() {
		setAccType("Fixed");
	}
	// rate = 0 because rate could relate to contract and can change it later by setRate();
	public Fixed(double rate) {
		this.rate = rate;
		isBreakContract = false;
		setAccType("Fixed");
	}
	// this could use to show user what rate they are getting.
	public double getRate() {
		return rate;
	}
	// for developer changing the rate later
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public void checkCash() {
		// TODO Auto-generated method stub
		
	}



	public Fixed(double rate, boolean isBreakContract) {
		super();
		this.rate = rate;
		this.isBreakContract = isBreakContract;
	}

	
	public void calculateContract() {
		if (isBreakContract == true) {
			// do something here for the withdrawal break contrack
			
		}
		else {
			// still with contract
		}
	}
	@Override
	public void calculateInterestRate() {
		setBalance(getBalance()+(getBalance()*getRate()/250));
		
	}
	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		
	}
}
