package OPPSConcept;

public class StaticandNonStatic {
	
	String name = "sasi";
	static int age = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();
		
		StaticandNonStatic.sum();
		
		System.out.println(age);
		
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.sendMail();
		System.out.println(obj.age);

	}
	
	public void sendMail()
	{
		System.out.println("send mail method");
	}
	
	public static void sum()
	{
		System.out.println("sum method");
	}

}
