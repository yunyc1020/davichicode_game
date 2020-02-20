package davinci01;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BtnmouseE {

	private int mouseX, mouseY; //x랑 y의 위치를 저장
	private int colornumber1=0;
	private int colornumber2=0;
	private int colornumber3=0;
	protected BtnmouseE(){
		b_joker();
		/*
		btn2();
		btn3();
		*/
	}
	
	/*버튼1*/
	
	private void b_joker() {
		Ingame.b_joker.addMouseListener(new MouseAdapter() { //마우스 이벤트
			@Override
			public void mouseEntered(MouseEvent e) { // 버튼에 들어왔을때				
				Ingame.b_joker.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 버튼에서 나갔을때 				
				Ingame.b_joker.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//커서설정
			@Override
			public void mousePressed(MouseEvent e) {//마우스 눌렀을때
				 if(e.getButton() == MouseEvent.BUTTON3){    // 오른쪽 마우스 클릭
					 Ingame.b_joker.setForeground(Color.black);
				 }
				 mouseX = e.getX(); //x좌표를 받아 mousex에 넣는다.
				 mouseY = e.getY();
			}
		});
		Ingame.b_joker.addMouseMotionListener(new MouseMotionAdapter(){//마우스 이벤트
			@Override
			public void mouseDragged(MouseEvent e) {//마우스로 드래그했을때
				int x = e.getXOnScreen() - 380;//스크린 x좌표
				int y = e.getYOnScreen() - 250;//스크린 y좌표
			
				Ingame.b_joker.setLocation(x, y);
				System.out.println(x + " " + y);
				
				if((0 < x && x < 80) && (500 < y && y < 620)) {
					System.out.println("멀꼬라바");
					if( "wj" == Ingame.list1[Ingame.cardnumber-1]) {
						Ingame.wj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("나 사라졌엉 white");
					}
					else if( "bj" == Ingame.list1[Ingame.cardnumber-1]) {
						Ingame.bj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("나 사라졌엉 qmffor");
					}
					else if( "wj" == Ingame.list2[Ingame.cardnumber-1]) {
						Ingame.wj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("나 사라졌엉 white");
					}
					else if( "bj" == Ingame.list2[Ingame.cardnumber-1]) {
						Ingame.bj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("나 사라졌엉 qmffor");
					}else {
						System.out.println("적용 X");
					}
				}
				
				
			}
		}); //위치 계산
				
				
	}
	/*
	private void btn2() {
		Ingame.btn2.addMouseListener(new MouseAdapter() { //마우스 이벤트
			@Override
			public void mouseEntered(MouseEvent e) { // 버튼에 들어왔을때				
				Ingame.btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 버튼에서 나갔을때 				
				Ingame.btn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//커서설정
			@Override
			public void mousePressed(MouseEvent e) {//마우스 눌렀을때
				if(e.getButton() == MouseEvent.BUTTON3){    // 오른쪽 마우스 클릭
					Ingame.b_joker.setForeground(Color.black);
				 }
				mouseX = e.getX(); //x좌표를 받아 mousex에 넣는다.
				mouseY = e.getY();
			}
		});
		Ingame.btn2.addMouseMotionListener(new MouseMotionAdapter(){//마우스 이벤트
			@Override
			public void mouseDragged(MouseEvent e) {//마우스로 드래그했을때
				int x = e.getXOnScreen();//스크린 x좌표
				int y = e.getYOnScreen();//스크린 y좌표
				Ingame.btn2.setLocation(x - mouseX, y - mouseY);}}); //위치 계산
	}
	private void btn3() {
		Ingame.btn3.addMouseListener(new MouseAdapter() { //마우스 이벤트
			@Override
			public void mouseEntered(MouseEvent e) { // 버튼에 들어왔을때				
				Ingame.btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//마우스가 버튼에서 나갔을때 				
				Ingame.btn3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//커서설정
			@Override
			public void mousePressed(MouseEvent e) {//마우스 눌렀을때
				if(e.getButton() == MouseEvent.BUTTON3){    // 오른쪽 마우스 클릭
					 Ingame.b_joker.setForeground(Color.black);
				 }
				mouseX = e.getX(); //x좌표를 받아 mousex에 넣는다.
				mouseY = e.getY();
			}
		});
		Ingame.btn3.addMouseMotionListener(new MouseMotionAdapter(){//마우스 이벤트
			@Override
			public void mouseDragged(MouseEvent e) {//마우스로 드래그했을때
				int x = e.getXOnScreen();//스크린 x좌표
				int y = e.getYOnScreen();//스크린 y좌표
				Ingame.btn3.setLocation(x - mouseX, y - mouseY);}}); //위치 계산
	}

*/
}


