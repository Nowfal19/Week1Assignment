package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Listinteger {
	public static void main(String[] args) {

		List<Integer> List = new ArrayList<Integer>();
		List.add(23);
		List.add(54);
		List.add(67);
		List.add(55);
		List.add(66);
		List.add(42);
		List.add(27);
		System.out.println("The given list: " + List);
		Collections.sort(List);
		System.out.println("The given list is sorted: " + List);
		System.out.println("These are the Odd Numbers:");
		for (int i = 0; i < List.size(); i++) {
			int number = List.get(i);

			if (number % 2 != 0) {
				System.out.println(number);
			}
		}

		List<String> List1 = new ArrayList<String>();
		List1.add("Arun");
		List1.add("Deepa");
		List1.add("Maria");
		List1.add("Magesh");
		List1.add("sharmila");
		List1.add("Arun");
		System.out.println("*********************************************************************");
		System.out.println("");
		System.out.println("The given names are: " + List1);
		Collections.sort(List1);
		System.out.println("The given list is sorted: " + List1);
		for (String Givenname : List1) {
			if (Givenname.startsWith("M")) {
				System.out.println(Givenname);
				
			}
		}
	}
}
