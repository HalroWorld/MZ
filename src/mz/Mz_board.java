package mz;

import java.sql.*;
import java.util.Vector;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mz_board extends JFrame {
	public static JTable jTable;
	private JPanel pSouth;
	private JTextField txtNo , txtTitle , txtUser , txtDate , txtViews , txtContent;
	private JButton btnInsert , btnDelete , btnOpen;
	private Connection conn;
	static Board_tbl boardList = new Board_tbl();
	
	
	
	String a,b,c;
	private JButton btnNewButton;
//	private JButton btnNewButton;
	
	// 메인 윈도우 설정
	public Mz_board() {
		this.setTitle("게시판 리스트");;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scrollPane = new JScrollPane(getJTable());
		this.getContentPane().add(scrollPane,
				 BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(1000,800);
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			conn = DriverManager.getConnection(
//				"jdbc:mysql://127.0.0.1:3306/board",
//				"root",
//				"1234"
//			);
//			System.out.println("연결 성공");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//				if(conn != null) {
//					try {
//						conn.close();
//					} catch (SQLException e1) {}
//				}
//			}
		
	}
	
	
	//JTable 생성
	public JTable getJTable() {
		if(jTable == null) {
			jTable = new JTable();
			final DefaultTableModel tableModel = (DefaultTableModel)
					jTable.getModel();
			tableModel.addColumn("번호");
			tableModel.addColumn("제목");
			tableModel.addColumn("글쓴이");
			tableModel.addColumn("날짜");
			tableModel.addColumn("조회수");									
			
			
			
			jTable.getTableHeader().setReorderingAllowed(false);	// 컬럼 헤드 고정
			
			
			
			Connection conn = null;
			try {
			      Class.forName("com.mysql.cj.jdbc.Driver");
			      
			      String url = "jdbc:mysql://222.119.100.81:3382/mz";
			      String user1 = "bong";
			      String passwd = "mz1234";
			    
			    
			      conn = DriverManager.getConnection(url, user1, passwd);
			      
			      
			      
			      
//			      String sql = "update board_tbl set board_hit=(board_hit+1)";
//			      PreparedStatement pstmt = conn.prepareStatement(sql);
//
//			      
//			      int rows = pstmt.executeUpdate();
//			      System.out.println("수정된 행 수: " + rows);
			    
			      
			      String sql = "" +
			              "SELECT board_uid, user_name, board_title, board_date, board_hit, board_post " +
			              "FROM board_tbl ";
			          Statement st = conn.createStatement();
			          ResultSet rs = st.executeQuery(sql);   // 쿼리 실행후 결과 값을 resultset에 담아 두기
			          
//			          if(rs.next()) {
//			            
//			        	  
//			        	  boardList.setBoardUid(rs.getInt("board_uid"));
//			        	  boardList.setUserName(rs.getString("user_name"));
//			        	  boardList.setBoardTitle(rs.getString("board_title"));
//			        	  boardList.setBoardDate(rs.getString("board_date"));
//			        	  boardList.setBoardHit(rs.getInt("board_hit"));
//			        	  boardList.setBoardPost(rs.getString("board_post"));
//			        pstmt.close();
			          
			        while(rs.next()){            // 각각 값을 가져와서 테이블값들을 추가
			        	tableModel.addRow(
			        			new Object[]{rs.getInt("board_uid"),rs.getString("user_name"),
			                                rs.getString("board_title"),rs.getString("board_date"),
			                                 rs.getInt("board_hit") , rs.getString("board_post")});
			        	  
			        
			        	  }
					}catch (Exception e) {
			              e.printStackTrace();
			      } finally {
			        if(conn != null) {
			           try {
			             conn.close();
			          } catch (SQLException e) {}
			        }
			    }
		
//			 게시물 보기 다이얼로그
//			 jTable.addMouseListener(new MouseAdapter() {
//		            public void mouseClicked(MouseEvent e) {
//		               int rowIndex = jTable.getSelectedRow();
//		               if(rowIndex != -1) {
//		            	   DefaultTableModel tableModel = (DefaultTableModel)
//									getJTable().getModel();
//							tableModel.removeRow(rowIndex);
//							txtNo.setText("");
//							txtTitle.setText("");
//							txtUser.setText("");
//							txtDate.setText("");
//							txtViews.setText("");
//							txtContent.setText("");
//		            	   
//		                  String no = (String) tableModel.getValueAt(rowIndex, 0);
//		                  String title = (String) tableModel.getValueAt(rowIndex, 1);
//		                  String user = (String) tableModel.getValueAt(rowIndex, 2);
//		                  String date = (String) tableModel.getValueAt(rowIndex, 3);
//		                  String views = (String) tableModel.getValueAt(rowIndex, 4);
//		                  txtNo.setText(no.toString());
//		                  txtTitle.setText(title);
//		                  txtUser.setText(user);
//		                  txtDate.setText(date.toString());
//		                  txtViews.setText(views.toString());
//		                  
//		                  
//		                  
//		               }
//		                  
//		               
//		            }
//		         });
		      }
		      return jTable;
		   }

	
	
	// 사용자 입력 JPanel 생성
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			
			pSouth.setLayout(new GridLayout(3,1));			
			JPanel pButton = new JPanel();
			pButton.add(getBtnInsert());
			pButton.add(getBtnOpen());
			pButton.add(getBtnDelete());
			pSouth.add(pButton);
//			pButton.add(getBtnNewButton());
		}
		return pSouth;
	}
	
	
	public JTextField getTxtName() {
		if (txtNo == null) {
			txtNo = new JTextField();
		}
		return txtNo;
	}
	
	public JTextField getTxtAge() {
		if (txtTitle == null) {
			txtTitle = new JTextField();
		}
		return txtTitle;
	}
	// 게시물 작성 다이얼로그
	
	public JButton getBtnInsert() {
		if(btnInsert == null) {
			btnInsert = new JButton();
			btnInsert.setText("추가");
			btnInsert.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// 다이얼로그 띄우기
					Mz_write jDialog = new Mz_write(Mz_board.this);
					jDialog.setVisible(true);
					
				}
			});
		}
		return btnInsert;
	}
	
	
	// 게시물 열기 버튼
	private JButton getBtnOpen() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("게시물 열기");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 게시물 다이얼로그 띄우기
					Mz_read jDialog = new Mz_read();
					jDialog.setVisible(true);
				}
			});
		}
		return btnNewButton;
	}
	
	
	
	
	// 삭제 버튼
	public JButton getBtnDelete() {
		if(btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					
					int rowIndex = getJTable().getSelectedRow();
					if(rowIndex != -1) {
						DefaultTableModel tableModel = (DefaultTableModel)
								getJTable().getModel();
						tableModel.removeRow(rowIndex);
						txtNo.setText("");
						txtTitle.setText("");
						txtUser.setText("");
						txtDate.setText("");
						txtViews.setText("");
						txtContent.setText("");
						
						
					}
				}
			});
		}
		return btnDelete;
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mz_board jFrame = new Mz_board();
				jFrame.setVisible(true);
			}
		});
	}
	
}
