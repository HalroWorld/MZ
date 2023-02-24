package mz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MZ_home_p1 {
//패널, 프레임, 버튼, 텍스트 필드 변수 생성
	private JPanel menu_G = new JPanel();
	private JFrame frame;
	private JButton btn_K, btn_C, btn_F, btn_AZ, btn_J, btn_D;
	private JTextField search;

//MZ_home_p1 생성자에서 main_P1 메소드 호출
	public MZ_home_p1() {
		main_P1();
		frame.setTitle("맛-ZIP");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1102, 999);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	// 패널에 버튼 메서드 6개 추가(버튼 눌렀을 때 넘어감)
		menu_G.add(getbtn_K());
		menu_G.add(getbtn_C());
		menu_G.add(getbtn_F());
		menu_G.add(getbtn_AZ());
		menu_G.add(getbtn_J());
		menu_G.add(getbtn_D());
	// frame 띄우기
		frame.setVisible(true);
	// frame 창 띄우자마자 센터로 옮김
		frame.setLocationRelativeTo(null);
	}
//K-FOOD 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_K() {
		if(btn_K == null) {
		// K-FOOD 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_K = new JButton("");
			btn_K.setBackground(Color.WHITE);
			btn_K.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/k.png")));
			btn_K.setBounds(44, 138, 275, 168);
			
		// 버튼 활성화 테두리 없애기
			btn_K.setBorderPainted(false);
			
		// 버튼 클릭시 2페이지 나오기(MZ_list_p2_K 생성자 호출) 및 현재 창 숨기기
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
//중식 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_C() {
		if(btn_C == null) {
		// 중식 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_C = new JButton();
			btn_C.setBackground(Color.WHITE);
			btn_C.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/c.png")));
			btn_C.setBounds(398, 140, 275, 168);
		// 버튼 활성화 테두리 없애기
			btn_C.setBorderPainted(false);	
			// 버튼 클릭시 2페이지 나오기(MZ_list_p2_C 생성자 호출) 및 현재 창 숨기기
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
	// 양식 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_F() {
		if(btn_F == null) {
			// 양식 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_F = new JButton();
			btn_F.setBackground(Color.WHITE);
			btn_F.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/f.png")));
			btn_F.setBounds(749, 138, 277, 168);
			
			// 버튼 활성화 테두리 없애기
			btn_F.setBorderPainted(false);		
			// 버튼 클릭시 2페이지 나오기(MZ_list_p2_F 생성자 호출) 및 현재 창 숨기기
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
	// A-Z 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_AZ() {
		if(btn_AZ == null) {
			// A-Z 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_AZ = new JButton();
			btn_AZ.setBackground(Color.WHITE);
			btn_AZ.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/a.png")));
			btn_AZ.setBounds(44, 351, 275, 168);
			// 버튼 활성화 테두리 없애기
			
			btn_AZ.setBorderPainted(false);		
			// 버튼 클릭시 2페이지 나오기(MZ_list_p2_AZ 생성자 호출) 및 현재 창 숨기기
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
	// 일식 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_J() {
		if(btn_J == null) {
			// 일식 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_J = new JButton();
			btn_J.setBackground(Color.WHITE);
			btn_J.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/j.png")));
			btn_J.setBounds(398, 353, 275, 168);
			
			// 버튼 활성화 테두리 없애기
			btn_J.setBorderPainted(false);		
			// 버튼 클릭시 2페이지 나오기(MZ_list_p2_J 생성자 호출) 및 현재 창 숨기기
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
	// 디저트 버튼 클릭시 다음 페이지 호출
	public JButton getbtn_D() {
		if(btn_D == null) {
			// 디저트 버튼 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
			btn_D = new JButton();
			btn_D.setBackground(Color.WHITE);
			btn_D.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/d.png")));
			btn_D.setBounds(749, 351, 277, 168);
			
			// 버튼 활성화 테두리 없애기
			btn_D.setBorderPainted(false);
			// 버튼 클릭시 2페이지 나오기(MZ_list_p2_D 생성자 호출) 및 현재 창 숨기기
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
	// main_P1 메소드 형성
	public void main_P1() {
		// 프레임 호출(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());
		frame.getContentPane().setLayout(null);
		
		// 패널 bg 생성(사이즈 및 위치 조정, 프레임에 bg 패널 추가)
		JPanel bg = new JPanel();
		bg.setBounds(1078, 0, 10, 962);
		frame.getContentPane().add(bg);
		
		// 오리 이미지 라벨 생성(이미지 추가, 컬러 추가, 사이즈 및 위치 조정, 프레임에 추가)
		JLabel MZ_logo = new JLabel("");
		MZ_logo.setBounds(33, 36, 1002, 124);
		MZ_logo.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/mzducklogo1.png")));
		MZ_logo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(MZ_logo);
		
		// scrollPane 라벨 생성(사이즈 및 위치 조정, 프레임에 추가)
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 186, 1085, 776);
		frame.getContentPane().add(scrollPane);
		// 패널 menu_G 호출(사이즈 및 위치 조정, 프레임에 추가)

		menu_G.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(menu_G);
		menu_G.setLayout(null);
		
		// JTextField 라벨 호출(사이즈 및 위치 조정, 패널에 추가, 열 생성)
		search  = new JTextField();
		search.setHorizontalAlignment(SwingConstants.LEFT);
		search.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		search.setColumns(10);
		search.setBounds(45, 27, 879, 48);
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = search.getText();
				
        if(data.equals("한식")){
        	MZ_tbl.str = "k";
				MZ_tbl.num = 1;
        }else if(data.equals("중식")) {
        	MZ_tbl.str = "c";
        }else if(data.equals("양식")) {
        	MZ_tbl.str = "f";
        }else if(data.equals("일식")) {
        	MZ_tbl.str = "j";
        }else if(data.equals("디저트")) {
        	MZ_tbl.str = "d";
        }else if(data.equals("간식")) {
        	MZ_tbl.str = "d";
        }else if(data.equals("아재")) {
        	MZ_tbl.str = "az";
        } else {
        	MZ_tbl.str = "k";
        }

        	new MZ_search();
        	frame.setVisible(false);
        	

			}
		});
		menu_G.add(search);
		
	// 검색 버튼 생성(사이즈 및 위치 조정, 패널에 추가, 이미지 적용)
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/se.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(931, 26, 95, 49);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = search.getText(); 
        if(data.equals("한식")){
        	MZ_tbl.str = "k";
				MZ_tbl.num = 1;
        }else if(data.equals("중식")) {
        	MZ_tbl.str = "c";
        }else if(data.equals("양식")) {
        	MZ_tbl.str = "f";
        }else if(data.equals("일식")) {
        	MZ_tbl.str = "j";
        }else if(data.equals("디저트")) {
        	MZ_tbl.str = "d";
        }else if(data.equals("간식")) {
        	MZ_tbl.str = "d";
        }else if(data.equals("아재")) {
        	MZ_tbl.str = "az";
        }
        
        	new MZ_search();
        	frame.setVisible(false);
        	
                }
		});
		menu_G.add(button);
		
	// QNA 버튼 생성(사이즈 및 위치 조정, 패널에 추가, 이미지 적용)
		JButton btn_QNA = new JButton("Q&A");
		btn_QNA.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_QNA.setBackground(Color.WHITE);
		btn_QNA.setBounds(44, 622, 275, 106);
		btn_QNA.setBorderPainted(false);
		menu_G.add(btn_QNA);
		
		//에러 기능 추가
		btn_QNA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane aa = new JOptionPane();
//				JOptionPane.showMessageDialog(null, "업데이트 중입니다", "경고창", JOptionPane.ERROR_MESSAGE);
				new MZ_ErrorWindow();
				}
		});
		
		// 홈 버튼 생성(사이즈 및 위치 조정, 패널에 추가, 이미지 적용)
		JButton btn_Home = new JButton("");
		btn_Home.setIcon(new ImageIcon(MZ_home_p1.class.getResource("/mz/mzImg/home.png")));
		btn_Home.setBackground(Color.WHITE);
		btn_Home.setBounds(398, 624, 275, 106);
		btn_Home.setBorderPainted(false);
		menu_G.add(btn_Home);
		
		// 리뷰 버튼 생성(사이즈 및 위치 조정, 패널에 추가, 이미지 적용)
		JButton btn_Re = new JButton("리뷰");
		btn_Re.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
		btn_Re.setBackground(Color.WHITE);
		btn_Re.setBounds(749, 622, 277, 106);
		btn_Re.setBorderPainted(false);
		menu_G.add(btn_Re);
		
		// 에러 기능 추가
		btn_Re.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane aa = new JOptionPane();
//				JOptionPane.showMessageDialog(null, "업데이트 중입니다", "경고창", JOptionPane.ERROR_MESSAGE);
				new MZ_ErrorWindow();
				}
		});
	}

}
