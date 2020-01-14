package JavaBasics;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		
		f1 = null;
		f2 = null;
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.gc();
		
	/*	final: is a Keyword
		1. final can be used to mark a variable "unchangeable".
		2. final can also make a method not "overrideable"
		3. final can also make a class not "inheritable". i.e. the class can not be subclassed.

		finally: is a Block
		finally is used in a try/catch statement to execute code "always".

		finalize: is a Method
		finalize is called when an object is garbage collected. You rarely need to override it.*/
	}

}
