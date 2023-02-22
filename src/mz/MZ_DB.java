package mz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MZ_DB {
	static MZ_tbl mzList = new MZ_tbl();
	
	public void select() {
		Connection conn = null;
		
	  try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      String url = "jdbc:mysql://172.20.10.21:3306/mz";
      String user1 = "root";
      String passwd = "1234";
      
      conn = DriverManager.getConnection(url, user1, passwd);
      
      String sql = "" +
          "SELECT mz_uid, mz_title, mz_star, mz_hours, mz_hit, mz_addr " +
          "FROM mz_tbl " +
          "WHERE mz_uid =1 ";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);   // 쿼리 실행후 결과 값을 resultset에 담아 두기
      
      if(rs.next()) {
        
      	mzList.setMzUid(rs.getInt("mz_uid"));
      	mzList.setMzTitle(rs.getString("mz_title"));
      	mzList.setMzStar(rs.getDouble("mz_star"));
      	mzList.setMzHours(rs.getString("mz_hours"));
      	mzList.setMzHit(rs.getInt("mz_hit"));
      	mzList.setMzAddr(rs.getString("mz_addr"));
         
      }else {
     	 System.out.println("사용자 아이디가 존재하지 않음");
      }
      rs.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결 끊기");
			}catch(SQLException e) {}
			}
		}
	}
}
