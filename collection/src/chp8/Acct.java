package chp8;



public class Acct {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=50/0;
	    }catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException d) {
			System.out.println(d);
		}catch(Exception s) {
			System.out.println(s);
		}
		System.out.println("rest of the code");
	}

}
