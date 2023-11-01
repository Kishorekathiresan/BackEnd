package week2;
import java.sql.*;
public class JDBCDemo {
	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/work","root","renuka@37");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement s;
		try {
			s = con.createStatement();
			int res=s.executeUpdate("insert into parts(p_id,p_name,color) values(16,'Mouse','Black')");
			System.out.println(res + " record(s) inserted..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}