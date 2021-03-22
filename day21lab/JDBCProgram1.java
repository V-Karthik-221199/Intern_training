package day21lab;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCProgram1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "root");
		System.out.println(con);

	}
}
