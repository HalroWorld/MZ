package mz;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Mz_main {

	private JFrame frame;
	private JTextField textField;

	/** ww
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mz_main window = new Mz_main();
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
	public Mz_main() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1102, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").
				getImage());
		frame.setTitle("맛-ZIP");
		
		JLabel lblNewLabel = new JLabel("맛집 로고"); // 메인 상단 로고
		lblNewLabel.setFont(new Font("배달의민족 도현", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();  // 검색창
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		// 메인 메뉴 버튼
		JButton btn_K = new JButton("");
		btn_K.setIcon(new ImageIcon("src/mz/mzImg/k.png"));
		btn_K.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_K.setForeground(new Color(255, 240, 0));
		btn_K.setBackground(new Color(255,255,255));
		
		JButton btn_C = new JButton("");
		btn_C.setIcon(new ImageIcon("src/mz/mzImg/c.png"));
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_C.setBackground(new Color(255,255,255));
		
		JButton btn_F = new JButton("");
		btn_F.setIcon(new ImageIcon("src/mz/mzImg/f.png"));
		btn_F.setBackground(new Color(255,255,255));
		
		JButton btn_az = new JButton("");
		btn_az.setIcon(new ImageIcon("src/mz/mzImg/a.png"));
		btn_az.setBackground(new Color(255,255,255));
		
		JButton btn_J = new JButton("");
		btn_J.setIcon(new ImageIcon("src/mz/mzImg/j.png"));
		btn_J.setBackground(new Color(255,255,255));
		
		JButton btn_D = new JButton("");
		btn_D.setIcon(new ImageIcon("src/mz/mzImg/d.png"));
		btn_D.setBackground(new Color(255,255,255));
		
		// 잘은 모르겠는데 여기가 하단 버튼들 
		JButton btn_QNA = new JButton("");
		btn_QNA.setIcon(new ImageIcon("src/mz/mzImg/QA.png"));
		btn_QNA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_QNA.setBackground(new Color(255,255,255));
		
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon("src/mz/mzImg/home.png"));
		btn_Home.setBackground(new Color(255,255,255));
		
		JButton btn_Re = new JButton("");
		btn_Re.setIcon(new ImageIcon("src/mz/mzImg/re.png"));
		btn_Re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Re.setBackground(new Color(255,255,255));
		
		JScrollBar scrollBar = new JScrollBar();
		
		JButton button = new JButton("");
		button.setBackground(new Color(255,255,255));
		button.setIcon(new ImageIcon(Mz_main.class.getResource("/mz/mzImg/se.png")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn_K, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(0)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btn_QNA, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
										.addComponent(btn_az, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
							.addGap(68)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_C, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
								.addComponent(btn_Home, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
								.addComponent(btn_J, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
							.addGap(87)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btn_F, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
								.addComponent(btn_Re, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
								.addComponent(btn_D, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
					.addGap(27)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(btn_F, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addComponent(btn_C, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
								.addComponent(btn_K, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_az, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(btn_J, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addComponent(btn_D, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
							.addGap(103)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(btn_QNA, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addComponent(btn_Home, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addComponent(btn_Re, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
}
