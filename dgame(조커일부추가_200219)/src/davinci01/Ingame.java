package davinci01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;

public class Ingame {
	Settile s=new Settile();
	/*버튼 선언 p1은 상대방, p2는 나 자신*/
	static JButton p1cardb1=new JButton("p1");
	static JButton p1cardb2=new JButton("p1");
	static JButton p1cardb3=new JButton("p1");
	static JButton p1cardb4=new JButton("p1");
	static JButton p1cardb5=new JButton("p1");
	static JButton p1cardb6=new JButton("p1");
	static JButton p1cardb7=new JButton("p1");
	static JButton p1cardb8=new JButton("p1");
	static JButton p1cardb9=new JButton("p1");
	static JButton p1cardb10=new JButton("p1");
	static JButton p1cardb11=new JButton("p1");
	static JButton p1cardb12=new JButton("p1");
	static JButton p1cardb13=new JButton("p1");
	
	static JButton p2cardb1=new JButton("p2");
	static JButton p2cardb2=new JButton("p2");
	static JButton p2cardb3=new JButton("p2");
	static JButton p2cardb4=new JButton("p2");
	static JButton p2cardb5=new JButton("p2");
	static JButton p2cardb6=new JButton("p2");
	static JButton p2cardb7=new JButton("p2");
	static JButton p2cardb8=new JButton("p2");
	static JButton p2cardb9=new JButton("p2");
	static JButton p2cardb10=new JButton("p2");
	static JButton p2cardb11=new JButton("p2");
	static JButton p2cardb12=new JButton("p2");
	static JButton p2cardb13=new JButton("p2");
	
