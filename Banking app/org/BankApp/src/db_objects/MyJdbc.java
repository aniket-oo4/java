package db_objects;
import com.mysql.cj.protocol.Resultset;
import guis.RegisterGui;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

//import java.sql.*;
public class MyJdbc {
    public static  final String DB_url="jdbc:mysql://localhost:3306/mybank";
    public static final String DB_username="root";
    public static  final String DB_password="1234";

// function which accepting  input from login page  name and password  to validate that they are in the data base or not
     public static User validateUserLogin(String username,String password){


         try {

//             Class.forName("com.mysql.cj.jdbc.Driver");

//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank","root","1234");  // direct connection check
//             PreparedStatement statementQuery=con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?"); // direct connection check

            Connection connection=DriverManager.getConnection(DB_url,DB_username,DB_password);
             PreparedStatement statementQuery=connection.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");  // query which will be going to execute


             // placing values(user details ) in the place of ?
             // parameter idex notihng but the index of ? mark in the satement query  first index refers to username and second index refers to pass word
             statementQuery.setString(1,username);
             statementQuery.setString(2,password);

             // storing result of the Query  in Resultset object
             ResultSet resultSet=statementQuery.executeQuery(); // rwturns the result of query all info about user in row format
             //  next() function return true / false
             //  true - if result set returned  information about user  then it points to the first row
             // false - if query returned no data then result set points to null
             if(resultSet.next())
             {
                 int userId=resultSet.getInt("id");
//                 username=resultSet.getString("username");
                 // get current balance
                 BigDecimal currentBalance= resultSet.getBigDecimal("current_balance");

                 // finally returning object of user class to proceed further for other operations on this user
                 return new User(userId,username,password,currentBalance);

             }

        } catch (SQLException e) {
             e.printStackTrace();// printing which error occur
             }
//         catch (ClassNotFoundException e) {
//             throw new RuntimeException(e);
//         }

         // return null when user is not valid
         return null;

     }


     // restering new user connectivity
    public static boolean RegisterUser(String username,String password){

        try{

            // check username is valid or not by calling check user function
            if(!checkUser(username)){
                Connection connection=DriverManager.getConnection(DB_url , DB_username,DB_password);
                PreparedStatement statementQuery=connection.prepareStatement(" INSERT INTO users (username,password,current_balance)"+"VALUES(?,?,0)");

                // setting values to parameters ? ?
                statementQuery.setString(1,username);
                statementQuery.setString(2,password);

                statementQuery.executeUpdate();
                return true;
            }

        }catch (SQLException e) {
            e.printStackTrace();// printing which error occur
        }
        return false;
    }

    // checking username already exists or not   true if exist false it not
    public static boolean checkUser(String username){
         try{
             Connection connection=DriverManager.getConnection(DB_url,DB_username,DB_password);
             PreparedStatement statementQuery=connection.prepareStatement("SELECT * FROM users WHERE username=?");

             statementQuery.setString(1,username);
             ResultSet resultSet=statementQuery.executeQuery();
            // if resultset return info then username is availabel
             if(!resultSet.next())
             {
                 return false;
             }


         }catch(SQLException e){
             e.printStackTrace();
         }
        return true;
    }



}
