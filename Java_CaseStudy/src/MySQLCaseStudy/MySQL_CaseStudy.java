package MySQLCaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_CaseStudy {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotable","root","MySQL@123");
		
		Statement statm = con.createStatement();

		String s = "Select * from book_detl WHERE SUB_CODE='bio'";

		ResultSet rs = statm.executeQuery(s);

		System.out.println("Below is the records for Select * from book_detl WHERE SUB_CODE='bio'------>" );

		while (rs.next()) {

			String bid = rs.getString("book_no");
			String tit = rs.getString("title");
			String scode = rs.getString("sub_code");
			String aut = rs.getString("author");
			String pub = rs.getString("publisher");
			String stat = rs.getString("status");
			String yop = rs.getString("yop");
			String price = rs.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);

		}

		String query1 = "Select * from book_detl WHERE author='Ian'";

		ResultSet rss = statm.executeQuery(query1);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl WHERE author='Ian'------>" );


		while (rss.next()) {

			String bid = rss.getString("book_no");
			String tit = rss.getString("title");
			String scode = rss.getString("sub_code");
			String aut = rss.getString("author");
			String pub = rss.getString("publisher");
			String stat = rss.getString("status");
			String yop = rss.getString("yop");
			String price = rss.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}

		String query2 = "Select * from book_detl where price>300";

		ResultSet rrs = statm.executeQuery(query2);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where price>300------>" );


		while (rrs.next()) {

			String bid = rrs.getString("book_no");
			String tit = rrs.getString("title");
			String scode = rrs.getString("sub_code");
			String aut = rrs.getString("author");
			String pub = rrs.getString("publisher");
			String stat = rrs.getString("status");
			String yop = rrs.getString("yop");
			String price = rrs.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}

		String query3 = "Select * from book_detl where price<300";

		ResultSet rm = statm.executeQuery(query3);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where price<300------>" );


		while (rm.next()) {

			String bid = rm.getString("book_no");
			String tit = rm.getString("title");
			String scode = rm.getString("sub_code");
			String aut = rm.getString("author");
			String pub = rm.getString("publisher");
			String stat = rm.getString("status");
			String yop = rm.getString("yop");
			String price = rm.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		String query4 = "Select * from book_detl where price>250";

		ResultSet r1 = statm.executeQuery(query4);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where price>250------>" );


		while (r1.next()) {

			String bid = r1.getString("book_no");
			String tit = r1.getString("title");
			String scode = r1.getString("sub_code");
			String aut = r1.getString("author");
			String pub = r1.getString("publisher");
			String stat = r1.getString("status");
			String yop = r1.getString("yop");
			String price = r1.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		String query5 = "Select * from book_detl where price<250";

		ResultSet r2 = statm.executeQuery(query5);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where price<250------>" );


		while (r2.next()) {

			String bid = r2.getString("book_no");
			String tit = r2.getString("title");
			String scode = r2.getString("sub_code");
			String aut = r2.getString("author");
			String pub = r2.getString("publisher");
			String stat = r2.getString("status");
			String yop = r2.getString("yop");
			String price = r2.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}

		String query6 = "Select * from book_detl where sub_code='phy' and price>300";

		ResultSet r3 = statm.executeQuery(query6);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where sub_code='phy' and price>300------>" );


		while (r3.next()) {

			String bid = r3.getString("book_no");
			String tit = r3.getString("title");
			String scode = r3.getString("sub_code");
			String aut = r3.getString("author");
			String pub = r3.getString("publisher");
			String stat = r3.getString("status");
			String yop = r3.getString("yop");
			String price = r3.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		String query7 = "Select * from book_detl where sub_code='phy' or price>300";

		ResultSet r4 = statm.executeQuery(query7);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where sub_code='phy' or price>300------>" );


		while (r4.next()) {

			String bid = r4.getString("book_no");
			String tit = r4.getString("title");
			String scode = r4.getString("sub_code");
			String aut = r4.getString("author");
			String pub = r4.getString("publisher");
			String stat = r4.getString("status");
			String yop = r4.getString("yop");
			String price = r4.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		String query8 = "Select * from book_detl where sub_code in ('bio','mat')";

		ResultSet r5 = statm.executeQuery(query8);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where sub_code in ('bio','mat')------>" );


		while (r5.next()) {

			String bid = r5.getString("book_no");
			String tit = r5.getString("title");
			String scode = r5.getString("sub_code");
			String aut = r5.getString("author");
			String pub = r5.getString("publisher");
			String stat = r5.getString("status");
			String yop = r5.getString("yop");
			String price = r5.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		String query9 = "Select * from book_detl where price between 300 and 700";

		ResultSet r6 = statm.executeQuery(query9);
		System.out.println();
		System.out.println("Below is the records for Select * from book_detl where price between 300 and 700------>" );


		while (r6.next()) {

			String bid = r6.getString("book_no");
			String tit = r6.getString("title");
			String scode = r6.getString("sub_code");
			String aut = r6.getString("author");
			String pub = r6.getString("publisher");
			String stat = r6.getString("status");
			String yop = r6.getString("yop");
			String price = r6.getString("price");


			System.out.println(bid + " " + tit+ " " + scode + " " + aut + " " + pub  + " " + stat + " " + yop + " " + price);
		}
		
		con.close();
		System.out.println("<------- THE END ------->");

	}

}