	static JButton b_draw=new JButton();
	static JButton b_joker=new JButton();
	static int bj_position = 0;
	static int wj_position = 0;
	int number=26;
	int black=12;
	int white=12;
	int joker=2;
	/*뽑은 카드는 인덱스가 1, 뽑지 않은 카드는 인덱스가 0*/
	/*오름차순을 위해 aw는 숫자 10w를 bw는 숫자 11w를 의미*/
	static String[][] card= {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", 
		"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",},{"0w", "1w",
			"2w", "3w", "4w", "5w", "6w", "7w", "8w", "9w", "aw", "bw", "wj", "0b", "1b",
			"2b", "3b", "4b", "5b", "6b", "7b", "8b", "9b", "ab", "bb", "bj"}};
	int player=0; // player=1은 상대방, player=2 나 자신을 의미
	static int p1number=0; // 상대방 카드 개수
	static int p2number=0; // 내 카드 개수
	/*
	static String[] list1=new String[13];
	static String[] list2=new String[13];
	*/
	static String[] list1 = {"z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z"};
	static String[] list2 = {"z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z"};
	boolean re=false;
	static int cardnumber;
	
	/*게임 시작*/
	protected void startgame() {
		Btnevent t = new Btnevent();
		new BtnmouseE();
		t.run();
//		t.start();
		/*모든 버튼을 생성 - 각 플레이어 마다 최대 13개*/
		p1cardb1.setBounds(0,0, 80, 120);
		p1cardb2.setBounds(90,0, 80, 120);
		p1cardb3.setBounds(180,0, 80, 120);
		p1cardb4.setBounds(270,0, 80, 120);
		p1cardb5.setBounds(360,0, 80, 120);
		p1cardb6.setBounds(450,0, 80, 120);
		p1cardb7.setBounds(540,0, 80, 120);
		p1cardb8.setBounds(630,0, 80, 120);
		p1cardb9.setBounds(720,0, 80, 120);
		p1cardb10.setBounds(810,0, 80, 120);
		p1cardb11.setBounds(900,0, 80, 120);
		p1cardb12.setBounds(990,0, 80, 120);
		p1cardb13.setBounds(1080,0, 80, 120);
		
		GHome.p_play.add(p1cardb1);
		GHome.p_play.add(p1cardb2);
		GHome.p_play.add(p1cardb3);
		GHome.p_play.add(p1cardb4);
		
		p2cardb1.setBounds(0,500, 80, 120);
		p2cardb2.setBounds(90,500, 80, 120);
		p2cardb3.setBounds(180,500, 80, 120);
		p2cardb4.setBounds(270,500, 80, 120);
		p2cardb5.setBounds(360,500, 80, 120);
		p2cardb6.setBounds(450,500, 80, 120);
		p2cardb7.setBounds(540,500, 80, 120);
		p2cardb8.setBounds(630,500, 80, 120);
		p2cardb9.setBounds(720,500, 80, 120);
		p2cardb10.setBounds(810,500, 80, 120);
		p2cardb11.setBounds(900,500, 80, 120);
		p2cardb12.setBounds(990,500, 80, 120);
		p2cardb13.setBounds(1080,500, 80, 120);
		
		b_joker.setBounds(540,250,80,120);
		GHome.p_play.add(b_joker);
		b_joker.setVisible(false);
		GHome.p_play.add(p2cardb1);
		GHome.p_play.add(p2cardb2);
		GHome.p_play.add(p2cardb3);
		GHome.p_play.add(p2cardb4);
		
		
		/*처음 4장을 뽑음.*/
		for(p1number = 0; p1number<4;) {
			player=1;
			startcarddraw(p1number, player);
		}
		
		for(p2number = 0;p2number<4;) {
			player=2;
			startcarddraw(p2number, player);
		}
		/*처음 뽑은 카드 정렬, 조커가 없으므로 그냥 정렬한다.*/
		
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		/*뽑은 카드 텍스트 출력*/
		p1cardb1.setText(list1[0]);
		p1cardb2.setText(list1[1]);	
		p1cardb3.setText(list1[2]);	
		p1cardb4.setText(list1[3]);
		s.setcolortile("p1cardb1",list1[0]);
		s.setcolortile("p1cardb2",list1[1]);
		s.setcolortile("p1cardb3",list1[2]);	
		s.setcolortile("p1cardb4",list1[3]);	
		p2cardb1.setText(list2[0]);
		p2cardb2.setText(list2[1]);
		p2cardb3.setText(list2[2]);
		p2cardb4.setText(list2[3]);
		s.setcolortile("p2cardb1",list2[0]);
		s.setcolortile("p2cardb2",list2[1]);
		s.setcolortile("p2cardb3",list2[2]);
		s.setcolortile("p2cardb4",list2[3]);
		
		
			
		
		
		/*draw이미지 출력*/
		b_draw.setBounds(900, 200, 200,200);
		GHome.p_play.add(b_draw);
		b_draw.setBorderPainted(false);
		b_draw.setContentAreaFilled(false);
		b_draw.setFocusPainted(false);
		
		/*시작 할 때 순서 정하기*/
		Random random2 = new Random();
		int order = random2.nextInt(2);
		player = order + 1;
		
		/*카드 뽑기 기능은 GHome draw 이미지 누르는 것으로 구현*/
		if(player == 1) {
			/*player1 자기 차례 실행*/
			
		}
		else {
			/*player2 자기 차례 실행*/
						
		}
		
//		player=1;
//		while(true) {
//			if(player==1) {
//				yesorno(player);
//			}
//			else if(player==2) {
//				yesorno(player);
//			}
//		}
		
	}
	/*시작 할때의 카드 드로우 - 조커는 제외*/
	void startcarddraw(int i,int j) {
		Random random=new Random();
		int cardnum=random.nextInt(26);
		if(card[0][cardnum]=="0" && card[1][cardnum] != "wj" && card[1][cardnum] != "bj") {
			//System.out.println(same[i]);
			if(j==1) {
				list1[i]=card[1][cardnum];
				card[0][cardnum] = "1";
				System.out.println("/*player1*/\n"+list1[i]);
				++p1number;			
			}
			if(j==2) {
				list2[i]=card[1][cardnum];
				card[0][cardnum] = "1";
				System.out.println("/*player2*/\n"+list2[i]);
				++p2number;
			}
		}		
	}
	
	/*일반적인 카드 드로우 - 조커 포함, 한장만 뽑게*/
	void carddraw(int i,int j) {
		Random random=new Random();
		int cardnum=random.nextInt(26);
		
		/*중복된 카드가 안나오도록 while문을 통하여 1 즉, 이미 출력된 카드가 나오면 다시 뽑는다.*/
		while(card[0][cardnum]=="1" && p1number + p2number < 26) {
			cardnum=random.nextInt(26);
		}
		
		if(card[0][cardnum]=="0" && p1number < 14 && p2number < 14) {
			//System.out.println(same[i]);
			if(j==1) {
				list1[i]=card[1][cardnum];
				card[0][cardnum] = "1";
				System.out.println("/*player1*/\n"+list1[i]);
				Arrays.sort(list1);
				++p1number;
				if(p1number == 5) {
					if( "wj"== card[1][cardnum] || "bj" == card[1][cardnum]) {
						cardnumber = p1number;
						b_joker.setVisible(true);
						/*
						if("wj" == card[1][cardnum]) {
							for(int k = 1; k <= p1number; k++) {
								
							}
						}else if("bj" == card[1][cardnum]) {
							for(int k = 1; k <= p1number; k++) {
								
							}
						}
						*/
					}
					GHome.p_play.add(p1cardb5);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					
					/*
					while(true) {
						try {
							System.out.println("hah");
							Thread.sleep(5000);
						} catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					*/
				}
				if(p1number == 6) {
					GHome.p_play.add(p1cardb6);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
				}
				if(p1number == 7) {
					GHome.p_play.add(p1cardb7);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
				}
				if(p1number == 8) {
					GHome.p_play.add(p1cardb8);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
				}
				if(p1number == 9) {
					GHome.p_play.add(p1cardb9);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					p1cardb9.setText(list1[8]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
					s.setcolortile("p1cardb9",list1[8]);
				}
				if(p1number == 10) {
					GHome.p_play.add(p1cardb10);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					p1cardb9.setText(list1[8]);
					p1cardb10.setText(list1[9]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
					s.setcolortile("p1cardb9",list1[8]);
					s.setcolortile("p1cardb10",list1[9]);
				}
				if(p1number == 11) {
					GHome.p_play.add(p1cardb11);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					p1cardb9.setText(list1[8]);
					p1cardb10.setText(list1[9]);
					p1cardb11.setText(list1[10]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
					s.setcolortile("p1cardb9",list1[8]);
					s.setcolortile("p1cardb10",list1[9]);
					s.setcolortile("p1cardb11",list1[10]);
				}
				if(p1number == 12) {
					GHome.p_play.add(p1cardb12);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					p1cardb9.setText(list1[8]);
					p1cardb10.setText(list1[9]);
					p1cardb11.setText(list1[10]);
					p1cardb12.setText(list1[11]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
					s.setcolortile("p1cardb9",list1[8]);
					s.setcolortile("p1cardb10",list1[9]);
					s.setcolortile("p1cardb11",list1[10]);
					s.setcolortile("p1cardb12",list1[11]);
				}
				if(p1number == 13) {
					GHome.p_play.add(p1cardb13);
					p1cardb1.setText(list1[0]);	
					p1cardb2.setText(list1[1]);	
					p1cardb3.setText(list1[2]);	
					p1cardb4.setText(list1[3]);
					p1cardb5.setText(list1[4]);
					p1cardb6.setText(list1[5]);
					p1cardb7.setText(list1[6]);
					p1cardb8.setText(list1[7]);
					p1cardb9.setText(list1[8]);
					p1cardb10.setText(list1[9]);
					p1cardb11.setText(list1[10]);
					p1cardb12.setText(list1[11]);
					p1cardb13.setText(list1[12]);
					s.setcolortile("p1cardb1",list1[0]);
					s.setcolortile("p1cardb2",list1[1]);
					s.setcolortile("p1cardb3",list1[2]);
					s.setcolortile("p1cardb4",list1[3]);
					s.setcolortile("p1cardb5",list1[4]);
					s.setcolortile("p1cardb6",list1[5]);
					s.setcolortile("p1cardb7",list1[6]);
					s.setcolortile("p1cardb8",list1[7]);
					s.setcolortile("p1cardb9",list1[8]);
					s.setcolortile("p1cardb10",list1[9]);
					s.setcolortile("p1cardb11",list1[10]);
					s.setcolortile("p1cardb12",list1[11]);
					s.setcolortile("p1cardb13",list1[12]);
				}
				
			}
			if(j==2) {
				list2[i]=card[1][cardnum];
				card[0][cardnum] = "1";
				System.out.println("/*player2*/\n"+list2[i]);
				Arrays.sort(list2);
				++p2number;
				if(p2number == 5) {
					if( "wj"== card[1][cardnum] || "bj" == card[1][cardnum]) {
						b_joker.setVisible(true);
						cardnumber = p2number;
						//GHome.p_play.add(p1cardb5);
						/*
						if("wj" == card[1][cardnum]) {
							for(int k = 1; k <= p1number; k++) {
								
							}
						}else if("bj" == card[1][cardnum]) {
							for(int k = 1; k <= p1number; k++) {
								
							}
						}
						*/
					}
					GHome.p_play.add(p2cardb5);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
				}
				if(p2number == 6) {
					GHome.p_play.add(p2cardb6);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
				}
				if(p2number == 7) {
					GHome.p_play.add(p2cardb7);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
				}
				if(p2number == 8) {
					GHome.p_play.add(p2cardb8);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
				}
				if(p2number == 9) {
					GHome.p_play.add(p2cardb9);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					p2cardb9.setText(list2[8]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
					s.setcolortile("p2cardb9",list2[8]);
				}
				if(p2number == 10) {
					GHome.p_play.add(p2cardb10);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					p2cardb9.setText(list2[8]);
					p2cardb10.setText(list2[9]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
					s.setcolortile("p2cardb9",list2[8]);
					s.setcolortile("p2cardb10",list2[9]);
				}
				if(p2number == 11) {
					GHome.p_play.add(p2cardb11);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					p2cardb9.setText(list2[8]);
					p2cardb10.setText(list2[9]);
					p2cardb11.setText(list2[10]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
					s.setcolortile("p2cardb9",list2[8]);
					s.setcolortile("p2cardb10",list2[9]);
					s.setcolortile("p2cardb11",list2[10]);
				}
				if(p2number == 12) {
					GHome.p_play.add(p2cardb12);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					p2cardb9.setText(list2[8]);
					p2cardb10.setText(list2[9]);
					p2cardb11.setText(list2[10]);
					p2cardb12.setText(list2[11]);
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
					s.setcolortile("p2cardb9",list2[8]);
					s.setcolortile("p2cardb10",list2[9]);
					s.setcolortile("p2cardb11",list2[10]);
					s.setcolortile("p2cardb12",list2[11]);
				}
				if(p2number == 13) {
					GHome.p_play.add(p2cardb13);
					p2cardb1.setText(list2[0]);
					p2cardb2.setText(list2[1]);
					p2cardb3.setText(list2[2]);
					p2cardb4.setText(list2[3]);
					p2cardb5.setText(list2[4]);
					p2cardb6.setText(list2[5]);
					p2cardb7.setText(list2[6]);
					p2cardb8.setText(list2[7]);
					p2cardb9.setText(list2[8]);
					p2cardb10.setText(list2[9]);
					p2cardb11.setText(list2[10]);
					p2cardb12.setText(list2[11]);
					p2cardb13.setText(list2[12]);	
					s.setcolortile("p2cardb1",list2[0]);
					s.setcolortile("p2cardb2",list2[1]);
					s.setcolortile("p2cardb3",list2[2]);
					s.setcolortile("p2cardb4",list2[3]);
					s.setcolortile("p2cardb5",list2[4]);
					s.setcolortile("p2cardb6",list2[5]);
					s.setcolortile("p2cardb7",list2[6]);
					s.setcolortile("p2cardb8",list2[7]);
					s.setcolortile("p2cardb9",list2[8]);
					s.setcolortile("p2cardb10",list2[9]);
					s.setcolortile("p2cardb11",list2[10]);
					s.setcolortile("p2cardb12",list2[11]);
					s.setcolortile("p2cardb13",list2[12]);
					
				}
			}
		}
		else if(p1number == 14) {
			/*상대방이 카드를 모두 뽑았을 때 더이상 못 뽑는다고 알려줄 팝업 창*/
			
		}else if(p2number == 14) {
			/*내가 카드를 모두 뽑았을 때 더이상 못 뽑는다고 알려줄 팝업 창*/
			
		}		
	}
}
