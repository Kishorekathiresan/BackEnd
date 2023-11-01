
package week2;
import java.sql.*;
import java.util.Scanner;

public class JDBCDemo3 {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/work", "root", "renuka@37");
            System.out.println("Connection Established...");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the part ID: ");
            int p_id = scanner.nextInt();
            System.out.print("Enter the part name: ");
            String p_name = scanner.next();
            System.out.print("Enter the part color: ");
            String color = scanner.next();
            scanner.close();

            Statement s = con.createStatement();
            int res = s.executeUpdate("insert into parts(p_id, p_name, color) values(" + p_id + ", '" + p_name + "', '" + color + "')");
            System.out.println(res + " record(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
