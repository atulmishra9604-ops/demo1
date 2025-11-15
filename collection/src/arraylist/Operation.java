package arraylist;

import java.util.List;

public interface Operation {
	void insertData(List<EmpPojo>empPojos);
	void updateData(int id,String name,double salary);
	void deleteData(int id);
	void searchData(int id);
	void showData();
	

}
