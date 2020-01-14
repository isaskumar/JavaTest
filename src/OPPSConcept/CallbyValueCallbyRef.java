package OPPSConcept;

public class CallbyValueCallbyRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallbyValueCallbyRef ref = new CallbyValueCallbyRef();
		ref.testSum(5, 10);
		
		ref.p = 50;
		ref.q = 100;
		
		ref.swap(ref);
		
		//After Swap
		System.out.println(ref.p);
		System.out.println(ref.q);

	}
	
	public int testSum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(CallbyValueCallbyRef t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
