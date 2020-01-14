package OPPSConcept1;

public interface USBank {
	
	
	int min_balance = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	
	
	//only method declaration
	//no method body - only method prototype
	//in interface we can declare the variables, vars are default static in nature
	//vars value will not be changed
	//no static method in interface
	//no main method in interface
	//we can not create object of interface
	//interface abstract in nature

}
