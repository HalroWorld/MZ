package mz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JToggleButton;

public class Mz_main {

	private JFrame frame;
	private JTextField textField;

	/**
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

	/** ㄱㅇ
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
		
		JButton btn_C = new JButton("");
		btn_C.setIcon(new ImageIcon("src/mz/mzImg/c.png"));
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn_F = new JButton("");
		btn_F.setIcon(new ImageIcon("src/mz/mzImg/f.png"));
		
		JButton btn_az = new JButton("");
		btn_az.setIcon(new ImageIcon("src/mz/mzImg/a.png"));
		
		JButton btn_J = new JButton("");
		btn_J.setIcon(new ImageIcon("src/mz/mzImg/j.png"));
		
		JButton btn_D = new JButton("");
		btn_D.setIcon(new ImageIcon("src/mz/mzImg/d.png"));
		
		// 잘은 모르겠는데 여기가 하단 버튼들 
		JButton btn_QNA = new JButton("");
		btn_QNA.setIcon(new ImageIcon("src/mz/mzImg/QA.png"));
		btn_QNA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon("src/mz/mzImg/home.png"));
		
		JButton btn_Re = new JButton("");
		btn_Re.setIcon(new ImageIcon("src/mz/mzImg/re.png"));
		btn_Re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/mz/mzImg/se.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollBar scrollBar = new JScrollBar();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn_K, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(0)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btn_QNA, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
										.addComponent(btn_az, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
							.addGap(68)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_C, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addComponent(btn_Home, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addComponent(btn_J, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
							.addGap(87)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btn_F, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addComponent(btn_Re, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addComponent(btn_D, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
					.addGap(38)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
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
