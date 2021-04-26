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
	
	public static void AITBank() {
		
		account[0] = new Saving();
		account[0].setId(1111);
		account[0].setBalance(7000);
		((Saving)account[0]).setRate(10);
		((Saving)account[0]).setLimit(200);
		
		account[1] = new NetSaving();
		account[1].setId(1111);
		account[1].setBalance(25000);
		((NetSaving)account[1]).setRate(15);
		((NetSaving)account[1]).setLimit(1000);
		
		account[2] = new Cheque();
		account[2].setId(1007);
		account[2].setBalance(40000);
		
		account[3] = new Fixed();
		account[3].setId(7777);
		account[3].setBalance(50000);
		((Fixed)account[3]).setRate(20);
		
		account[4]  = new Saving();
		account[4].setId(7777);
		account[4].setBalance(2500);
		((Saving)account[4]).setRate(10);
		((Saving)account[4]).setLimit(200);
		
	}


	public static Account[] getAccount() {
		return account;
	}

}
