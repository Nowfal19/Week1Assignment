package week.day1;

public class Mycar {
	protected int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	 float mul(float a, float b) {
		float mul = a * b;
		return mul;
	}

	public int div(int a, int b) {
		int div = a / b;
		return div;
	}
	public static void main(String[] args) {
		Cars obj = new Cars();
		int sum = obj.sum(1,2,5);
		System.out.println("Add Numbers: " + sum);
		int sub = obj.sub(1,2);
		System.out.println("Sub Numbers: " + sub);
		float mul = obj.mul(1.5f,2.3f);
		System.out.println("Mul Numbers: " + mul);
		int div = obj.div(1,2);
		System.out.println("Sub Numbers: " + div);
		
		
	}
}

