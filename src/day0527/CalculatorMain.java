package day0527;

class Calculator{
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("resulst1 : " + result1);
		System.out.println("resulst2 : " + result2);
		System.out.println("resulst3 : " + result3);
		
	}

}
