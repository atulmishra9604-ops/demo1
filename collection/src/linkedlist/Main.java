package linkedlist;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 = new EmpPojo(10, "tom", 100000, "it");
		EmpPojo empPojo2= new EmpPojo(20, "raj", 120000, "HR");
		EmpPojo empPojo3 = new EmpPojo(30, "sahil", 300000, "Acct");
		EmpPojo empPojo4= new EmpPojo(40, "atul", 400000, "manager");
		
		LinkedList<EmpPojo>empPojos=new LinkedList<EmpPojo>();
		empPojos.add(empPojo1);
		empPojos.add(empPojo2);
		empPojos.add(empPojo3);
		empPojos.add(empPojo4);
		
		OperationImp ob = new OperationImp();
		ob.add(empPojos);
		ob.show();
		System.out.println("-------------------");
		ob.delete(20);
		ob.show();
		System.out.println("-------------------");
		ob.searech(40);
		System.out.println("----------");
		ob.update(10,"reema", 450000);
		ob.show();
		System.out.println("-------------");
		ob.show();
}

}
