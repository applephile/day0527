package packages1;

public class A {
	
	//필드
	public int pub; //제한 없음
	protected int pro; //같은 패키지 + 다른 패키지 자손까지 접근 가능
	int def; //같은 패키지 내
	private int pri; //같은 클래스 내
	
	public void printMembers() {
		//전부 실행 가능
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
	
	
}
