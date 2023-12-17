import java.sql.*;
import java.util.*;
import javax.swing.*;

class index{

    
}
public class Main {


    public static void main(String[] args) {











        String sqlq;
        int id;
        String name,gender;
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//new Driver class
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","1234");
//                                                            database location name /, schema name . pass
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
           int  a=stmt.executeUpdate(sqlq);
            if(a>0){
                System.out.println("Data inserted successfully ..");
            }
        }catch(Exception e) {
           e.printStackTrace();
        }



    }
}