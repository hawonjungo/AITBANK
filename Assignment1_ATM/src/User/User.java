package User;

import Account.Account;
import Bank.AITBank;
import gUI.Menu;

public class User {
	private int userId;
	private int userPassword;
	private String name;
	public User() {
		
	}
	public User(int userId, int userPassword, String name) {
	
		this.userId = userId;
		this.userPassword = userPassword;
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	static User[] user = new User[3];
	public static void UserAccount() {
		user[0] = new User(1111,2222,"Jun");
		user[1] = new User(1007,0000,"GoGo");
		user[3] = new User(7777,9999,"JunGo");
	}
	public static User[] getUser() {
		return user;
	}
	
	Account[] account = AITBank.getAccount();
	
	
}
