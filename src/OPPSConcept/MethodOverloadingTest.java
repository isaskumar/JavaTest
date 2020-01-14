package OPPSConcept;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTest obj = new MethodOverloadingTest();
		obj.sum();
		obj.sum(5);
		obj.sum(5, 10);
		obj.sum(5,10,15);
		

	}
	
	public void sum()
	{
		System.out.println("sum method");
	}
	
	public void sum(int i)
	{
		System.out.println("sum method 1");
	}
	
	public void sum(int i, int j)
	{
		System.out.println("sum method 2");
	}
	
	public void sum(int i, int j,int k)
	{
		System.out.println("sum method 3");
	}

}
