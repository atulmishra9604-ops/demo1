package JDBC;
//
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			
			String url = "jdbc:mysql://localhost:3307/db10";

			con = DriverManager.getConnection(url,"root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			Statement st = null;
			try {
				st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	 try {
		ResultSet rs=st.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
