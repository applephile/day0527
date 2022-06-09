package day0527;

public class Phone {
	String name;
	String spec;
	int cost;
	
	Phone(){}
	Phone(String name, String spec, int cost){
		this.name = name;
		this.spec = spec;
		this.cost = cost;
	}
	
	public void phoneInfo() { 
		System.out.printf("모델명 : %s\n스펙 : %s\n가격 : %d\n", this.name, this.spec, this.cost);
	}

}
