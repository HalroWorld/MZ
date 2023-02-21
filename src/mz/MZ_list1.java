package mz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class MZ_list1 {

	private JFrame frame;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1083, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1084, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
		);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("K- 푸드");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 54));
		lblNewLabel.setBounds(36, 39, 211, 101);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("이미지");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(0, 0, 542, 327);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("이미지");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
		lblNewLabel_1_1.setBounds(540, 0, 542, 327);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("리코리코");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 45));
		lblNewLabel_2.setBounds(0, 337, 165, 109);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("별점");
		lblNewLabel_2_1.setForeground(new Color(39, 39, 39));
		lblNewLabel_2_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(202, 337, 78, 109);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("영업시간");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(10, 429, 118, 109);
		panel_1.add(lblNewLabel_2_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 198, 2));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		comboBox.setBackground(new Color(255,255,255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"★★★★★","★★★★","★★★","★★","★"}));
		comboBox.setSelectedIndex(4);
		comboBox.setBounds(288, 378, 118, 35);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("12:00 ~ 8:30");
		lblNewLabel_2_1_1_1.setForeground(new Color(39, 39, 39));
		lblNewLabel_2_1_1_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBounds(140, 429, 118, 109);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("리뷰");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		lblNewLabel_2_1_1_2.setBounds(292, 429, 118, 109);
		panel_1.add(lblNewLabel_2_1_1_2);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1101, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
