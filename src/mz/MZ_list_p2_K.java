package mz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MZ_list_p2_K {
	
	// 패널, 프레임 변수 생성
	public JPanel title_G = new JPanel();
	public JFrame frame2;
	
	
	
	// MZ_list_p2_K 생성자에서 list_P2 메소드 호출
	public MZ_list_p2_K() {
		list_P2();
		
		// 기본 프레임 셋팅(제목, 프레임 사이즈, 닫기 버튼)
		frame2.setTitle("맛-ZIP");
		frame2.setResizable(false);
		frame2.setVisible(true);
		frame2.setBounds(100, 100, 1101, 999);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame2 창 띄우자마자 센터로 옮김
		frame2.setLocationRelativeTo(null);
	}

	// list_P2 메서드 생성
	private void list_P2() {
		MZ_tbl.str ="k";
		// 프레임 호출(이미지 추가, 컬러 추가, 사이즈 및 위치 조정)
		frame2 = new JFrame();
		frame2.getContentPane().setFont(new Font("굴림", Font.PLAIN, 67));
		frame2.getContentPane().setBackground(new Color(255, 255, 255));
		frame2.setIconImage(new ImageIcon("src/mz/mzImg/mzduck.png").getImage());

		// DB와 연결 위해 불러오기
		MZ_DB db = new MZ_DB();
		db.select("k", 1);
		
		// 패널 title_G 호출(사이즈 및 위치 조정, 프레임에 추가)
		title_G = new JPanel();
		title_G.setPreferredSize(new Dimension(100, 200));
		title_G.setBackground(Color.WHITE);
		title_G.setLayout(new GridLayout(0, 2, 0, 0));
		
		// title 라벨 생성(K-푸드 위치 조정, 폰트 변경, 패널에 추가)
		JLabel title = new JLabel("K- 푸드");
	
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(new Color(0, 0, 0));
		title.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 99));
		title_G.add(title);
		
		// btn_home 버튼 생성(위치 조정, 이미지 추가, 폰트 변경, 패널에 추가)
		// 텍스트 변경 안되고 이미지 수정 필요
		JButton btn_home = new JButton("home");
		btn_home.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_home.setIcon(new ImageIcon(MZ_list_p2_K.class.getResource("/mz/mzImg/home.png")));
		btn_home.setBorderPainted(false);
		btn_home.setBackground(new Color (255,255,255));
		title_G.add(btn_home);

		btn_home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                if(btn_home.getText().equals("home")){
                    new MZ_home_p1();
					frame2.setVisible(false);
                }
			}
		});

		// list_G 패널 생성(위치 조정, 이미지 추가, 폰트 변경, 패널에 추가)
		JPanel list_G = new JPanel();
		list_G.setPreferredSize(new Dimension(1000, 1900));
		list_G.setBackground(Color.WHITE);
