package davinci01;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Btnevent extends Thread { //프로그램 안에 있는 작은 프로그램
	public Btnevent() {
		//mgps();
	}
	@Override
	public void run( ) {
		try {
			///System.out.println("아아");
			mgps();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	
	}
	public void mgps() {
		Ingame.p1cardb1.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
		@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				System.out.println(e.getX()+" "+e.getY());//x좌표,y좌표 출력 
			}
		});
		/*Ingame.p1cardb1.addMouseMotionListener(new MouseAdapter() { // 마우스 이벤트  
			@Override
			public void mouseMoved(MouseEvent e) { // 마우스 움직일때.  
				System.out.println(e.getX()+" "+e.getY());//x좌표,y좌표 출력 
	}}); */
		
	} 
	
		
		
	

	

}
