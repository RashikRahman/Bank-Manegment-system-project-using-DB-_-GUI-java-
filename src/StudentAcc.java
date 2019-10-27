
public class StudentAcc extends SavingsAcc {
	
	
	public StudentAcc(String membername, int accountbalance) {
		super(membername, accountbalance);
		
	}

	
	@Override
	public String toString() {
		return "StudentAcc [interest=" + interest + ", membername=" + membername + ", accountnumber=" + accountnumber
				+ ", accountbalance=" + accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}

//	double maxLimit()
//	{
//		return maximumwithdraw;
//	}
	
	
}
