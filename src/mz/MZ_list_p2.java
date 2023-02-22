package mz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MZ_list_p2 {

	public JFrame frame;


	
	public MZ_list_p2() {
		list_P2();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	
	private void list_P2() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		MZ_DB db = new MZ_DB();
		db.select();
		JPanel title_G = new JPanel();
		title_G.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1084, GroupLayout.PREFERRED_SIZE)
						.addComponent(title_G, GroupLayout.PREFERRED_SIZE, 1087, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(title_G, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
		);
		title_G.setLayout(null);
		
		JLabel title = new JLabel("K- 푸드");
		title.setForeground(new Color(0, 0, 0));
		title.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 54));
		title.setBounds(36, 39, 211, 101);
		title_G.add(title);
		
		JButton btn_home = new JButton("");
		btn_home.setIcon(new ImageIcon(MZ_list_p2.class.getResource("/mz/mzImg/home.png")));
		btn_home.setBounds(928, 60, 67, 62);
		btn_home.setBorderPainted(false);
		btn_home.setBackground(new Color (255,255,255));
		title_G.add(btn_home);
		
		JPanel list_G = new JPanel();
		list_G.setBackground(Color.WHITE);
		scrollPane.setViewportView(list_G);
		list_G.setLayout(null);
		
		JLabel img1 = new JLabel("이미지");
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		img1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
		img1.setBounds(0, 0, 542, 327);
		list_G.add(img1);
		
		JLabel img2 = new JLabel("이미지");
		img2.setHorizontalAlignment(SwingConstants.CENTER);
		img2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
		img2.setBounds(540, 0, 542, 327);
		list_G.add(img2);
		
		JLabel score = new JLabel("별점");
		score.setForeground(new Color(39, 39, 39));
		score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		score.setBounds(369, 336, 78, 109);
		list_G.add(score);
		
		JLabel open_H = new JLabel("영업시간");
		open_H.setForeground(new Color(0, 0, 0));
		open_H.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		open_H.setBounds(10, 429, 118, 109);
		list_G.add(open_H);
		
		JComboBox star = new JComboBox();
		star.setForeground(new Color(255, 198, 2));
		star.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		star.setBackground(new Color(255,255,255));
		star.setModel(new DefaultComboBoxModel(new String[] {"★★★★★","★★★★","★★★","★★","★"}));
		star.setSelectedIndex(4);
		star.setBounds(455, 377, 165, 35);
		list_G.add(star);
		
		JLabel Hour = new JLabel(db.mzList.getMzHours());
		Hour.setForeground(new Color(39, 39, 39));
		Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		Hour.setBounds(140, 429, 256, 109);
		list_G.add(Hour);
		
		JLabel reveiw = new JLabel("리뷰");
		reveiw.setForeground(Color.BLACK);
		reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		reveiw.setBounds(434, 428, 78, 109);
		list_G.add(reveiw);
		
		JLabel reveiw_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
		reveiw_score.setForeground(new Color(39, 39, 39));
		reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		reveiw_score.setBounds(510, 429, 118, 109);
		list_G.add(reveiw_score);
		
		JLabel veiws = new JLabel("조회수");
		veiws.setForeground(Color.BLACK);
		veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		veiws.setBounds(640, 428, 78, 109);
		list_G.add(veiws);
		
		JLabel views_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
		views_score.setForeground(new Color(39, 39, 39));
		views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		views_score.setBounds(736, 428, 118, 109);
		list_G.add(views_score);
		
		JButton btn_storeName = new JButton(db.mzList.getMzTitle());
		btn_storeName.setForeground(new Color(0, 0, 0));
		btn_storeName.setHorizontalAlignment(SwingConstants.LEFT);
		btn_storeName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
		btn_storeName.setBounds(0, 355, 350, 68);
		btn_storeName.setBorderPainted(false);
		btn_storeName.setBackground(new Color (255,255,255));
		list_G.add(btn_storeName);
		
		JButton btn_More = new JButton("더보기");
		btn_More.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		btn_More.setBounds(790, 358, 147, 62);
		btn_More.setBorderPainted(false);
		btn_More.setBackground(new Color (255,255,255));
		list_G.add(btn_More);
		
		JLabel lblNewLabel = new JLabel("주소");
		lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 548, 71, 52);
		list_G.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(db.mzList.getMzAddr() );
		lblNewLabel_1.setForeground(new Color(70, 70, 70));
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(83, 548, 701, 52);
		list_G.add(lblNewLabel_1);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1101, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
