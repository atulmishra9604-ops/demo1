package vector;


import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 =new EmpPojo(10, "atul", 10000);
		EmpPojo empPojo2 =new EmpPojo(20, "sahil", 30000);
		EmpPojo empPojo3 =new EmpPojo(30, "raj", 55000);
	
		Vector<EmpPojo>empPojos=new Vector<EmpPojo>();
	empPojos.add(empPojo1);
	empPojos.add(empPojo2);
	empPojos.add(empPojo3);
	
		OperationImp ob = new OperationImp();
	    ob.add(empPojos);
	    ob.show();
	    System.out.println("------------------");
	    ob.delete(10);
	    ob.show();
	    System.out.println("------------------");
	    ob.searech(20);
	    System.out.println("------------------");
	    ob.update(30, "reema");
	    ob.show();
        System.out.println("------------------");
        ob.show();
        
		
	}

}
