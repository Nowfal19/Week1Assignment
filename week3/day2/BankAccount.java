package week3.day2;

public class BankAccount {
	public static void main(String[] args) {
		Hdfc b1 = new Hdfc();
		System.out.println("HDFC Bank");
		b1.creditcard("Visa");
		b1.minimumBalance(10000);
		b1.debitCard("Visa");
		
		RBI r1 = new Hdfc();
		r1.minimumBalance(5000);
		r1.debitCard("Rupay");
	}
	

}
