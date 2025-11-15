package linkedlist;

public class EmpPojo {
	
	int id;
	String name;
	double salary;
	String dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public EmpPojo(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmpPojo [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
