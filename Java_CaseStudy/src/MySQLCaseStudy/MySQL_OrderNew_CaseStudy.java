package MySQLCaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_OrderNew_CaseStudy {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/wiprotable";
	static final String USER = "root";
	static final String PASS = "MySQL@123";
	static final String QUERY = "select * from book_detl where author='Ian'";
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		
		Statement statem = con.createStatement();
		
//		String database = "CREATE DATABASE ORDER_DATAS";
//		statem.executeUpdate(database);
		
		String datatable = "CREATE TABLE ORDER_NEW"
				+ "ORDER_ID int primary key,"
				+ "ORDER_DATE DATEtime  NOT NULL,"
				+ "ORDER_MODE VARCHAR(8),"
				+ "CUSTOMER_ID int NOT NULl references cust_new,"
				+ "ORDER_TOTAL int)";
				
		
		statem.executeUpdate(datatable);
		
		con.close();
		System.out.println("<----Database created---->");
		
	}

}
