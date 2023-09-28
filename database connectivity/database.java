
import java.sql.*;
public class database {

	public static void main(String[] args) {
	  String sqlq;//for query 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//new driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","1234");
			//connection variable ("jdbc:mysql://server name/database","sql_username","password");
			Statement stmt=con.createStatement();//finale statement of connection
			System.out.println("Inserting records ");
			 sqlq="Insert into student values(69,'tejas','male')";
			stmt.executeUpdate(sqlq);//statement to execute query 
//			sqlq="Select* from student;";
//			stmt.executeUpdate(sqlq);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
