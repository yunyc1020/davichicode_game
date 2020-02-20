package davinci01;

import java.awt.Color;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GHome extends JFrame{
	//패널 구분 변수
	public static int STATE=1; 
	
	/*패널 선언*/
	JPanel p_mainpage=new JPanel() {
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//그리는 함수 
			g.drawImage(background, 0, 0, null);//background를 그려줌  
			paintComponents(g);
		}
	}; 

	//Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage();//배경이미지 
	//JPanel p_mainpage=new JPanel();
	JPanel p_explain=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//그리는 함수 
			g.drawImage(background, 0, 0, null);//background를 그려줌  
			paintComponents(g);
		}
	}; 
	
	static JPanel p_play=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/ingame.jpg")).getImage(); 
		public void paint(Graphics g) {//그리는 함수 
			g.drawImage(background, 0, 0, null);//background를 그려줌  
			paintComponents(g);
		}
	}; 
	
	JPanel p_search=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//그리는 함수 
			g.drawImage(background, 0, 0, null);//background를 그려줌  
			paintComponents(g);
		}
	}; 
	
	/*메인페이지 버튼*/
	JButton b_explain=new JButton("게임설명");
	JButton b_makegame=new JButton("게임만들기");
	JButton b_search=new JButton("게임검색");
	/*홈 버튼*/
	JButton b_goHome=new JButton("홈");
	ImageIcon homebutton1 = new ImageIcon(Main.class.getResource("../image/homebutton1.png"));//마우스 안 올렸을때 이미지
	ImageIcon homebutton2 = new ImageIcon(Main.class.getResource("../image/homebutton2.png"));//마우스 올렸을 때 이미지
	/*드로우 버튼*/
	ImageIcon draw = new ImageIcon(Main.class.getResource("../image/draw.png"));//마우스 안 올렸을 때 이미지
	ImageIcon draw2 = new ImageIcon(Main.class.getResource("../image/draw2.png"));//마우스 올렸을 때 이미지
	/*카드 버튼*/
	/*검*/
	static ImageIcon b_ze = new ImageIcon(Main.class.getResource("../image/b0.png"));
	static ImageIcon b_one = new ImageIcon(Main.class.getResource("../image/b1.png"));
	static ImageIcon b_two = new ImageIcon(Main.class.getResource("../image/b2.png"));
	static ImageIcon b_three = new ImageIcon(Main.class.getResource("../image/b3.png"));
	static ImageIcon b_four = new ImageIcon(Main.class.getResource("../image/b4.png"));
	static ImageIcon b_five = new ImageIcon(Main.class.getResource("../image/b5.png"));
	static ImageIcon b_six = new ImageIcon(Main.class.getResource("../image/b6.png"));
	static ImageIcon b_seven = new ImageIcon(Main.class.getResource("../image/b7.png"));
	static ImageIcon b_eight = new ImageIcon(Main.class.getResource("../image/b8.png"));
	static ImageIcon b_nine = new ImageIcon(Main.class.getResource("../image/b9.png"));
	static ImageIcon b_ten = new ImageIcon(Main.class.getResource("../image/b10.png"));
	static ImageIcon b_eleven = new ImageIcon(Main.class.getResource("../image/b11.png"));
	static ImageIcon b_joker = new ImageIcon(Main.class.getResource("../image/bjoker.png"));
	/*흰*/
	static ImageIcon w_ze = new ImageIcon(Main.class.getResource("../image/w0.png"));
	static ImageIcon w_one = new ImageIcon(Main.class.getResource("../image/w1.png"));
	static ImageIcon w_two = new ImageIcon(Main.class.getResource("../image/w2.png"));
	static ImageIcon w_three = new ImageIcon(Main.class.getResource("../image/w3.png"));
	static ImageIcon w_four = new ImageIcon(Main.class.getResource("../image/w4.png"));
	static ImageIcon w_five = new ImageIcon(Main.class.getResource("../image/w5.png"));
	static ImageIcon w_six = new ImageIcon(Main.class.getResource("../image/w6.png"));
	static ImageIcon w_seven = new ImageIcon(Main.class.getResource("../image/w7.png"));
	static ImageIcon w_eight = new ImageIcon(Main.class.getResource("../image/w8.png"));
	static ImageIcon w_nine = new ImageIcon(Main.class.getResource("../image/w9.png"));
	static ImageIcon w_ten = new ImageIcon(Main.class.getResource("../image/w10.png"));
	static ImageIcon w_eleven = new ImageIcon(Main.class.getResource("../image/w11.png"));
	static ImageIcon w_joker = new ImageIcon(Main.class.getResource("../image/wjoker.png"));
	/*game 실행*/
	Ingame ingame =new Ingame();
	
	public GHome() {
		homeframe();
		p_mainpagestart();
	}
	/*frame설정*/
	private void homeframe(){
		setTitle("davinci_ver01");
		setSize(Main.WIDTH,Main.HEIGHT);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setVisible(true);//창이 보이게
		setLocationRelativeTo(null);//창이 가운데 나오게
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	
	/*초기화면 패널설정*/
	protected void p_mainpagestart() {
		STATE=1;
		/*패널 크기 설정 및 추가*/
		p_mainpage.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_mainpage.setLayout(null);
		add(p_mainpage);
		/*홈 화면에 게임 이름 표시*/
		JLabel gname=new JLabel("Da vinci code");
		gname.setBounds(272, 100, 900, 200);
		Font font1 = new Font("CommercialScript BT",Font.BOLD,120);
//		gname.setForeground(Color.white);
		gname.setFont(font1);		
		p_mainpage.add(gname);
		
		/*패널에 버튼 추가*/
		b_explain.setBounds(520,300, 200, 50);
		b_makegame.setBounds(520,370, 200, 50);
		b_search.setBounds(520, 440, 200, 50);
		Font font2 = new Font("Dialog",Font.BOLD, 30);
		b_explain.setFont(font2);
		b_makegame.setFont(font2);
		b_search.setFont(font2);
		
/*		b_explain.setBorderPainted(false);
		b_explain.setContentAreaFilled(false);
		b_explain.setFocusPainted(false);
		b_makegame.setBorderPainted(false);
		b_makegame.setContentAreaFilled(false);
		b_makegame.setFocusPainted(false);
		b_search.setBorderPainted(false);
		b_search.setContentAreaFilled(false);
		b_search.setFocusPainted(false);
*/
		p_mainpage.add(b_explain);
		p_mainpage.add(b_makegame);
		p_mainpage.add(b_search);
		
		h3btn();
	}
//	public void paint(Graphics g) {//그리는 함수 
//		g.drawImage(background, 0, 0, null);//background를 그려줌  
//	}
	
	/*설명창*/
	protected void p_explain() {
		STATE=2;
		
		/*패널 크기 설정 및 추가*/
		p_explain.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_explain.setLayout(null);
		JLabel gexplain=new JLabel("Da vinci code");
		JLabel gexplain2 = new JLabel("▶ 게임의 구성");
		JLabel gexplain3 = new JLabel("● 검정 숫자 타일 13개(0~11, 조커 1개)");
		JLabel gexplain4 = new JLabel("● 흰 숫자 타일 13개(0~11, 조커 1개)");
		JLabel gexplain5 = new JLabel("▶ 게임 진행");
		JLabel gexplain6 = new JLabel("1. 모든 블록을 뒤집어 섞어둔 후 2/3인 플레이는 4개, 4인 플레이는 3개의 패를 가져간다.");
		JLabel gexplain7 = new JLabel("시작패에는 조커가 있으면 안되며, 조커를 집은 사람은 조커를 돌려놓고 다른 패를 뽑은 후 다시 잘 섞어둔다.");
		JLabel gexplain8 = new JLabel("자신의 패를 규칙대로, 그러나 다른 사람에게 숫자가 보이지 않게 세워둔다. 자신을 기준으로 왼쪽이 작은수, 오른쪽이 큰 수가 되도록 배열해야한다.");
		JLabel gexplain9 = new JLabel("검은색과 흰색이 같은 숫자일 경우 검은색을 왼쪽에 놓는다.");
		JLabel gexplain10 = new JLabel("2. 가위바위보 등 임의의 방법으로 차례를 정한다.");
		JLabel gexplain11 = new JLabel("3. 자신의 차례에는 뒤집어 둔 블록을 하나 가져와 규칙대로 자기 패에 끼워 넣는다. 이때 가져온 것이 조커블록이라면 자신이 원하는 위치에 집어 넣을 수 있다.");
		JLabel gexplain12 = new JLabel("4. 다른 플레이어 중 아무의 것이나 블록 하나를 지목해 숫자를 맞혀야 한다. 말한 숫자가 맞다면 상대는 그 블럭을 보이도록 눕혀 공개해야 한다");
		JLabel gexplain13 = new JLabel("틀렸다면, 숫자를 말한 사람이 그 차례에 가져갔던 블록을 눕혀 공개해야 한다. 숫자를 맞히지 못하고 자신의 블록을 공개했다면 차례가 끝나고 다음 사람에게 넘어간다.");
		JLabel gexplain14 = new JLabel("5. 선택지는 다른 블록을 맞히는 데 더 도전하느냐, 아니면 차례를 넘기느냐이다. 재도전하려면 아직 공개되지 않은 다른 사람의 블록을 또하나 추리해 숫자를 말하면 된다.");
		JLabel gexplain15 = new JLabel("이 기회는 틀리지 않고 맞힌다면 끝없이 계속 이어진다. 틀릴 경우에는 4번과 같다. 또는 맞히는 것을 중단하고 차례를 그냥 넘길 수 있다.");
		JLabel gexplain16 = new JLabel("자신이 가져온 패를 공개하는 위험을 피하는 것이다. 하나 이상의 패를 맞힌 승자의 권리인 셈. 연속해서 맞히던 도중이라면 아무 때나 차례를 중단하고 넘길 수 있다");
		JLabel gexplain17 = new JLabel("6. 숫자가 모두 드러난 사람은 패한다. 마지막까지 살아남은 사람이 승자.");
		
		
		gexplain.setBounds(250,50, 500, 100);
		Font font3 = new Font("CommercialScript BT",Font.BOLD,50);
		gexplain.setFont(font3);
		
		gexplain2.setBounds(150,150,800,30);
		Font font4 = new Font("Dialog",Font.BOLD,20);
		gexplain2.setFont(font4);
		
		gexplain3.setBounds(180,190,800,15);
		gexplain4.setBounds(180,220,800,15);
		
		gexplain5.setBounds(150,250,800,30);
		Font font5 = new Font("Dialog",Font.BOLD,20);
		gexplain5.setFont(font5);
		
		gexplain6.setBounds(180,290,800,15);
		gexplain7.setBounds(180,320,800,15);
		gexplain8.setBounds(180,350,800,15);
		gexplain9.setBounds(180,380,800,15);
		gexplain10.setBounds(180,410,800,15);
		gexplain11.setBounds(180,440,1000,15);
		gexplain12.setBounds(180,470,1000,15);
		gexplain13.setBounds(180,500,1000,15);
		gexplain14.setBounds(180,530,1000,15);
		gexplain15.setBounds(180,560,1000,15);
		gexplain16.setBounds(180,590,1000,15);
		gexplain17.setBounds(180,620,1000,15);
		
		p_explain.add(gexplain);
		p_explain.add(gexplain2);
		p_explain.add(gexplain3);
		p_explain.add(gexplain4);
		p_explain.add(gexplain5);
		p_explain.add(gexplain6);
		p_explain.add(gexplain7);
		p_explain.add(gexplain8);
		p_explain.add(gexplain9);
		p_explain.add(gexplain10);
		p_explain.add(gexplain11);
		p_explain.add(gexplain12);
		p_explain.add(gexplain13);
		p_explain.add(gexplain14);
		p_explain.add(gexplain15);
		p_explain.add(gexplain16);
		p_explain.add(gexplain17);
		
		add(p_explain);
		p_explain.setVisible(false);
		
	}
	
	/*게임만들기*/
	protected void mkgame() {
		STATE=3;
		/*패널 크기 설정 및 추가*/
		p_play.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_play.setLayout(null);
		JLabel gname=new JLabel("게임만들기");
		gname.setBounds(250,250, 20, 20);
		p_play.add(gname);
		add(p_play);
		p_play.setVisible(false);
	}
	/*게임찾기*/
	protected void fdgame() {
		STATE=4;
		/*패널 크기 설정 및 추가*/
		p_search.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_search.setLayout(null);
		JLabel gname=new JLabel("게임찾기");
		gname.setBounds(250,50, 100, 100);
		p_search.add(gname);
		add(p_search);
		p_search.setVisible(false);
	}
	
	/* 버튼이벤트*/
	protected void h3btn(){
		/*게임 설명*/
		b_explain.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				p_explain(); 
				p_mainpage.setVisible(false);
				p_explain.setVisible(true);
				p_play.setVisible(false);
				p_search.setVisible(false);
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//버튼의 아이콘 설정 
				p_explain.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);

			} 
		});

		/*게임만들기*/
		b_makegame.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				mkgame();
				p_mainpage.setVisible(false);
				p_explain.setVisible(false);
				p_play.setVisible(true);
				p_search.setVisible(false);
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//버튼의 아이콘 설정 
				p_play.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);
				/*게임시작*/
				ingame.startgame();
				ingame.b_draw.setIcon(draw);
				/*
				ingame.p1cardb01.setIcon(w_one);
				*/
			} 
		});

		/*게임찾기*/
		b_search.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				fdgame(); 
				p_mainpage.setVisible(false);
				p_play.setVisible(false);
				p_explain.setVisible(false);
				p_search.setVisible(true);		
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//버튼의 아이콘 설정 
				p_search.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);
			} 
		});
		/*홈버튼*/
		b_goHome.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때
				b_goHome.setIcon(homebutton2);//버튼의 아이콘 설정 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때
				b_goHome.setIcon(homebutton1);//버튼의 아이콘 설정 
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				switch(STATE) {
					case 2:
						p_explain.setVisible(false);
						p_mainpage.setVisible(true);
						break;
					case 3:
						p_play.setVisible(false);
						p_mainpage.setVisible(true);
						break;
					case 4:
						p_search.setVisible(false);
						p_mainpage.setVisible(true);
						break;
				}
			} 
		});
		/*draw 이미지*/
		ingame.b_draw.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
				ingame.b_draw.setIcon(draw2);
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
				ingame.b_draw.setIcon(draw);
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 				
				ingame.b_draw.setIcon(draw2);
				if(ingame.player == 1) {
					/*player1 카드 뽑기*/
					ingame.carddraw(ingame.p1number, ingame.player);
					ingame.player = 2;
				}else {
					/*player2 카드 뽑기*/
					ingame.carddraw(ingame.p2number, ingame.player);
					ingame.player = 1;	
				}
			} 
		});
	}
}
