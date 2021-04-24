package Account;

// because only some account have the limit
public interface WithdrawalLimit {
	// withdrawal litmit daily or monthly will depend on the parameter input in body
	public void withdrawalLimit();
	
}
