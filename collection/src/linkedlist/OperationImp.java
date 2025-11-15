package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OperationImp implements Operation {
	List<EmpPojo> db = new LinkedList<EmpPojo>();
	
	@Override
	public void add(List<EmpPojo> empPojos) {
		db.addAll(empPojos);
		System.out.println("data inserted");
		
	}
	@Override
	public void delete(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo =  iterator.next();
			 if (empPojo.getId()== id) {
				 iterator.remove();
				 System.out.println("data delete");
			}
		}
		
		
	}
	@Override
	public void searech(int id) {
		Iterator<EmpPojo> iterator=db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo =  iterator.next();
			if (empPojo.getId()==id) {
				System.out.println(empPojo);
				System.out.println("data found");
				
			}
		}
		
	}
	 @Override
	public void update(int id, String name, double salary) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo =  iterator.next();
			if (empPojo.getId()==id) {
				empPojo.setName(name);
				empPojo.setSalary(salary);
				System.out.println("data update");
				
			}
		}
		
	}
	 @Override
	public void show() {
Iterator<EmpPojo>iterator	=	db.iterator();
	while (iterator.hasNext()) {
		EmpPojo empPojo =  iterator.next();
		System.out.println(empPojo);
	}
	}

}
