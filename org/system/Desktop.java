package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("The Desktop size is 16 inch");
	}
	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.computerModel();
		
		Desktop obj2 = new Desktop();
		obj2.desktopSize();
	}
}
