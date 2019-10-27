
public class CurrentAcc extends BankAccount {
	
	public CurrentAcc(String membername,int accountbalance)
	{
		super(membername,accountbalance,5000);
		
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [membername=" + membername + ", accountnumber="
				+ accountnumber + ", accountbalance=" + accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}

	
}
