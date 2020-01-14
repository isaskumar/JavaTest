package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "web");
		h.put("C", "Mobile");
		
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(23, 100);
		h1.put(24, 200);
		h1.put(25, 300);
		
		Hashtable<String,String> s1 = new Hashtable<String,String>();
		s1.put("1", "sam");
	}

}
