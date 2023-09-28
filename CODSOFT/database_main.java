
import java.util.*;
import java.sql.*;
public class database_main {

	public static void main(String[] args) {
	  String sqlq;
	  int id;
	  String name,gender,password;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter password to access database  :");
		password=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//new Driver class 
			// Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","1234");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root",password);
			Statement stmt=con.createStatement();
			System.out.println("enter id : ");
			id=sc.nextInt();
			System.out.println("Enter name :");
			sc.nextLine();
			name=sc.nextLine();
			System.out.println("Enter Gender :");
			gender=sc.nextLine();
			
			System.out.println("Inserting records ");
//			 sqlq="Insert into student values(id,name,Gender)";
			 sqlq="INSERT INTO `student`(roll_no,Name,Gender) VALUE ('"+id+"','"+name+"','"+gender+"');";
			stmt.executeUpdate(sqlq);
			sqlq="Select* from student;";
//			System.out.println(stmt.executeUpdate(sqlq));
			stmt.executeUpdate(sqlq);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}