
import java.util.*;
import java.sql.*;
public class database_main {
//



/*
use school;
select * from student;
delete student from student where roll_no=68;
update student set roll_no=100 where roll_no=10;
com.mysql.cj.jdbc.Driver  new driver class
com.mysql.jdbc.Driver  old driver calss 

*/ */
	public static void main(String[] args) {
	  String sqlq;
	  int id;
	  String name,gender;
	  Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//new Driver class 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","1234");
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
			stmt.executeUpdate(sqlq);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}