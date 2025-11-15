package vector;


import java.util.Vector;

public interface Operation {
	void add(Vector<EmpPojo>empPojos);
	void update(int id, String name);
	void delete(int id);
	void searech(int id);
	void show();
	

}
