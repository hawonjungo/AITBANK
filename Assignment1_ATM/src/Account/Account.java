package Account;

import javax.swing.JOptionPane;

public abstract class Account {
	// Create static id for every account
	private static int countId ;
	private int id;
	private double balance;
	private String accType;
	
	// everytime create an account , id will increase by 1	
	public Account() {		
		
	}
	
	public Account(int id, double balance, String accType) {
		
		id = countId;
		this.id = id;
		this.balance = balance;
		this.accType = accType;
	}

	
	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}



	public  void checkBalance() {
		System.out.println("ID: "+ getId());
		System.out.println("Balance: "+ balance);
	}

	public void checkCash() {
		
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			setBalance(getBalance() + amount);
			JOptionPane.showMessageDialog(null, "Deposit success ! " + getBalance());
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid value !");
		}
		
		
	}
	
	public void withdrawal(double amount) {			
			if(getBalance() > amount) {
				setBalance(getBalance() - amount);
				JOptionPane.showMessageDialog(null, "Withdraw success ! " + getBalance());
			}
			else
				JOptionPane.showMessageDialog(null, "Your balance is low " + getBalance());
				
	}
	public abstract void calculateInterestRate();
	
		


}
