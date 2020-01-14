package OPPSConcept;

public class LocalVsGlobalVariable {
	
	String name = "sasi";
	int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		System.out.println(i);
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void sum() {
		int i = 10;
		int j = 20;
	}

}
