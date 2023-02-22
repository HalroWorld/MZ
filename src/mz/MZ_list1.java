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

public class MZ_list1 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MZ_list1 window = new MZ_list1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MZ_list1() {
		initialize();
		frame.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JPanel title_G = new JPanel();
		title_G.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(title_G, GroupLayout.PREFERRED_SIZE, 1083, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1084, GroupLayout.PREFERRED_SIZE))
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
		
		JLabel store = new JLabel("리코리코");
		store.setForeground(new Color(0, 0, 0));
		store.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 45));
		store.setBounds(0, 337, 165, 109);
		list_G.add(store);
		
		JLabel score = new JLabel("별점");
		score.setForeground(new Color(39, 39, 39));
		score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		score.setBounds(202, 337, 78, 109);
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
		star.setBounds(288, 378, 165, 35);
		list_G.add(star);
		
		JLabel Hour = new JLabel("12:00 ~ 8:30");
		Hour.setForeground(new Color(39, 39, 39));
		Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		Hour.setBounds(140, 429, 118, 109);
		list_G.add(Hour);
		
		JLabel reveiw = new JLabel("리뷰");
		reveiw.setForeground(Color.BLACK);
		reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		reveiw.setBounds(298, 429, 78, 109);
		list_G.add(reveiw);
		
		JLabel reveiw_score = new JLabel("9999+");
		reveiw_score.setForeground(new Color(39, 39, 39));
		reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		reveiw_score.setBounds(374, 430, 118, 109);
		list_G.add(reveiw_score);
		
		JLabel veiws = new JLabel("조회수");
		veiws.setForeground(Color.BLACK);
		veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		veiws.setBounds(504, 429, 78, 109);
		list_G.add(veiws);
		
		JLabel views_score = new JLabel("9999+");
		views_score.setForeground(new Color(39, 39, 39));
		views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		views_score.setBounds(600, 429, 118, 109);
		list_G.add(views_score);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1101, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
