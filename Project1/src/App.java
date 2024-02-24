
import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
      Statement stmt = con.createStatement();
      if (con.isClosed())
      {
        System.out.println("Connection closed!!");
      }
      else
      {
        System.err.println("Connection open!!");
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }



    }

