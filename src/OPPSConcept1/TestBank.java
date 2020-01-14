package OPPSConcept1;

public class TestBank {
	
	public static void main(String args[]) {
		
		System.out.println(USBank.min_balance);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carLoan();
		
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
	}

}
