package davinci01;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Btnevent extends Thread { //���α׷� �ȿ� �ִ� ���� ���α׷�
	public Btnevent() {
		//mgps();
	}
	@Override
	public void run( ) {
		try {
			///System.out.println("�ƾ�");
			mgps();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	
	}
	public void mgps() {
		Ingame.p1cardb1.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
		@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				System.out.println(e.getX()+" "+e.getY());//x��ǥ,y��ǥ ��� 
			}
		});
		/*Ingame.p1cardb1.addMouseMotionListener(new MouseAdapter() { // ���콺 �̺�Ʈ  
			@Override
			public void mouseMoved(MouseEvent e) { // ���콺 �����϶�.  
				System.out.println(e.getX()+" "+e.getY());//x��ǥ,y��ǥ ��� 
	}}); */
		
	} 
	
		
		
	

	

}
