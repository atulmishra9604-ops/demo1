package q5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	int id ;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 @Override
	public int compareTo(Emp o) {
		if (this.id < o.id) {
			return -1;
		}else if (this.id > o.id) {
			return 1;
		}
		return 0;
	}
	
}
public class Main {
public static void main(String[] args) {
	Emp emp1 =  new Emp(1, "atul", 10000);
	Emp emp2 =  new Emp(2, "raj", 10000);
	Emp emp3 =  new Emp(3, "sahil", 10000);
	Emp emp4 =  new Emp(4, "reema", 10000);
	
	List<Emp> emps = new ArrayList<Emp>();
	emps.add(emp1);
	emps.add(emp2);
	emps.add(emp3);
	emps.add(emp4);
	
	System.out.println("before");
	Iterator<Emp> iterator = emps.iterator();
	while (iterator.hasNext()) {
		Emp emp = (Emp) iterator.next();
		System.out.println(emp);	
	}
	System.out.println("after");
	Collections.sort(emps);

	
}
}
