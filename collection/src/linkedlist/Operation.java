package linkedlist;

import java.util.List;

public interface Operation {
	void add(List<EmpPojo>empPojos);
	void delete(int id );
	void update(int id,String name,double salary);
	void searech(int id );
	void show();
	

}
