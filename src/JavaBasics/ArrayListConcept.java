package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String args[]) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(50);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		ar.add(400);
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.get(4));
		
		System.out.println(ar.get(5));
		
		System.out.println("**********");
		
		System.out.println(ar.size());
		
		
		ar.remove(6);
		
		System.out.println(ar.size());
		
		//to get all the values
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(700);
		ar1.add(800);
		ar1.add(900);
		ar1.add(1000);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("sasikumar");
		
	}

}
