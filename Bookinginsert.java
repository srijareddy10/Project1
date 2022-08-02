package JdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookingInsert {
	public Connection getconn()
    {
         Connection conn=null;
         try {
             String url="jdbc:mysql://localhost:3306/miniproject";
             String username="root";
             String pass="root";
             conn=DriverManager.getConnection(url,username,pass);
         }catch(Exception e) {
             e.printStackTrace();
                          
         }
         return conn;
    }
           Scanner sc1=new Scanner(System.in);
           public void  user()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  user(name,address,bdate,gender)values(?,?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        System.out.println("Enter user gender:");
        String gender=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        stmt.setString(4,gender);
        int a=stmt.executeUpdate();
        System.out.println("***session booked***");
        
           }
           
           
           public void DANCING()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  DANCING(name,address,bdate,gender)values(?,?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        System.out.println("Enter user gender:");
        String gender=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        stmt.setString(4,gender);
        int a=stmt.executeUpdate();
        System.out.println("***session booked***");
           }
           public void  SINGING()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  SINGING(name,address,bdate,gender)values(?,?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        System.out.println("Enter user gender:");
        String gender=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        stmt.setString(4,gender);
        int a=stmt.executeUpdate();
        System.out.println("***session booked***");
           }
           public void  PAINTING()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  PAINTING(name,address,bdate,gender)values(?,?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        System.out.println("Enter user gender:");
        String gender=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        stmt.setString(4,gender);
        int a=stmt.executeUpdate();
        System.out.println("***session booked***");
           }


}
