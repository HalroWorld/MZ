package mz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;

public class MZ_search {

	public JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MZ_search window = new MZ_search();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MZ_search() {
		initialize();
		frame.setTitle("맛-ZIP");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	private void initialize() {
		MZ_DB db = new MZ_DB();
		db.select(MZ_tbl.str, MZ_tbl.num);
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
//		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(200, 70));
		
		// 검색결과 타이틀
		panel.setLayout(new GridLayout(0,5 ,0, 0));
		panel.setPreferredSize(new Dimension(100, 200));
		JLabel RESULT = new JLabel("검색결과");
		RESULT.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 45));
		panel.add(RESULT, BorderLayout.NORTH);
		
		// 신경 쓰지 말아라.
		JLabel dummy = new JLabel("");
		dummy.setBackground(new Color(255, 255, 255));
		panel.add(dummy);
		// 신경 쓰지 말아라.
		JLabel dummy2 = new JLabel("");
		panel.add(dummy2);
		
		// 뒤로 가기 버튼
		JButton btn_Back = new JButton("back");
		btn_Back.setIcon(new ImageIcon(MZ_search.class.getResource("/mz/mzImg/arrow_back.png")));
		btn_Back.setBorderPainted(false);
		btn_Back.setBackground(Color.WHITE);
		panel.add(btn_Back);
		btn_Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if(btn_Back.getText().equals("back")){
                    new MZ_home_p1();
					frame.setVisible(false);
                }
			}
		});
		
		// 홈 버튼
		JButton btn_Home = new JButton("Home");
		btn_Home.setIcon(new ImageIcon(MZ_search.class.getResource("/mz/mzImg/home.png")));
		btn_Home.setFont(new Font("굴림", Font.PLAIN, 12));
		btn_Home.setBorderPainted(false);
		btn_Home.setBackground(Color.WHITE);
		panel.add(btn_Home);
		btn_Home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if(btn_Home.getText().equals("Home")){
                    new MZ_home_p1();
					frame.setVisible(false);
                }
			}
		});
		
		// 스크롤 존
