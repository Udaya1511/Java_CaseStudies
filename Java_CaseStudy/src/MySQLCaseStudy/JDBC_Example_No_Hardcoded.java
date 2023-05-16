package MySQLCaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example_No_Hardcoded {

	static final String DB_URL = "jdbc:mysql://localhost:3306/wiprotable";
	static final String USER = "root";
	static final String PASS = "MySQL@123";
	static final String QUERY = "select * from book_detl where author='Ian'";

	public static void main(String[] args) {

		try 

		{Connection con = DriverManager.getConnection(DB_URL,USER,PASS);

		Statement statm = con.createStatement();
		String s = "Select book_no, title, sub_code, author from book_detl";

		ResultSet rs = statm.executeQuery(s);

		while (rs.next()) {

			String bid = rs.getString("book_no");
			String tit = rs.getString("title");
			String scode = rs.getString("sub_code");
			String aut = rs.getString("author");

			System.out.println(bid + " " + tit+ " " + scode + " " + aut);

		} 
		}
		catch (SQLException e) {

			e.printStackTrace();
		}

	}


}
