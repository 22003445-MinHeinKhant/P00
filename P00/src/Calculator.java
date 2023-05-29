
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}	
		return a / b;
	}
	
	public int exp(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result = result * a;
		}
		return result;
	}
	
}
