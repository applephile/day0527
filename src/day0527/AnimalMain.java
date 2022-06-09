package day0527;

class Animal {
	
	//동물의 수 출력
	String name;
	String color;
	int age;
	
	static int count = 0;
	//인스턴스 변수로 int count = 0; 이라고 선언을 하면 클래스가 선언이 될 때마다 변수들을 새로 불러오는 것이기 때문에 계속 0으로 초기화가 된다
	
	Animal(){}
	Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
		
		++count;
	}
	
	public void animalInfo() {
		System.out.println("동물의 수 : " + count);
	}
	
}

public class AnimalMain {

	public static void main(String[] args) {
		//동물이름, 색깔, 나이
		Animal a1 = new Animal("스누피", "갈색", 14);
		a1.animalInfo();
		Animal a2 = new Animal("왕사탕", "흰색", 10);
		a2.animalInfo();

	}

}
