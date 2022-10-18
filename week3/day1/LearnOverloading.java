package week3.day1;

public class LearnOverloading {

	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	public float add(float a,float b) {
		return (a+b);
	}
	public float add(float a) {
		return a;
	}
	public static void main(String[] args) {
		LearnOverloading obj = new LearnOverloading();
		System.out.println(obj.add(6,6));
		System.out.println(obj.add(6,6,8));
		System.out.println(obj.add(6.6f,6.7f));
		System.out.println(obj.add(6.6f));
		}
	
}
