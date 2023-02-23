package mz;


import java.sql.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mz_write extends JDialog{

	final JPanel contentPanel = new JPanel();
	JTextField txtTitle;
	JTextField txtUser;


	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		
						
		
		try {
			Mz_write dialog = new Mz_write(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mz_write(JFrame owner) {
		this.setTitle("게시물 작성");
		setBounds(100, 100, 567, 405);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(137, 36, 341, 21);
		contentPanel.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setBounds(137, 95, 341, 21);
		contentPanel.add(txtUser);
		txtUser.setColumns(10);
		
		JTextArea txtContent = new JTextArea();
		txtContent.setBounds(137, 154, 341, 153);
		contentPanel.add(txtContent);
		
		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setBounds(51, 39, 52, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("글쓴이");
		lblNewLabel_1.setBounds(51, 98, 52, 15);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("내용");
		lblNewLabel_2.setBounds(51, 218, 52, 15);
		contentPanel.add(lblNewLabel_2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			
			{
				JButton okButton = new JButton("저장");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {												
						
					
						String ipTitle = txtTitle.getText();
						String ipUser = txtUser.getText();
						String ipContent= txtContent.getText();
												
						Mz_data.InputTitle = txtTitle.getText();
						Mz_data.InputUser = txtUser.getText();
						Mz_data.InputContent = txtContent.getText();
						
												
						txtTitle.setText("");
						txtUser.setText("");
						txtContent.setText("");
						
						System.out.println(Mz_data.InputTitle);
						System.out.println(Mz_data.InputUser);
						System.out.println(Mz_data.InputContent);
						
						Connection conn = null;
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							conn = DriverManager.getConnection(
								"jdbc:mysql://127.0.0.1:3306/board",
								"root",
								"1234"
							);
							
							String sql = "" +
									"INSERT INTO board_tbl(user_name, board_title,board_date, board_post )"
									+ " values(?, ?, now(), ? )";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, Mz_data.InputUser);
							pstmt.setString(2, Mz_data.InputTitle);			
							pstmt.setString(3, Mz_data.InputContent);
							
							
							pstmt.executeUpdate();
							
							pstmt.close();		
							
						} catch (Exception e1) {
							e1.printStackTrace();			
						} finally {
							if(conn != null) {
								try {
									conn.close();
								} catch (SQLException e1) {}
							}
						}
						
						
					} 
				});
				okButton.setActionCommand("저장");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			
			
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("취소");
				buttonPane.add(cancelButton);
			}
		}
		
	}
}
