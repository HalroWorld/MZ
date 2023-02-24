package mz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class Mz_board_map extends JFrame {
	private JPanel pSouth;
	private JTextField txtNo , txtTitle , txtUser , txtDate , txtViews , txtContent;
	private JButton btnInsert , btnDelete , btnOpen;
	private Connection conn;
	static Board_tbl boardList = new Board_tbl();
	
	
	
	String a,b,c;
	private JButton btnopen;
	private JPanel pNorth;
	private JLabel lblNewLabel;
	private JEditorPane panel;
	private JEditorPane editorPane;
//	private JButton btnNewButton;
	
	// 메인 윈도우 설정
	public Mz_board_map() {
		
	
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
	
		this.setBounds(770, 250, 1102, 1270);
		this.setSize(1000,800);
		this.setTitle("맛-ZIP");
		this.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		
		JButton btn_home = new JButton();
		btn_home.setIcon(new ImageIcon(MZ_list_p2_K.class.getResource("/mz/mzImg/home.png")));
		btn_home.setBorderPainted(false);
		btn_home.setBackground(new Color (255,255,255));
		btn_home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MZ_home_p1();
			}
		});
		pSouth.add(btn_home);
		getContentPane().add(getPNorth(), BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(getEditorPane()), BorderLayout.CENTER);
		
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

	
	
	// 사용자 입력 JPanel 생성
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setBackground(new Color(255, 255, 255));
			
			pSouth.setLayout(new GridLayout(3,1));			
			JPanel pButton = new JPanel();
			pButton.setBackground(new Color(255, 255, 255));
			
		
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
			btnInsert.setBackground(new Color(255, 255, 255));
			btnInsert.setForeground(new Color(0, 0, 0));
			btnInsert.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btnInsert.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnInsert.setBackground(new Color(255,199,7));
					btnInsert.setForeground(Color.WHITE);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnInsert.setBackground(Color.WHITE);
					btnInsert.setForeground(Color.BLACK);
				}
			});
			btnInsert.setText("추가");
			btnInsert.setBorderPainted(false);
			btnInsert.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// 다이얼로그 띄우기
					Mz_write jDialog = new Mz_write(Mz_board_map.this);
					jDialog.setVisible(true);
					
				}
			});
		}
		return btnInsert;
	}
	
	
	// 게시물 열기 버튼
	private JButton getBtnOpen() {
		if (btnopen == null) {
			btnopen = new JButton("게시물 열기");
			btnopen.setForeground(new Color(0, 0, 0));
			btnopen.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btnopen.setBackground(new Color(255, 255, 255));
			btnopen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnopen.setBackground(new Color(255,199,7));
					btnopen.setForeground(Color.WHITE);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnopen.setBackground(Color.WHITE);
					btnopen.setForeground(Color.BLACK);
				}
			});
			btnopen.setBorderPainted(false);
			btnopen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 게시물 다이얼로그 띄우기
					Mz_read re = new Mz_read();
					re.db_select();
					Mz_read jDialog = new Mz_read();
					jDialog.setVisible(true);
				}
			});
		}
		return btnopen;
	}

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mz_board_map jFrame = new Mz_board_map();
				jFrame.setVisible(true);
			}
		});
	}
	
	private JPanel getPNorth() {
		if (pNorth == null) {
			pNorth = new JPanel();
			pNorth.setPreferredSize(new Dimension(100, 50));
			
			pNorth.setBackground(Color.WHITE);
			pNorth.setLayout(new GridLayout(0, 1, 0, 0));
			pNorth.add(getLblNewLabel());
		}
		return pNorth;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("지도");
			lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
			
			try {
				editorPane.setPage("https://google.com");
			}catch(Exception e) {}
			editorPane.setEditable(false);
			editorPane.addHyperlinkListener(new HyperlinkListener() {
			           public void hyperlinkUpdate(HyperlinkEvent e) {
			 if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
			                try {
			                	editorPane.setPage(e.getURL());
		               } catch(IOException e2) {}
			             }
	         }
			         });
		       }
		return editorPane;
		    }
	
		
	
	
}
