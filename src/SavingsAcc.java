
public class SavingsAcc extends BankAccount {
	double interest=0.05;
	
	
	public SavingsAcc(String membername, int accountbalance) {
		super(membername, accountbalance, 2000);
		
	}
	
	public double getNetBalance() {
		double netbalance=accountbalance;
		netbalance=netbalance+(netbalance*interest);
		return netbalance;
		
	}
	
	
	

	@Override
	public String toString() {
		return "SavingsAcc [interest=" + interest + ", membername="
				+ membername + ", accountnumber=" + accountnumber + ", accountbalance=" + accountbalance
				+ ", minimumbalance=" + minimumbalance + "]";
	}
	
	
}
