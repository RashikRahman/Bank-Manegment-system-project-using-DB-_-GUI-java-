import java.util.*;
public class BankAccount {
	String membername,accountnumber;
	int accountbalance,minimumbalance;
	
	public BankAccount(String membername,int accountbalance,int minbalance) {
		super();
		this.membername=membername;
		this.accountbalance=accountbalance;
		this.minimumbalance=minbalance;
		
		
	}
	
	
	
	public void deposit(int amt) {
		accountbalance+=amt;
		}
        public void withdraw(int amt) {

	   if (amt<=accountbalance) {
			
			accountbalance-=amt;
		}
		else 
			System.out.println("Exceeding limit ! ");
	}
	
	public double getbalance() {
		return accountbalance;
	}

	@Override
	public String toString() {
		return "BankAccount [membername=" + membername + ", accountnumber=" + accountnumber + ", accountbalance="
				+ accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}
	
	
}
