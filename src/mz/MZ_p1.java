package mz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MZ_p1 {
	public JFrame frame;
	public JTextField textField;

	public MZ_p1() {
		main_P1();
	}

	public void main_P1() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1102, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		frame.setTitle("맛-ZIP");
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1078, 0, 10, 962);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(33, 36, 1002, 124);
		lblNewLabel.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/mzducklogo1.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 186, 1085, 776);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(45, 27, 879, 48);
		panel_1.add(textField);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/se.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(931, 26, 95, 49);
		panel_1.add(button);
		
		JButton btn_K = new JButton("");
		btn_K.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/k.png")));
		btn_K.setForeground(new Color(255, 240, 0));
		btn_K.setBackground(Color.WHITE);
		btn_K.setBounds(44, 138, 275, 168);
		panel_1.add(btn_K);
		
		JButton btn_C = new JButton("");
		btn_C.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/c.png")));
		btn_C.setBackground(Color.WHITE);
		btn_C.setBounds(398, 140, 275, 168);
		panel_1.add(btn_C);
		
		JButton btn_F = new JButton("");
		btn_F.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/f.png")));
		btn_F.setBackground(Color.WHITE);
		btn_F.setBounds(749, 138, 277, 168);
		panel_1.add(btn_F);
		
		JButton btn_D = new JButton("");
		btn_D.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/d.png")));
		btn_D.setBackground(Color.WHITE);
		btn_D.setBounds(749, 351, 277, 168);
		panel_1.add(btn_D);
		
		JButton btn_J = new JButton("");
		btn_J.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/j.png")));
		btn_J.setBackground(Color.WHITE);
		btn_J.setBounds(398, 353, 275, 168);
		panel_1.add(btn_J);
		
		JButton btn_az = new JButton("");
		btn_az.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/a.png")));
		btn_az.setBackground(Color.WHITE);
		btn_az.setBounds(44, 351, 275, 168);
		panel_1.add(btn_az);
		
		JButton btn_QNA = new JButton("Q&A");
		btn_QNA.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_QNA.setBackground(Color.WHITE);
		btn_QNA.setBounds(44, 622, 275, 106);
		panel_1.add(btn_QNA);
		
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/home.png")));
		btn_Home.setBackground(Color.WHITE);
		btn_Home.setBounds(398, 624, 275, 106);
		panel_1.add(btn_Home);
		
		JButton btn_Re = new JButton("리뷰");
		btn_Re.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_Re.setBackground(Color.WHITE);
		btn_Re.setBounds(749, 622, 277, 106);
		panel_1.add(btn_Re);
	}
	
}
