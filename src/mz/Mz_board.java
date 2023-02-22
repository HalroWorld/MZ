package mz;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class Mz_board extends JFrame {
	private JTable jTable;
	private JPanel pSouth;
	private JTextField txtNo , txtTitle , txtUser , txtDate , txtViews , txtContent;
	private JButton btnInsert;
	
	String a,b,c;
	
	// 메인 윈도우 설정
	public Mz_board() {
		this.setTitle("게시판 리스트");;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()),
				 BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(1000,800);
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
			
			
			
			
			// 게시물 보기 다이얼로그
			jTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
//					int rowIndex = jTable.getSelectedRow();
//					if(rowIndex != -1) {
//						String no = (String) tableModel.getValueAt(rowIndex, 0);
//						String title = (String) tableModel.getValueAt(rowIndex, 1);
//						String user = (String) tableModel.getValueAt(rowIndex, 2);
//						String date = (String) tableModel.getValueAt(rowIndex, 3);
//						String views = (String) tableModel.getValueAt(rowIndex, 4);
//						txtNo.setText(no.toString());
//						txtTitle.setText(title);
//						txtUser.setText(user);
//						txtDate.setText(date.toString());
//						txtViews.setText(views.toString());
//						Mz_read jDialog = new Mz_read(Mz_board.this);
//						jDialog.setVisible(true);
						
//					}
				}
			});
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
			pSouth.add(pButton);
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
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mz_board jFrame = new Mz_board();
				jFrame.setVisible(true);
			}
		});
	}
}