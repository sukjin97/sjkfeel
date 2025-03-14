package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {
  protected Connection conn;
  protected Statement st;
  protected ResultSet rs;
  
  protected DBconnect() {
	  connection();
  }
  private void connection() {
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  String user = "sjk";
	  String password="7856";
	  String url = "jdbc:mysql://localhost:3306/sjk";
	  conn=DriverManager.getConnection(url,user,password);
  }catch(Exception e) {
	  System.out.println("드라이버 로드 및 접속 실패");
	  e.printStackTrace();
  }
	  
}
}
