package package2;

import packages1.A; //다른 패키지에 있는 클래스를 상속받기 위해서 선언해주는 것

class C extends A{
	
	public void printMembers() {
		System.out.println(pub);
		System.out.println(pro);
//		System.out.println(def); //같은 패키지가 아니라서 에러
//		System.out.println(pri); //같은 클래스가 아니라서 에러
	}
	
}
