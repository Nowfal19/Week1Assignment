package week3.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Your deposit is: Rs.3,79,088");
		//super.deposit();
		//this.deposit();
	}
	public static void main(String[] args) {
//		AxisBank obj = new AxisBank();
//		obj.deposit();
		
		BankInfo obj1 = new BankInfo();
	    obj1.deposit();
	}
}
