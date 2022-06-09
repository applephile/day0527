package day0527;

public class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		
		System.out.println("자동차가 생성되었습니다.");
	}
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량 번호 : " + num + " 연료량 : " + gas + "로 설정");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량 번호 : " + num + "연료량 : " + gas + "로 변경");
	}
	
	public void show() {
		System.out.println("차량 번호 : " + num + "연료량 : " + gas);
	}
	
}
