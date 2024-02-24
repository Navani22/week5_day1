package week5_day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Practice1 {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/renocrewwork", "root", "Nh@2218#0112");
      Statement stmt = con.createStatement();
      String sql = "INSERT INTO firsttable (Name, Age) VALUES ('John', 25)";
      stmt.executeUpdate(sql);
      con.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }


}