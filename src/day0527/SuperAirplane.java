package day0527;

import java.awt.dnd.peer.DragSourceContextPeer;

class Airplane{
	public void takeOff() {
		System.out.println("이륙");
	}
	public void fly() {
		System.out.println("일반 비행");
	}
	public void land() {
		System.out.println("착륙");
	}
}

class Supersonic extends Airplane {
	public static final int NORMAL = 1;
	
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초고속 비행");
		} else {
			super.fly();
		}
	}
	
}

public class SuperAirplane {
	
	public static void main(String[] args) {
		
		//이륙
		//일반 비행
		//초고속 비행
		//일반 비행
		//착륙
		
		Supersonic s = new Supersonic();
		
		s.takeOff();
		s.fly();
		s.flyMode = Supersonic.SUPERSONIC;
		s.fly();
		s.flyMode = 1;
		s.fly();
		s.land();
		
		
	}
	
}
