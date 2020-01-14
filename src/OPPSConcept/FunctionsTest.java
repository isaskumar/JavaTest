package OPPSConcept;

public class FunctionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsTest obj = new FunctionsTest();
		obj.test();
		int ans = obj.pqr();
		System.out.println(ans);
		String s1 = obj.qa();
		System.out.println(s1);
		int d1 = obj.division(6, 2);
		System.out.println(d1);

	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = 30;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String s = "selenium";
		return s;
				
	}
	
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}

}
