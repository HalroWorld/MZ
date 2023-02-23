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

public class MZ_home_p1 {
	private JPanel menu_G = new JPanel();
	private JFrame frame;
	private JButton btn_K, btn_C, btn_F, btn_AZ, btn_J, btn_D;
	private JTextField search;

	public MZ_home_p1() {
		main_P1();
		frame.setTitle("맛-ZIP");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1102, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu_G.add(getbtn_K());
		menu_G.add(getbtn_C());
		menu_G.add(getbtn_F());
		menu_G.add(getbtn_AZ());
		menu_G.add(getbtn_J());
		menu_G.add(getbtn_D());
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public JButton getbtn_K() {
		if(btn_K == null) {
			btn_K = new JButton("");
			btn_K.setBackground(Color.WHITE);
			btn_K.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/k.png")));
			btn_K.setBounds(44, 138, 275, 168);
			btn_K.setBorderPainted(false);			
			btn_K.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_K();
					frame.setVisible(false);
				}
			});
		}
		return btn_K;
	}
	
	public JButton getbtn_C() {
		if(btn_C == null) {
			btn_C = new JButton();
			btn_C.setBackground(Color.WHITE);
			btn_C.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/c.png")));
			btn_C.setBounds(398, 140, 275, 168);
			btn_C.setBorderPainted(false);			
			btn_C.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_C();
					frame.setVisible(false);
				}
			});
		}
		return btn_C;
	}
	
	public JButton getbtn_F() {
		if(btn_F == null) {
			btn_F = new JButton();
			btn_F.setBackground(Color.WHITE);
			btn_F.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/f.png")));
			btn_F.setBounds(749, 138, 277, 168);
			btn_F.setBorderPainted(false);			
			btn_F.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_F();
					frame.setVisible(false);
				}
			});
		}
		return btn_F;
	}
	
	public JButton getbtn_AZ() {
		if(btn_AZ == null) {
			btn_AZ = new JButton();
			btn_AZ.setBackground(Color.WHITE);
			btn_AZ.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/a.png")));
			btn_AZ.setBounds(44, 351, 275, 168);
			btn_AZ.setBorderPainted(false);			
			btn_AZ.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_AZ();
					frame.setVisible(false);
				}
			});
		}
		return btn_AZ;
	}
	
	public JButton getbtn_J() {
		if(btn_J == null) {
			btn_J = new JButton();
			btn_J.setBackground(Color.WHITE);
			btn_J.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/j.png")));
			btn_J.setBounds(398, 353, 275, 168);
			btn_J.setBorderPainted(false);			
			btn_J.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_J();
					frame.setVisible(false);
				}
			});
		}
		return btn_J;
	}
	
	public JButton getbtn_D() {
		if(btn_D == null) {
			btn_D = new JButton();
			btn_D.setBackground(Color.WHITE);
			btn_D.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/d.png")));
			btn_D.setBounds(749, 351, 277, 168);
			btn_D.setBorderPainted(false);			
			btn_D.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new MZ_list_p2_D();
					frame.setVisible(false);
				}
			});
		}
		return btn_D;
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
		MZ_logo.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/mzducklogo1.png")));
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
		button.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/se.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(931, 26, 95, 49);
		menu_G.add(button);
		
		JButton btn_QNA = new JButton("Q&A");
		btn_QNA.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_QNA.setBackground(Color.WHITE);
		btn_QNA.setBounds(44, 622, 275, 106);
		btn_QNA.setBorderPainted(false);
		menu_G.add(btn_QNA);
		
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/home.png")));
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
