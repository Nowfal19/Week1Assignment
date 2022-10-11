package week.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		// To find length of the array
		int size = data.length;
		// To sort the array from small to big
		Arrays.sort(data);
		System.out.println("Size of an Array ::" + size);
		System.out.println("sorted Array : " + Arrays.toString(data));
		int secondLargestNum = data[size - 2];
		System.out.println("2nd largest number is : " + secondLargestNum);
		System.out.println("Smallest number is : " + data[0]);
	}

}
