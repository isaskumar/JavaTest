package JavaBasics;

public class ConstructorwithThisKeyword{
	
	String name;
	int age;
	public ConstructorwithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	


public static void main(String args[]) {
	ConstructorwithThisKeyword csk = new ConstructorwithThisKeyword("sasi",22);

}

}