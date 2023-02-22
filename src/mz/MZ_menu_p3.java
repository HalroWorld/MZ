package mz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MZ_menu_p3 {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MZ_menu_p3();
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MZ_menu_p3() {
		menu_P3();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void menu_P3() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1102, 1270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		//전체적인 묶음용 패널임 신경 ㄴㄴ
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// 상단 홈버튼
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/home.png")));
		btn_Home.setBounds(989, 10, 67, 62);
		btn_Home.setBorderPainted(false);
		btn_Home.setBackground(new Color (255,255,255));
		panel.add(btn_Home);
		
		// 상단 뒤로가기 버튼
		JButton btn_back = new JButton("");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_back.setIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/arrow_back.png")));
		btn_back.setBounds(902, 10, 67, 62);
		btn_back.setBorderPainted(false);
		btn_back.setBackground(new Color (255,255,255));
		panel.add(btn_back);
		// 스크롤 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 541, 1088, 692);
		panel.add(scrollPane);
		
		// 스크롤 안에 부속재료들 묶음용
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		// 메뉴 이름
		JButton btn_menu = new JButton("메뉴이름");
		btn_menu.setHorizontalAlignment(SwingConstants.LEFT);
		btn_menu.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 35));
		btn_menu.setBounds(33, 91, 359, 63);
		btn_menu.setBorderPainted(false);
		btn_menu.setBackground(new Color (255,255,255));
		panel_1.add(btn_menu);
		
		// 메뉴 설명
		JLabel explanation = new JLabel("시베리아 앞바다 소금을 뿌린 주먹밥");
		explanation.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
		explanation.setBounds(33, 152, 322, 63);
		panel_1.add(explanation);
		
		// 음식사진
		JLabel sub_img = new JLabel("이미지");
		sub_img.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 26));
		sub_img.setBounds(487, 91, 562, 219);
		panel_1.add(sub_img);
		
		// 메뉴 이름2
		JButton btn_menu2 = new JButton("메뉴이름");
		btn_menu2.setHorizontalAlignment(SwingConstants.LEFT);
		btn_menu2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 35));
		btn_menu2.setBounds(33, 376, 359, 63);
		btn_menu2.setBorderPainted(false);
		btn_menu2.setBackground(new Color (255,255,255));
		panel_1.add(btn_menu2);
		
		// 메뉴 설명2
		JLabel explanation_2 = new JLabel("시베리아 앞바다 소금을 뿌린 주먹밥");
		explanation_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 16));
		explanation_2.setBounds(33, 437, 322, 63);
		panel_1.add(explanation_2);
		
		// 음식사진2
		JLabel sub_img_2 = new JLabel("이미지");
		sub_img_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 26));
		sub_img_2.setBounds(487, 376, 562, 219);
		panel_1.add(sub_img_2);
		
		// 가게 이름 (리스트3 페이지 타이틀)
		JLabel store_Name = new JLabel("리코리코");
		store_Name.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 54));
		store_Name.setBounds(29, 291, 205, 79);
		panel.add(store_Name);
		
		// 최상단 메인 사진
		JLabel main_img = new JLabel("이미지 자리");
		main_img.setIcon(null);
		main_img.setBackground(new Color(255, 255, 255));
		main_img.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		main_img.setBounds(1, 0, 1087, 300);
		panel.add(main_img);
		
		// 전화 버튼
		JButton btn_call = new JButton("");
		btn_call.setIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/call.png")));
		btn_call.setBounds(29, 375, 46, 46);
		btn_call.setBorderPainted(false);
		btn_call.setBackground(new Color (255,255,255));
		panel.add(btn_call);
		
		// 지도 버튼
		JButton btn_lo = new JButton("");
		btn_lo.setIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/location1.png")));
		btn_lo.setBounds(82, 375, 46, 46);
		btn_lo.setBorderPainted(false);
		btn_lo.setBackground(new Color (255,255,255));
		panel.add(btn_lo);
		
		// 좋아요 버튼
		JButton btn_like = new JButton("");
		btn_like.setIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/favorite1.png")));
		btn_like.setPressedIcon(new ImageIcon(MZ_menu_p3.class.getResource("/mz/mzImg/favorite2.png")));
		btn_like.setBounds(136, 375, 46,46);
		btn_like.setBorderPainted(false);
		btn_like.setBackground(new Color (255,255,255));
		panel.add(btn_like);
		
		// 리뷰 버튼
		JButton btn_review = new JButton("리뷰");
		btn_review.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_review.setBounds(29, 458, 1027, 59);
		btn_review.setBackground(new Color (255,255,255));
		panel.add(btn_review);
	}
}
