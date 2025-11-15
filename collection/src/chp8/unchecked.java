package chp8;
class D{
	void d() {
		@SuppressWarnings("all")
		int a= 10/0;
		throw new ArithmeticException();
	}
}
class E extends D{
	void e() {
		try {
			d();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally1");
		}
	}
}
public class unchecked {
public static void main(String[] args) {
	E ob = new E();
	ob.e();
  }

}
