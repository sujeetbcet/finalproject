package Javapractice;


public class Comparision {
	static String s="Comparision";
	static String t="Comparision";
	static String k=t;
	
	public static void main(String[] args) {
		int i=10;
		int j=10;
		Demo rv = new Demo();
		Demo rv2 = new Demo();
		Demo rv3=rv;
		System.out.println(rv.equals(rv2));
		System.out.println(rv.equals(rv3));
		System.out.println(rv==rv2);
		
		System.out.println("=====================");
		
		System.out.println(s==t);
		System.out.println(s.equals(t));
		System.out.println(t.equals(k));
		
		System.out.println(i==j);
		
	}

}

class Demo1{
	int i=10;
	
}
