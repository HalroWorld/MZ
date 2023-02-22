package mz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MZ_DB_Update {
   public void update() {
      Connection conn = null;
      
     try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      String url = "jdbc:mysql://172.20.10.21:3306/mz";
      String user1 = "root";
      String passwd = "1234";
    
      conn = DriverManager.getConnection(url, user1, passwd);
      
      String sql = "update mz_tbl set mz_hit=(mz_hit+1)";
      PreparedStatement pstmt = conn.prepareStatement(sql);
//      pstmt.setString(1, " + 1");
      
      int rows = pstmt.executeUpdate();
      System.out.println("수정된 행 수: " + rows);
       //PreparedStatement 닫기
        pstmt.close();
        } catch (Exception e) {
              e.printStackTrace();
      } finally {
        if(conn != null) {
           try {
             conn.close();
          } catch (SQLException e) {}
        }
    }
    }
}