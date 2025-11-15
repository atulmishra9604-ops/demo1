package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	EmpPojo empPojo1 = new EmpPojo(10, "atul", 30000);
	EmpPojo empPojo2 = new EmpPojo(20, "sahil", 40000);
	EmpPojo empPojo3 = new EmpPojo(30, "arjun",50000);
	EmpPojo empPojo4 = new EmpPojo(40, "raj",60000);
	
	List<EmpPojo> empPojos = new ArrayList<EmpPojo>();
	empPojos.add(empPojo1);
	empPojos.add(empPojo2);
	empPojos.add(empPojo3);
	empPojos.add(empPojo4);
	
	OperationImp ob = new OperationImp();
//	insert
	ob.insertData(empPojos);
	ob.showData();
//	 delete
	System.out.println("-------------2------------");
	ob.deleteData(40);
	ob.showData();
//	update
	System.out.println("--------3--------");
	ob.updateData(30, "aiyush", 230000);
	ob.showData();
//	search
	System.out.println("-------4--------");
	ob.searchData(10);
//show
	System.out.println("-------5------");
	ob.showData();
	
	
	

	}
}
