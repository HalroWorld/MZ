package mz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mz_read extends JDialog {
//	private Connection conn;
//	private Statement stmt;
//	private ResultSet rs;
	private final JPanel contentPanel = new JPanel();
	JTextField txtTitle;
	JTextField txtUser;
	static Board_tbl board = new Board_tbl();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mz_read dialog = new Mz_read();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mz_read() {
		
		this.setTitle("게시물 보기");
		this.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		setBounds(100, 100, 567, 405);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 242, 192));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtTitle = new JTextField();
		txtTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txtTitle.setBorder(new LineBorder(new Color(255, 242, 197), 2, true));
		txtTitle.setSelectionColor(new Color(255, 242, 192));
		txtTitle.setForeground(new Color(0, 0, 0));
		txtTitle.setBounds(137, 36, 341, 21);
		txtTitle.setText(board.getBoardTitle());
		contentPanel.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txtUser.setBorder(new LineBorder(new Color(255, 242, 192), 2, true));
		txtUser.setSelectionColor(new Color(255, 242, 192));
		txtUser.setBounds(137, 95, 341, 21);
		txtUser.setText(board.getUserName());
		contentPanel.add(txtUser);
		txtUser.setColumns(10);
		
		JTextArea txtContent = new JTextArea();
		txtContent.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txtContent.setBorder(new LineBorder(new Color(255, 242, 192), 2, true));
		txtContent.setSelectionColor(new Color(171, 164, 206));
		txtContent.setBounds(137, 154, 341, 153);
		txtContent.setText(board.getBoardPost());
		contentPanel.add(txtContent);
		
		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
		lblNewLabel.setBounds(51, 39, 52, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("글쓴이");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 98, 52, 15);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("내용");
		lblNewLabel_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(51, 218, 52, 15);
		contentPanel.add(lblNewLabel_2);
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 242, 197));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			
			{
				JButton cancelButton = new JButton("닫기");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						cancelButton.setBackground(new Color(255,199,7));
						cancelButton.setForeground(Color.WHITE);
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						cancelButton.setBackground(new Color(255,242,197));
						cancelButton.setForeground(Color.BLACK);
					}
				});
				cancelButton.setBorderPainted(false);
				cancelButton.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
				cancelButton.setForeground(new Color(0, 0, 0));
				cancelButton.setBackground(new Color(255, 242, 197));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("닫기");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void db_select() {
		Connection conn = null;
		
		  try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      
	      String url = "jdbc:mysql://222.119.100.81:3382/mz";
	      String user1 = "bong";
	      String passwd = "mz1234";
	      conn = DriverManager.getConnection(url, user1, passwd);
	      String sql = "" + "SELECT board_title, user_name, board_post "
	      + "FROM board_tbl " +
          "WHERE board_uid =1 ";
	      Statement st = conn.createStatement();
	      ResultSet rs = st.executeQuery(sql);
	      
	      if(rs.next()) {
	    	  board.setBoardTitle(rs.getString("board_title"));
	    	  board.setUserName(rs.getString("user_name"));
	    	  board.setBoardPost(rs.getString("board_post"));
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
