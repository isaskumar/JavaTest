package JavaBasics;

public class ConstructorConcept {
	
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("i---"+i);
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("multiple parameter constructor");
		System.out.println("i--j-"+i);
	}
	
	public static void main(String args[]) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
	}

}
