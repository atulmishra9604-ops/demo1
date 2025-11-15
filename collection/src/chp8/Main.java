package chp8;
class A{
	void a() throws Exception{
		
	}
}
class B extends A{
	void b()throws Exception{
		a();
		
	}
}
class C extends B{
	void c() {
		try {
			b();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("finally");
		}
	}
}
public class Main {
public static void main(String[] args) {
	C ob = new C();
    ob.c();
}
    
    
	

}
