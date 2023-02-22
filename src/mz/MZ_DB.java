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

public class MZ_DB {
	static MZ_tbl mzList = new MZ_tbl();
	static String path;
	static String path2;
	public void select() {
		Connection conn = null;
		
	  try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      String url = "jdbc:mysql://172.20.10.21:3306/mz";
      String user1 = "root";
      String passwd = "1234";
    
      
      
      conn = DriverManager.getConnection(url, user1, passwd);
      
      String sql = "" +
          "SELECT mz_uid, mz_title, mz_star, mz_hours, mz_hit, mz_addr, mz_img, mz_img2, mz_img_name, mz_img2_name " +
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
      	mzList.setMzImg(rs.getBlob("mz_img"));
      	mzList.setMzImg2(rs.getBlob("mz_img2"));
      	mzList.setMzImgName(rs.getString("mz_img_name"));
      	mzList.setMzImg2Name(rs.getString("mz_img2_name"));

      	 
         
         Blob blob = mzList.getMzImg();
         
         if(blob != null) {
        	 
        	 InputStream is  = blob.getBinaryStream();
        	 
           OutputStream os = new FileOutputStream("C:/Temp/" + mzList.getMzImgName());
//           mzList.getMzImgName()
           path = "C:/Temp/" + mzList.getMzImgName();
           System.out.println(path);
           is.transferTo(os);
           os.flush();
           os.close();
           is.close();
         }
         Blob blob2 = mzList.getMzImg2();
         if(blob2 != null) {
        	 
        	 InputStream is  = blob2.getBinaryStream();
           OutputStream os = new FileOutputStream("C:/Temp/" + mzList.getMzImg2Name());
//           mzList.getMzImgName()
           path2 = "C:/Temp/" + mzList.getMzImg2Name();
           System.out.println(path);
           is.transferTo(os);
           os.flush();
           os.close();
           is.close();
         }
         

      }else {
     	 System.out.println("사용자 아이디가 존재하지 않음");
      }
      rs.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}catch (IOException ex) {
    ex.printStackTrace();
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
