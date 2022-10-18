package week3.day2;

public class Students {

public void getStudentsInfo(String rollNumber) {
	System.out.println("The Name of rollNumber");
}
public void getStudentsInfo(String Id, String Name) {
	System.out.println("The Id and Name of the Student");
}
public void getStudentsInfo2(String Email) {
	System.out.println("The Email of the Student");
}
public void getStudentsInfo1(String phoneNumber) {
	System.out.println("The phoneNumber of the Student");
}
public static void main(String[] args) {
	Students obj = new Students();
	obj.getStudentsInfo(null);
	obj.getStudentsInfo(null, null);
	obj.getStudentsInfo1(null);
	obj.getStudentsInfo2(null);
}
}
