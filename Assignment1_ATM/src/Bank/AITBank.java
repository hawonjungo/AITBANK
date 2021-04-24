/* Not done yet !!
 * Note:- Deposit cash only 10, 20, 50, 100 (condition if).
 * 		- Menu (switch)
 * 		- add more accounts
 */



package Bank;
import Account.Account;
import Account.Cheque;
import Account.Fixed;
import Account.NetSaving;
import Account.Saving;
import gUI.Menu;

public class AITBank {
	static Account[] account = new Account[10];
	public static void main(String[] args) {
		
		
		
		account[0] = new Saving();
		account[0].setId(1111);
		account[0].setBalance(7000);
		((Saving)account[0]).getRate();
		((Saving)account[0]).setLimit(200);
		
		account[1] = new NetSaving();
		account[1].setId(1111);
		account[1].setBalance(25000);
		((NetSaving)account[0]).getRate();
		((NetSaving)account[0]).setLimit(1000);
		
		account[2] = new Cheque();
		account[2].setId(0007);
		account[2].setBalance(40000);
		
		account[3] = new Fixed();
		account[3].setId(7777);
		account[3].setBalance(50000);
		((Fixed)account[0]).getRate();
		
		account[4]  = new Saving();
		account[4].setId(7777);
		account[4].setBalance(2500);
		((Saving)account[4]).getRate();
		((Saving)account[4]).setLimit(200);
		
		
		
		
		
		
		
//		// Create a Saving account and test
//		Saving sav = new Saving();
//		sav.deposit(500);	
//		sav.withdrawal(1100);
//		sav.withdrawal(100);
//		sav.checkBalance();
//
//		
//		NetSaving acc2 = new NetSaving();
//		acc2.deposit(1000);
//		acc2.checkBalance();
//		acc2.withdrawal(1200);
//		
//		// cheque dont have interest rate 
//		Cheque acc3 = new Cheque();
//		acc3.deposit(300);
//		acc3.withdrawal(100);
//		acc3.checkBalance();
//		
//		// Fixed dont have interest rate because it depend on the Contract
//		Fixed acc4 = new Fixed();
//		acc4.deposit(70000);
//		acc4.withdrawal(1050);
//		acc4.checkBalance();
		
		Menu menu = new Menu();
		menu.show();
		
	}
	public static Account[] getAccount() {
		return account;
	}

}
