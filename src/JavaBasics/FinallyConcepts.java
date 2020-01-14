package JavaBasics;

public class FinallyConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		division();
	}
	
	public static void test1() {
		try {
			System.out.println("test method1");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside the test 2");
		} finally {
			System.out.println("inside the test 2 finally block method");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("try block");
			int k = i/0;
		} catch(ArithmeticException e) {
			System.out.println("inside the catch block");
			System.out.println("divide by zero error");
		} finally {
			System.out.println("execute this code after exception");
		}
	}
	
	

}
