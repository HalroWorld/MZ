package mz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MZ_p1 {
	private JPanel menu_G = new JPanel();
	private JFrame frame;
	private JButton btn_K;
	private JTextField search;

	public MZ_p1() {
		main_P1();
		frame.setTitle("맛-ZIP");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1102, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu_G.add(getbtn_K());
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public JButton getbtn_K() {
		if(btn_K == null) {
			btn_K = new JButton("");
			btn_K.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/k.png")));
			btn_K.setBackground(Color.WHITE);
			btn_K.setBounds(44, 138, 275, 168);
			btn_K.setBorderPainted(false);			
			btn_K.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MZ_list1 mylist = new MZ_list1();
					mylist.frame.setVisible(true);
					frame.dispose();
				}
			});
		}
		return btn_K;
	}

	public void main_P1() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		frame.getContentPane().setLayout(null);
		
		JPanel bg = new JPanel();
		bg.setBounds(1078, 0, 10, 962);
		frame.getContentPane().add(bg);
		
		JLabel MZ_logo = new JLabel("");
		MZ_logo.setBounds(33, 36, 1002, 124);
		MZ_logo.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/mzducklogo1.png")));
		MZ_logo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(MZ_logo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 186, 1085, 776);
		frame.getContentPane().add(scrollPane);
		
//		JPanel menu_G = new JPanel();
		menu_G.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(menu_G);
		menu_G.setLayout(null);
		
		search  = new JTextField();
		search.setHorizontalAlignment(SwingConstants.LEFT);
		search.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		search.setColumns(10);
		search.setBounds(45, 27, 879, 48);
		menu_G.add(search);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/se.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(931, 26, 95, 49);
		menu_G.add(button);
				
		JButton btn_C = new JButton("");
		btn_C.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/c.png")));
		btn_C.setBackground(Color.WHITE);
		btn_C.setBounds(398, 140, 275, 168);
		btn_C.setBorderPainted(false);
		menu_G.add(btn_C);
		
		JButton btn_F = new JButton("");
		btn_F.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/f.png")));
		btn_F.setBackground(Color.WHITE);
		btn_F.setBounds(749, 138, 277, 168);
		btn_F.setBorderPainted(false);
		menu_G.add(btn_F);
		
		JButton btn_D = new JButton("");
		btn_D.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/d.png")));
		btn_D.setBackground(Color.WHITE);
		btn_D.setBounds(749, 351, 277, 168);
		btn_D.setBorderPainted(false);
		menu_G.add(btn_D);
		
		JButton btn_J = new JButton("");
		btn_J.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/j.png")));
		btn_J.setBackground(Color.WHITE);
		btn_J.setBounds(398, 353, 275, 168);
		btn_J.setBorderPainted(false);
		menu_G.add(btn_J);
		
		JButton btn_az = new JButton("");
		btn_az.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/a.png")));
		btn_az.setBackground(Color.WHITE);
		btn_az.setBounds(44, 351, 275, 168);
		btn_az.setBorderPainted(false);
		menu_G.add(btn_az);
		
		JButton btn_QNA = new JButton("Q&A");
		btn_QNA.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_QNA.setBackground(Color.WHITE);
		btn_QNA.setBounds(44, 622, 275, 106);
		btn_QNA.setBorderPainted(false);
		menu_G.add(btn_QNA);
		
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon(MZ_p1.class.getResource("/mz/mzImg/home.png")));
		btn_Home.setBackground(Color.WHITE);
		btn_Home.setBounds(398, 624, 275, 106);
		btn_Home.setBorderPainted(false);
		menu_G.add(btn_Home);
		
		JButton btn_Re = new JButton("리뷰");
		btn_Re.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_Re.setBackground(Color.WHITE);
		btn_Re.setBounds(749, 622, 277, 106);
		btn_Re.setBorderPainted(false);
		menu_G.add(btn_Re);
	}

}