//		scrollPane.setViewportView(list_G);
		list_G.setLayout(null);
		
		
		// 반복문 1
			db.select(MZ_tbl.str, 1);
			int b = 650 * 0;
			JLabel img1 = new JLabel();
			img1.setIcon(new ImageIcon(db.path[0]));
			img1.setHorizontalAlignment(SwingConstants.CENTER);
			img1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img1.setBounds(0, 0 + b, 542, 327);
			list_G.add(img1);
			
			JLabel img2 = new JLabel();
			img2.setIcon(new ImageIcon(db.path[1]));
			img2.setHorizontalAlignment(SwingConstants.CENTER);
			img2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img2.setBounds(540, 0 + b, 542, 327);
			list_G.add(img2);
			
			JLabel score = new JLabel("별점");
			score.setForeground(new Color(39, 39, 39));
			score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			score.setBounds(369, 336 + b, 78, 109);
			list_G.add(score);
			
			JLabel open_H = new JLabel("영업시간");
			open_H.setForeground(new Color(0, 0, 0));
			open_H.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			open_H.setBounds(10, 429 + b, 118, 109);
			list_G.add(open_H);
			
			JLabel Hour = new JLabel(db.mzList.getMzHours());
			Hour.setForeground(new Color(39, 39, 39));
			Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			Hour.setBounds(140, 429 + b, 403, 109);
			list_G.add(Hour);
			
			JLabel reveiw = new JLabel("리뷰");
			reveiw.setForeground(Color.BLACK);
			reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			reveiw.setBounds(592, 426 + b, 78, 109);
			list_G.add(reveiw);
			
			JLabel reveiw_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			reveiw_score.setForeground(new Color(255, 199, 7));
			reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			reveiw_score.setBounds(668, 427 + b, 118, 109);
			list_G.add(reveiw_score);
			
			JLabel veiws = new JLabel("조회수");
			veiws.setForeground(Color.BLACK);
			veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			veiws.setBounds(798, 426 + b, 78, 109);
			list_G.add(veiws);
			
			JLabel views_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			views_score.setForeground(new Color(39, 39, 39));
			views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			views_score.setBounds(894, 426 + b, 118, 109);
			list_G.add(views_score);
			
			JButton btn_storeName = new JButton(db.mzList.getMzTitle());
			btn_storeName.setForeground(new Color(0, 0, 0));
			btn_storeName.setHorizontalAlignment(SwingConstants.LEFT);
			btn_storeName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
			btn_storeName.setBounds(0, 355 + b, 350, 68);
			btn_storeName.setBorderPainted(false);
			btn_storeName.setBackground(new Color (255,255,255));
			list_G.add(btn_storeName);
			btn_storeName.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_storeName.getText().equals(db.mzList.getMzTitle())){
////                    MZ_menu_p3.MZ_menu_p3();
					MZ_tbl.num=1;
						MZ_DB_Update up = new MZ_DB_Update();
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			
			JButton btn_More = new JButton("더보기");
			btn_More.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btn_More.setBounds(790, 358 + b, 147, 62);
			btn_More.setBorderPainted(false);
			btn_More.setBackground(new Color (255,255,255));
			list_G.add(btn_More);
			
			btn_More.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_More.getText().equals("더보기")){
//                    MZ_menu_p3.MZ_menu_p3();
						MZ_DB_Update up = new MZ_DB_Update();
						MZ_tbl.num=1;
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			frame2.getContentPane().setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel = new JLabel("주소");
			lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 548 + b, 71, 52);
			list_G.add(lblNewLabel);
			
			JLabel addr = new JLabel(db.mzList.getMzAddr());
			addr.setForeground(new Color(70, 70, 70));
			addr.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			addr.setBounds(83, 548 + b, 861, 52);
			TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
//			addr.setBorder()
			list_G.add(addr);
			
			JLabel line 
			= new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------");
			line.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			line.setBounds(0, 558 + b, 1200, 100);
			line.setForeground(new Color(255, 199, 7));
			list_G.add(line);
			
			JLabel star ; 
