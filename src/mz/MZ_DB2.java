package mz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MZ_DB2 {
	static MZ_tbl mzList2 = new MZ_tbl();
	static String[] menu = new String[3];
	static String[] text = new String[3];
	
	
	
	public void select2(String str, int i) {
		Connection conn = null;
		
	  try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      String url = "jdbc:mysql://222.119.100.81:3382/mz";
      String user1 = "bong";
      String passwd = "mz1234";
          
      conn = DriverManager.getConnection(url, user1, passwd);
      
      String sql = "" +
          "SELECT mz_uid, mz_img_text, mz_img2_text, mz_menu, mz_menu2 " +
          "FROM " + str + "_mz_tbl " +
          "WHERE mz_uid=" +  i;
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);   // 쿼리 실행후 결과 값을 resultset에 담아 두기
      
      if(rs.next()) {
        
      	
       	mzList2.setMzImgText(rs.getString("mz_img_text"));
      	mzList2.setMzImg2Text(rs.getString("mz_img2_text"));
            	
      	mzList2.setMzMenu(rs.getString("mz_menu"));
      	mzList2.setMzMenu2(rs.getString("mz_menu2"));
      
      	
      	menu[0] = mzList2.getMzMenu();
      	menu[1] = mzList2.getMzMenu2();
      
      
      	text[0] = mzList2.getMzImgText();
      	text[1] = mzList2.getMzImg2Text();
      
      			
       
      }else {
     	 System.out.println("사용자 아이디가 존재하지 않음");
      }
      rs.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	} finally {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결 끊기");
			}catch(SQLException e) {}
			}
		}
	}
}
