package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		
		System.out.println(i.length);
		
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		
		String s[] = new String[3];
		s[0] = "sasi";
		s[1] = "kumar";
		s[2] = "semmalai";
		
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//object array used to store the different value
		
		Object ob[] = new Object[6];
		
		ob[0] = "sasi";
		ob[1] = 25;
		ob[2] = "24/10/1990";
		ob[3] = 's';
		
		System.out.println(ob[2]);
	}

}