//		star.setHorizontalAlignment(SwingConstants.CENTER);
			
			int total = (int)db.mzList.getMzStar();
			int count = db.mzList.getMzStarCount();
			int avg = 0;
			String result;
			
			if(count == 0){
				result = "";
			} else {
				avg = (int)total/count;				
			}
			
			switch(avg) {
			case 5: result = "★★★★★";
			break;
			case 4: result = "★★★★";
			break;
			case 3: result = "★★★";
			break;
			case 2: result = "★★";
			break;
			case 1: result = "★";
			break;
			default: result = "평점을 남겨주세요.";
			break;
			}
			System.out.print(result);
			star = new JLabel(result);
			
			star.setForeground(new Color(255, 199, 7));
			star.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
			star.setBounds(436, 356 + b, 350, 64);
			list_G.add(star);
			
			
			// 반복문 2
			db.select(MZ_tbl.str, 2);
			b = 650 * 1;
			img1 = new JLabel();
			img1.setIcon(new ImageIcon(db.path[0]));
			img1.setHorizontalAlignment(SwingConstants.CENTER);
			img1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img1.setBounds(0, 0 + b, 542, 327);
			list_G.add(img1);
			
			img2 = new JLabel();
			img2.setIcon(new ImageIcon(db.path[1]));
			img2.setHorizontalAlignment(SwingConstants.CENTER);
			img2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img2.setBounds(540, 0 + b, 542, 327);
			list_G.add(img2);
			
			score = new JLabel("별점");
			score.setForeground(new Color(39, 39, 39));
			score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			score.setBounds(369, 336 + b, 78, 109);
			list_G.add(score);
			
			open_H = new JLabel("영업시간");
			open_H.setForeground(new Color(0, 0, 0));
			open_H.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			open_H.setBounds(10, 429 + b, 118, 109);
			list_G.add(open_H);
			
			Hour = new JLabel(db.mzList.getMzHours());
			Hour.setForeground(new Color(39, 39, 39));
			Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			Hour.setBounds(140, 429 + b, 403, 109);
			list_G.add(Hour);
			
			reveiw = new JLabel("리뷰");
			reveiw.setForeground(Color.BLACK);
			reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			reveiw.setBounds(592, 426 + b, 78, 109);
			list_G.add(reveiw);
			
			reveiw_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			reveiw_score.setForeground(new Color(255, 199, 7));
			reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			reveiw_score.setBounds(668, 427 + b, 118, 109);
			list_G.add(reveiw_score);
			
			veiws = new JLabel("조회수");
			veiws.setForeground(Color.BLACK);
			veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			veiws.setBounds(798, 426 + b, 78, 109);
			list_G.add(veiws);
			
			views_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			views_score.setForeground(new Color(39, 39, 39));
			views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			views_score.setBounds(894, 426 + b, 118, 109);
			list_G.add(views_score);
			
			btn_storeName = new JButton(db.mzList.getMzTitle());
			btn_storeName.setForeground(new Color(0, 0, 0));
			btn_storeName.setHorizontalAlignment(SwingConstants.LEFT);
			btn_storeName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
			btn_storeName.setBounds(0, 355 + b, 350, 68);
			btn_storeName.setBorderPainted(false);
			btn_storeName.setBackground(new Color (255,255,255));
			list_G.add(btn_storeName);
			btn_storeName.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_storeName.getText().equals(db.mzList.getMzTitle())){
////                    MZ_menu_p3.MZ_menu_p3();
						MZ_DB_Update up = new MZ_DB_Update();
						MZ_tbl.num=2;
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
						
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			
			btn_More = new JButton("더보기");
			btn_More.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btn_More.setBounds(790, 358 + b, 147, 62);
			btn_More.setBorderPainted(false);
			btn_More.setBackground(new Color (255,255,255));
			list_G.add(btn_More);
			
			btn_More.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_More.getText().equals("더보기")){
//                    MZ_menu_p3.MZ_menu_p3();
						MZ_DB_Update up = new MZ_DB_Update();
						MZ_tbl.num=2;
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
						
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			frame2.getContentPane().setLayout(new BorderLayout(0, 0));
			
			lblNewLabel = new JLabel("주소");
			lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 548 + b, 71, 52);
			list_G.add(lblNewLabel);
			
			addr = new JLabel(db.mzList.getMzAddr());
			addr.setForeground(new Color(70, 70, 70));
			addr.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			addr.setBounds(83, 548 + b, 861, 52);
			tb = new TitledBorder(new LineBorder(Color.black));
//			addr.setBorder()
			list_G.add(addr);
			
			line 
			= new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------");
			line.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			line.setBounds(0, 558 + b, 1200, 100);
			line.setForeground(new Color(255, 199, 7));
			list_G.add(line);
			
			JLabel star1 ; 
