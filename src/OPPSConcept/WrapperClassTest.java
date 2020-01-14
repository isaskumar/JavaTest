package OPPSConcept;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "14.5";
		System.out.println(y);
		
		double j = Double.parseDouble(y);
		System.out.println(j+10);
		
		String z= "true";
		boolean k =Boolean.parseBoolean(z);
		System.out.println(k);
		
		int m = 200;
		System.out.println(m+2);
		
		String c = String.valueOf(m);
		System.out.println(c+20);

	}

}
