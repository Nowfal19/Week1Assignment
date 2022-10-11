package week.day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int Orginalnum = 153;
		int temporarynum = Orginalnum;
		int sum = 0;
		System.out.println("The Number you provided is: " + Orginalnum);
		while (temporarynum > 0) {
			int remainder = temporarynum % 10;
			sum = sum + (remainder * remainder * remainder);
			temporarynum = temporarynum / 10;
		}
		if (temporarynum == Orginalnum) {
			System.out.println("The given number is Amstrong "+temporarynum);
		} else {
			System.out.println("This not a Amstrong Number "+temporarynum);
		}
	}
}