//		JScrollPane scrollPane = new JScrollPane();
//		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		// 타이틀 크기 존
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
//		scrollPane.setViewportView(panel_1);
		panel_1.setPreferredSize(new Dimension(1000, 3000));
		frame.setBounds(100, 100, 1101, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MZ_tbl.num =1;
		for(int i=0; i<3; i++) {
			
			db.select(MZ_tbl.str, i+1);
			int b = 650*i;
			// 왼쪽 이미지
			JLabel img1 = new JLabel();
			img1.setIcon(new ImageIcon(db.path[0]));
			img1.setHorizontalAlignment(SwingConstants.CENTER);
			img1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img1.setBounds(0, b, 542, 327);
			panel_1.add(img1);
			
			// 오른쪽 이미지
			JLabel img2 = new JLabel();
			img2.setIcon(new ImageIcon(db.path[1]));
			img2.setHorizontalAlignment(SwingConstants.CENTER);
			img2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img2.setBounds(540, b, 542, 327);
			panel_1.add(img2);
			
			// 별점
			JLabel score = new JLabel("별점");
			score.setForeground(new Color(39, 39, 39));
			score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			score.setBounds(369, 336 + b, 78, 109);
			panel_1.add(score);
			
			// 영업시간 텍스트
			JLabel open_H = new JLabel("영업시간");
			open_H.setForeground(new Color(0, 0, 0));
			open_H.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			open_H.setBounds(10, 429 + b, 118, 109);
			panel_1.add(open_H);
			
			// 영업시간
			JLabel Hour = new JLabel(db.mzList.getMzHours());
			Hour.setForeground(new Color(39, 39, 39));
			Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			Hour.setBounds(140, 429 + b, 403, 109);
			panel_1.add(Hour);
			
			// 리뷰텍스트
			JLabel reveiw = new JLabel("리뷰");
			reveiw.setForeground(Color.BLACK);
			reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			reveiw.setBounds(592, 426 + b, 78, 109);
			panel_1.add(reveiw);
			
			// 리뷰 갯수
			JLabel reveiw_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			reveiw_score.setForeground(new Color(255, 199, 7));
			reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			reveiw_score.setBounds(668, 427 + b, 118, 109);
			panel_1.add(reveiw_score);
			
			// 조회수 텍스트
			JLabel veiws = new JLabel("조회수");
			veiws.setForeground(Color.BLACK);
			veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			veiws.setBounds(798, 426 + b, 78, 109);
			panel_1.add(veiws);
			
			// 조회수
			JLabel views_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			views_score.setForeground(new Color(39, 39, 39));
			views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			views_score.setBounds(894, 426 + b, 118, 109);
			panel_1.add(views_score);
			
			// 가게 이름
			JButton btn_storeName = new JButton(db.mzList.getMzTitle());
			btn_storeName.setForeground(new Color(0, 0, 0));
			btn_storeName.setHorizontalAlignment(SwingConstants.LEFT);
			btn_storeName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
			btn_storeName.setBounds(0, 355 + b, 350, 68);
			btn_storeName.setBorderPainted(false);
			btn_storeName.setBackground(new Color (255,255,255));
			panel_1.add(btn_storeName);
			btn_storeName.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_storeName.getText().equals(db.mzList.getMzTitle())){
////                    MZ_menu_p3.MZ_menu_p3();
						
						MZ_DB_Update up = new MZ_DB_Update();
						up.update("update mz_tbl set mz_hit=(mz_hit+1)");
						MZ_menu_p3.main(null);
						frame.setVisible(false);
//					}
				}
			});
			
			JButton btn_More = new JButton("더보기");
			btn_More.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btn_More.setBounds(790, 358 + b, 147, 62);
			btn_More.setBorderPainted(false);
			btn_More.setBackground(new Color (255,255,255));
			panel_1.add(btn_More);
			
			btn_More.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_More.getText().equals("더보기")){
//                    MZ_menu_p3.MZ_menu_p3();
						
						MZ_DB_Update up = new MZ_DB_Update();
						up.update("update mz_tbl set mz_hit=(mz_hit+1)");
						MZ_menu_p3.main(null);
						frame.setVisible(false);
//					}
				}
			});
			frame.getContentPane().setLayout(new BorderLayout(0, 0));
			
			JLabel RESULT1 = new JLabel("주소");
			RESULT1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			RESULT1.setBounds(12, 548 + b, 71, 52);
			panel_1.add(RESULT1);
			
			JLabel addr = new JLabel(db.mzList.getMzAddr());
			addr.setForeground(new Color(70, 70, 70));
			addr.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			addr.setBounds(83, 548 + b, 861, 52);
			TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
//			addr.setBorder()
			panel_1.add(addr);
			
			
//			JLabel star ; 
////		star.setHorizontalAlignment(SwingConstants.CENTER);
//			
//			int total = (int)db.mzList.getMzStar();
//			int count = db.mzList.getMzStarCount();
//			int avg = (int)total/count;
//			String result;
//			
//			switch(avg) {
//			case 5: result = "★★★★★";
//			break;
//			case 4: result = "★★★★";
//			break;
//			case 3: result = "★★★";
//			break;
//			case 2: result = "★★";
//			break;
//			case 1: result = "★";
//			break;
//			default: result = "계산 오류";
//			break;
//			}
//			System.out.print(result);
//			star = new JLabel(result);
//			
//			star.setForeground(new Color(255, 199, 7));
//			star.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
//			star.setBounds(436, 356 + b, 350, 64);
//			list_G.add(star);
			
			System.out.println();
			
		}
	
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
      	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
      	JScrollPane scrollPane1 = new JScrollPane(panel_1, v,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      	scrollPane1.getVerticalScrollBar().setUnitIncrement(16);
      	panel_1.setLayout(null);
      	
		frame.getContentPane().add(scrollPane1, BorderLayout.CENTER);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
//		frame2.getContentPane().setLayout(groupLayout);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
