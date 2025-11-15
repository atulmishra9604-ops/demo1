package chp8;



public class Emp {
	public static void main(String[] args) {
		try {
String a=null;
System.out.println(a.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
		int x[]= new int[5];
		x[10]=20;
		System.out.println(x);
		}
		catch(Exception d) {
			System.out.println(d);
		}
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		try {
			int c=10/0;
			System.out.println(c);
		}
		catch(Exception f) {
			System.out.println(f);
		}
		finally {
			System.out.println("finnlly block executedss");
		}
		
		System.out.println("hello world");
		System.out.println("hello world");
	}
}
