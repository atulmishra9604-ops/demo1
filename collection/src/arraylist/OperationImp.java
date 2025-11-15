package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImp implements Operation {
//	global object
	List<EmpPojo> db = new ArrayList<EmpPojo>();
	@Override
	public void insertData(List<EmpPojo> empPojos) {
		db.addAll(empPojos);
		System.out.println("data inserted");
		
	}
	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
		EmpPojo empPojo	= iterator.next();
		
		if (empPojo.getId()==id) {
			iterator.remove();
			System.out.println("data deleted");
		}
		}
	}
@Override
public void searchData(int id) {
	Iterator<EmpPojo> iterator = db.iterator();
while (iterator.hasNext()) {
	EmpPojo empPojo =  iterator.next();
	if (empPojo.getId()==id) {
		System.out.println(empPojo);
System.out.println("data found");		
	}
}
	
}
@Override
public void updateData(int id, String name, double salary) {
Iterator<EmpPojo>iterator=db.iterator();
while (iterator.hasNext()) {
	EmpPojo empPojo = iterator.next();
	if (empPojo.getId()==id) {
		empPojo.setName(name);
		empPojo.setSalary(salary);
		System.out.println("data updata");
		
	}
}
	
}
@Override
public void showData() {
	Iterator<EmpPojo> iterator=db.iterator();
	while (iterator.hasNext()) {
		EmpPojo empPojo =  iterator.next();
		System.out.println(empPojo);
	}
	
}

}
