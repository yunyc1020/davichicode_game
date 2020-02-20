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
	//�г� ���� ����
	public static int STATE=1; 
	
	/*�г� ����*/
	JPanel p_mainpage=new JPanel() {
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//�׸��� �Լ� 
			g.drawImage(background, 0, 0, null);//background�� �׷���  
			paintComponents(g);
		}
	}; 

	//Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage();//����̹��� 
	//JPanel p_mainpage=new JPanel();
	JPanel p_explain=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//�׸��� �Լ� 
			g.drawImage(background, 0, 0, null);//background�� �׷���  
			paintComponents(g);
		}
	}; 
	
	static JPanel p_play=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/ingame.jpg")).getImage(); 
		public void paint(Graphics g) {//�׸��� �Լ� 
			g.drawImage(background, 0, 0, null);//background�� �׷���  
			paintComponents(g);
		}
	}; 
	
	JPanel p_search=new JPanel(){
		Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage(); 
		public void paint(Graphics g) {//�׸��� �Լ� 
			g.drawImage(background, 0, 0, null);//background�� �׷���  
			paintComponents(g);
		}
	}; 
	
	/*���������� ��ư*/
	JButton b_explain=new JButton("���Ӽ���");
	JButton b_makegame=new JButton("���Ӹ����");
	JButton b_search=new JButton("���Ӱ˻�");
	/*Ȩ ��ư*/
	JButton b_goHome=new JButton("Ȩ");
	ImageIcon homebutton1 = new ImageIcon(Main.class.getResource("../image/homebutton1.png"));//���콺 �� �÷����� �̹���
	ImageIcon homebutton2 = new ImageIcon(Main.class.getResource("../image/homebutton2.png"));//���콺 �÷��� �� �̹���
	/*��ο� ��ư*/
	ImageIcon draw = new ImageIcon(Main.class.getResource("../image/draw.png"));//���콺 �� �÷��� �� �̹���
	ImageIcon draw2 = new ImageIcon(Main.class.getResource("../image/draw2.png"));//���콺 �÷��� �� �̹���
	/*ī�� ��ư*/
	/*��*/
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
	/*��*/
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
	/*game ����*/
	Ingame ingame =new Ingame();
	
	public GHome() {
		homeframe();
		p_mainpagestart();
	}
	/*frame����*/
	private void homeframe(){
		setTitle("davinci_ver01");
		setSize(Main.WIDTH,Main.HEIGHT);//�������� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		setVisible(true);//â�� ���̰�
		setLocationRelativeTo(null);//â�� ��� ������
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	
	/*�ʱ�ȭ�� �гμ���*/
	protected void p_mainpagestart() {
		STATE=1;
		/*�г� ũ�� ���� �� �߰�*/
		p_mainpage.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_mainpage.setLayout(null);
		add(p_mainpage);
		/*Ȩ ȭ�鿡 ���� �̸� ǥ��*/
		JLabel gname=new JLabel("Da vinci code");
		gname.setBounds(272, 100, 900, 200);
		Font font1 = new Font("CommercialScript BT",Font.BOLD,120);
//		gname.setForeground(Color.white);
		gname.setFont(font1);		
		p_mainpage.add(gname);
		
		/*�гο� ��ư �߰�*/
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
//	public void paint(Graphics g) {//�׸��� �Լ� 
//		g.drawImage(background, 0, 0, null);//background�� �׷���  
//	}
	
	/*����â*/
	protected void p_explain() {
		STATE=2;
		
		/*�г� ũ�� ���� �� �߰�*/
		p_explain.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_explain.setLayout(null);
		JLabel gexplain=new JLabel("Da vinci code");
		JLabel gexplain2 = new JLabel("�� ������ ����");
		JLabel gexplain3 = new JLabel("�� ���� ���� Ÿ�� 13��(0~11, ��Ŀ 1��)");
		JLabel gexplain4 = new JLabel("�� �� ���� Ÿ�� 13��(0~11, ��Ŀ 1��)");
		JLabel gexplain5 = new JLabel("�� ���� ����");
		JLabel gexplain6 = new JLabel("1. ��� ����� ������ ����� �� 2/3�� �÷��̴� 4��, 4�� �÷��̴� 3���� �и� ��������.");
		JLabel gexplain7 = new JLabel("�����п��� ��Ŀ�� ������ �ȵǸ�, ��Ŀ�� ���� ����� ��Ŀ�� �������� �ٸ� �и� ���� �� �ٽ� �� ����д�.");
		JLabel gexplain8 = new JLabel("�ڽ��� �и� ��Ģ���, �׷��� �ٸ� ������� ���ڰ� ������ �ʰ� �����д�. �ڽ��� �������� ������ ������, �������� ū ���� �ǵ��� �迭�ؾ��Ѵ�.");
		JLabel gexplain9 = new JLabel("�������� ����� ���� ������ ��� �������� ���ʿ� ���´�.");
		JLabel gexplain10 = new JLabel("2. ���������� �� ������ ������� ���ʸ� ���Ѵ�.");
		JLabel gexplain11 = new JLabel("3. �ڽ��� ���ʿ��� ������ �� ����� �ϳ� ������ ��Ģ��� �ڱ� �п� ���� �ִ´�. �̶� ������ ���� ��Ŀ����̶�� �ڽ��� ���ϴ� ��ġ�� ���� ���� �� �ִ�.");
		JLabel gexplain12 = new JLabel("4. �ٸ� �÷��̾� �� �ƹ��� ���̳� ��� �ϳ��� ������ ���ڸ� ������ �Ѵ�. ���� ���ڰ� �´ٸ� ���� �� ���� ���̵��� ���� �����ؾ� �Ѵ�");
		JLabel gexplain13 = new JLabel("Ʋ�ȴٸ�, ���ڸ� ���� ����� �� ���ʿ� �������� ����� ���� �����ؾ� �Ѵ�. ���ڸ� ������ ���ϰ� �ڽ��� ����� �����ߴٸ� ���ʰ� ������ ���� ������� �Ѿ��.");
		JLabel gexplain14 = new JLabel("5. �������� �ٸ� ����� ������ �� �� �����ϴ���, �ƴϸ� ���ʸ� �ѱ�����̴�. �絵���Ϸ��� ���� �������� ���� �ٸ� ����� ����� ���ϳ� �߸��� ���ڸ� ���ϸ� �ȴ�.");
		JLabel gexplain15 = new JLabel("�� ��ȸ�� Ʋ���� �ʰ� �����ٸ� ������ ��� �̾�����. Ʋ�� ��쿡�� 4���� ����. �Ǵ� ������ ���� �ߴ��ϰ� ���ʸ� �׳� �ѱ� �� �ִ�.");
		JLabel gexplain16 = new JLabel("�ڽ��� ������ �и� �����ϴ� ������ ���ϴ� ���̴�. �ϳ� �̻��� �и� ���� ������ �Ǹ��� ��. �����ؼ� ������ �����̶�� �ƹ� ���� ���ʸ� �ߴ��ϰ� �ѱ� �� �ִ�");
		JLabel gexplain17 = new JLabel("6. ���ڰ� ��� �巯�� ����� ���Ѵ�. ���������� ��Ƴ��� ����� ����.");
		
		
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
	
	/*���Ӹ����*/
	protected void mkgame() {
		STATE=3;
		/*�г� ũ�� ���� �� �߰�*/
		p_play.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_play.setLayout(null);
		JLabel gname=new JLabel("���Ӹ����");
		gname.setBounds(250,250, 20, 20);
		p_play.add(gname);
		add(p_play);
		p_play.setVisible(false);
	}
	/*����ã��*/
	protected void fdgame() {
		STATE=4;
		/*�г� ũ�� ���� �� �߰�*/
		p_search.setBounds(0, 0, Main.WIDTH, Main.HEIGHT);
		p_search.setLayout(null);
		JLabel gname=new JLabel("����ã��");
		gname.setBounds(250,50, 100, 100);
		p_search.add(gname);
		add(p_search);
		p_search.setVisible(false);
	}
	
	/* ��ư�̺�Ʈ*/
	protected void h3btn(){
		/*���� ����*/
		b_explain.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				p_explain(); 
				p_mainpage.setVisible(false);
				p_explain.setVisible(true);
				p_play.setVisible(false);
				p_search.setVisible(false);
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//��ư�� ������ ���� 
				p_explain.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);

			} 
		});

		/*���Ӹ����*/
		b_makegame.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				mkgame();
				p_mainpage.setVisible(false);
				p_explain.setVisible(false);
				p_play.setVisible(true);
				p_search.setVisible(false);
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//��ư�� ������ ���� 
				p_play.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);
				/*���ӽ���*/
				ingame.startgame();
				ingame.b_draw.setIcon(draw);
				/*
				ingame.p1cardb01.setIcon(w_one);
				*/
			} 
		});

		/*����ã��*/
		b_search.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				fdgame(); 
				p_mainpage.setVisible(false);
				p_play.setVisible(false);
				p_explain.setVisible(false);
				p_search.setVisible(true);		
				b_goHome.setBounds(1200,0, 78, 64);
				b_goHome.setIcon(homebutton1);//��ư�� ������ ���� 
				p_search.add(b_goHome);
				b_goHome.setBorderPainted(false);
				b_goHome.setContentAreaFilled(false);
				b_goHome.setFocusPainted(false);
			} 
		});
		/*Ȩ��ư*/
		b_goHome.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 ��������
				b_goHome.setIcon(homebutton2);//��ư�� ������ ���� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 ��������
				b_goHome.setIcon(homebutton1);//��ư�� ������ ���� 
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
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
		/*draw �̹���*/
		ingame.b_draw.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
				ingame.b_draw.setIcon(draw2);
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
				ingame.b_draw.setIcon(draw);
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 				
				ingame.b_draw.setIcon(draw2);
				if(ingame.player == 1) {
					/*player1 ī�� �̱�*/
					ingame.carddraw(ingame.p1number, ingame.player);
					ingame.player = 2;
				}else {
					/*player2 ī�� �̱�*/
					ingame.carddraw(ingame.p2number, ingame.player);
					ingame.player = 1;	
				}
			} 
		});
	}
}
