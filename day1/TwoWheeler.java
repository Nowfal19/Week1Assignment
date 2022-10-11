package week.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 8977654467L;
	boolean isPunctured = false;
	String bikeName = "KTM";
	double runningKM = 15476.99;

	public static void main(String[] args) {

		TwoWheeler obj = new TwoWheeler();
		String result1 = obj.bikeName;
		double result2 = obj.runningKM;
		boolean result3 = obj.isPunctured;
		long result4 = obj.chassisNumber;
		short result5 = obj.noOfMirrors;
		int result6 = obj.noOfWheels;

		System.out.println("Number of wheels in bike: " + result6);
		System.out.println("Number of Mirrors in bike: " + result5);
		System.out.println("Bike ChassisNumber: " + result4);
		System.out.println("Is bike punctured: " + result3);
		System.out.println("Running Km: " + result2);
		System.out.println("Brand of Bike: " + result1);
	}
}
