package davinci01;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BtnmouseE {

	private int mouseX, mouseY; //x�� y�� ��ġ�� ����
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
	
	/*��ư1*/
	
	private void b_joker() {
		Ingame.b_joker.addMouseListener(new MouseAdapter() { //���콺 �̺�Ʈ
			@Override
			public void mouseEntered(MouseEvent e) { // ��ư�� ��������				
				Ingame.b_joker.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//���콺�� ��ư���� �������� 				
				Ingame.b_joker.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//Ŀ������
			@Override
			public void mousePressed(MouseEvent e) {//���콺 ��������
				 if(e.getButton() == MouseEvent.BUTTON3){    // ������ ���콺 Ŭ��
					 Ingame.b_joker.setForeground(Color.black);
				 }
				 mouseX = e.getX(); //x��ǥ�� �޾� mousex�� �ִ´�.
				 mouseY = e.getY();
			}
		});
		Ingame.b_joker.addMouseMotionListener(new MouseMotionAdapter(){//���콺 �̺�Ʈ
			@Override
			public void mouseDragged(MouseEvent e) {//���콺�� �巡��������
				int x = e.getXOnScreen() - 380;//��ũ�� x��ǥ
				int y = e.getYOnScreen() - 250;//��ũ�� y��ǥ
			
				Ingame.b_joker.setLocation(x, y);
				System.out.println(x + " " + y);
				
				if((0 < x && x < 80) && (500 < y && y < 620)) {
					System.out.println("�ֲ����");
					if( "wj" == Ingame.list1[Ingame.cardnumber-1]) {
						Ingame.wj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("�� ������� white");
					}
					else if( "bj" == Ingame.list1[Ingame.cardnumber-1]) {
						Ingame.bj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("�� ������� qmffor");
					}
					else if( "wj" == Ingame.list2[Ingame.cardnumber-1]) {
						Ingame.wj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("�� ������� white");
					}
					else if( "bj" == Ingame.list2[Ingame.cardnumber-1]) {
						Ingame.bj_position = 1;
						Ingame.b_joker.setVisible(false);
						System.out.println("�� ������� qmffor");
					}else {
						System.out.println("���� X");
					}
				}
				
				
			}
		}); //��ġ ���
				
				
	}
	/*
	private void btn2() {
		Ingame.btn2.addMouseListener(new MouseAdapter() { //���콺 �̺�Ʈ
			@Override
			public void mouseEntered(MouseEvent e) { // ��ư�� ��������				
				Ingame.btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//���콺�� ��ư���� �������� 				
				Ingame.btn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//Ŀ������
			@Override
			public void mousePressed(MouseEvent e) {//���콺 ��������
				if(e.getButton() == MouseEvent.BUTTON3){    // ������ ���콺 Ŭ��
					Ingame.b_joker.setForeground(Color.black);
				 }
				mouseX = e.getX(); //x��ǥ�� �޾� mousex�� �ִ´�.
				mouseY = e.getY();
			}
		});
		Ingame.btn2.addMouseMotionListener(new MouseMotionAdapter(){//���콺 �̺�Ʈ
			@Override
			public void mouseDragged(MouseEvent e) {//���콺�� �巡��������
				int x = e.getXOnScreen();//��ũ�� x��ǥ
				int y = e.getYOnScreen();//��ũ�� y��ǥ
				Ingame.btn2.setLocation(x - mouseX, y - mouseY);}}); //��ġ ���
	}
	private void btn3() {
		Ingame.btn3.addMouseListener(new MouseAdapter() { //���콺 �̺�Ʈ
			@Override
			public void mouseEntered(MouseEvent e) { // ��ư�� ��������				
				Ingame.btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {//���콺�� ��ư���� �������� 				
				Ingame.btn3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));}//Ŀ������
			@Override
			public void mousePressed(MouseEvent e) {//���콺 ��������
				if(e.getButton() == MouseEvent.BUTTON3){    // ������ ���콺 Ŭ��
					 Ingame.b_joker.setForeground(Color.black);
				 }
				mouseX = e.getX(); //x��ǥ�� �޾� mousex�� �ִ´�.
				mouseY = e.getY();
			}
		});
		Ingame.btn3.addMouseMotionListener(new MouseMotionAdapter(){//���콺 �̺�Ʈ
			@Override
			public void mouseDragged(MouseEvent e) {//���콺�� �巡��������
				int x = e.getXOnScreen();//��ũ�� x��ǥ
				int y = e.getYOnScreen();//��ũ�� y��ǥ
				Ingame.btn3.setLocation(x - mouseX, y - mouseY);}}); //��ġ ���
	}

*/
}


