package vector;

import java.util.Enumeration;
import java.util.Vector;

public class OperationImp implements Operation{
	Vector<EmpPojo>db =new Vector<EmpPojo>();
	@Override
	public void add(Vector<EmpPojo> empPojos) {
	 db.addAll(empPojos);
	 System.out.println("data inserted");
		
	}
	@Override
	public void delete(int id) {
		Enumeration<EmpPojo>enumeration=db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId()==id) {
//				empPojo.remove
				System.out.println("data deleted");
			}
		}
		
	}
	@Override
	public void searech(int id) {
		Enumeration<EmpPojo> enumeration= db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId()==id) {
				System.out.println(empPojo);
				System.out.println("data found");	
			}
		}
		
	}
	@Override
	public void show() {
		Enumeration<EmpPojo>enumeration= db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			System.out.println(empPojo);
		}
	}
	@Override
	public void update(int id, String name) {
		Enumeration<EmpPojo>enumeration= db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId()==id) {
				empPojo.getSalary();
				System.out.println(empPojo);
				System.out.println("data update");
			}
		}
		
	}
	}
	