//		star.setHorizontalAlignment(SwingConstants.CENTER);
			
			int total1 = (int)db.mzList.getMzStar();
			int count1 = db.mzList.getMzStarCount();
			int avg1 = 0;
			String result1;
			
			if(count1 == 0){
				result1 = "";
			} else {
				avg1 = (int)total1/count1;				
			}
			
			switch(avg1) {
			case 5: result1 = "★★★★★";
			break;
			case 4: result1 = "★★★★";
			break;
			case 3: result1 = "★★★";
			break;
			case 2: result1 = "★★";
			break;
			case 1: result1 = "★";
			break;
			default: result1 = "평점을 남겨주세요.";
			break;
			}
			System.out.print(result);
			star1 = new JLabel(result);
			
			star1.setForeground(new Color(255, 199, 7));
			star1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
			star1.setBounds(436, 356 + b, 350, 64);
			list_G.add(star1);
			
			
			
			// 반복문 3
			db.select(MZ_tbl.str, 3);
			b = 650 * 2;
			img1 = new JLabel();
			img1.setIcon(new ImageIcon(db.path[0]));
			img1.setHorizontalAlignment(SwingConstants.CENTER);
			img1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img1.setBounds(0, 0 + b, 542, 327);
			list_G.add(img1);
			
			img2 = new JLabel();
			img2.setIcon(new ImageIcon(db.path[1]));
			img2.setHorizontalAlignment(SwingConstants.CENTER);
			img2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 28));
			img2.setBounds(540, 0 + b, 542, 327);
			list_G.add(img2);
			
			score = new JLabel("별점");
			score.setForeground(new Color(39, 39, 39));
			score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			score.setBounds(369, 336 + b, 78, 109);
			list_G.add(score);
			
			open_H = new JLabel("영업시간");
			open_H.setForeground(new Color(0, 0, 0));
			open_H.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			open_H.setBounds(10, 429 + b, 118, 109);
			list_G.add(open_H);
			
			Hour = new JLabel(db.mzList.getMzHours());
			Hour.setForeground(new Color(39, 39, 39));
			Hour.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			Hour.setBounds(140, 429 + b, 403, 109);
			list_G.add(Hour);
			
			reveiw = new JLabel("리뷰");
			reveiw.setForeground(Color.BLACK);
			reveiw.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			reveiw.setBounds(592, 426 + b, 78, 109);
			list_G.add(reveiw);
			
			reveiw_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			reveiw_score.setForeground(new Color(255, 199, 7));
			reveiw_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			reveiw_score.setBounds(668, 427 + b, 118, 109);
			list_G.add(reveiw_score);
			
			veiws = new JLabel("조회수");
			veiws.setForeground(Color.BLACK);
			veiws.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			veiws.setBounds(798, 426 + b, 78, 109);
			list_G.add(veiws);
			
			views_score = new JLabel(Integer.toString(db.mzList.getMzHit()));
			views_score.setForeground(new Color(39, 39, 39));
			views_score.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			views_score.setBounds(894, 426 + b, 118, 109);
			list_G.add(views_score);
			
			btn_storeName = new JButton(db.mzList.getMzTitle());
			btn_storeName.setForeground(new Color(0, 0, 0));
			btn_storeName.setHorizontalAlignment(SwingConstants.LEFT);
			btn_storeName.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
			btn_storeName.setBounds(0, 355 + b, 350, 68);
			btn_storeName.setBorderPainted(false);
			btn_storeName.setBackground(new Color (255,255,255));
			list_G.add(btn_storeName);
			btn_storeName.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_storeName.getText().equals(db.mzList.getMzTitle())){
////                    MZ_menu_p3.MZ_menu_p3();
						MZ_DB_Update up = new MZ_DB_Update();
						MZ_tbl.num=3;
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
						
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			
			btn_More = new JButton("더보기");
			btn_More.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
			btn_More.setBounds(790, 358 + b, 147, 62);
			btn_More.setBorderPainted(false);
			btn_More.setBackground(new Color (255,255,255));
			list_G.add(btn_More);
			
			btn_More.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					if(btn_More.getText().equals("더보기")){
//                    MZ_menu_p3.MZ_menu_p3();
						MZ_DB_Update up = new MZ_DB_Update();
						MZ_tbl.num=3;
						up.update("update k_mz_tbl set mz_hit=(mz_hit+1) where mz_uid = "+ MZ_tbl.num + ";");
					
						MZ_menu_p3.main(null);
						frame2.setVisible(false);
//					}
				}
			});
			frame2.getContentPane().setLayout(new BorderLayout(0, 0));
			
			lblNewLabel = new JLabel("주소");
			lblNewLabel.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 548 + b, 71, 52);
			list_G.add(lblNewLabel);
			
			addr = new JLabel(db.mzList.getMzAddr());
			addr.setForeground(new Color(70, 70, 70));
			addr.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			addr.setBounds(83, 548 + b, 861, 52);
			tb = new TitledBorder(new LineBorder(Color.black));
//			addr.setBorder()
			list_G.add(addr);
			
			line 
			= new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------");
			line.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			line.setBounds(0, 558 + b, 1200, 100);
			line.setForeground(new Color(255, 199, 7));
			list_G.add(line);
			
			JLabel star2 ; 
//		star.setHorizontalAlignment(SwingConstants.CENTER);
			
			int total2 = (int)db.mzList.getMzStar();
			int count2 = db.mzList.getMzStarCount();
			int avg2 = 0;
			String result2;
			
			if(count2 == 0){
				result2 = "";
			} else {
				avg2 = (int)total2/count2;				
			}
			
			switch(avg2) {
			case 5: result2 = "★★★★★";
			break;
			case 4: result2 = "★★★★";
			break;
			case 3: result2 = "★★★";
			break;
			case 2: result2 = "★★";
			break;
			case 1: result2 = "★";
			break;
			default: result2 = "평점을 남겨주세요.";
			break;
			}
			System.out.print(result2);
			star2 = new JLabel(result2);
			
			star2.setForeground(new Color(255, 199, 7));
			star2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
			star2.setBounds(436, 356 + b, 350, 64);
			list_G.add(star2);
			
	
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
      	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
      	JScrollPane scrollPane = new JScrollPane(list_G, v, h);
      	scrollPane.getVerticalScrollBar().setUnitIncrement(16);
      	
		frame2.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame2.getContentPane().add(title_G, BorderLayout.NORTH);
//		frame2.getContentPane().setLayout(groupLayout);
	}
}
