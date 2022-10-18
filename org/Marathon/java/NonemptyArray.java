package org.Marathon.java;

public class NonemptyArray {
	
	public int numUnique(int[] num) {
		int Result = 0;
		
		for (int i: num) {
			Result ^=i;
		}
		return Result;
		
		
		
	}

	public static void main(String[] args) {
		NonemptyArray obj = new NonemptyArray();
		System.out.println(obj.numUnique(new int[] {2,4,5,4,2}));
		System.out.println(obj.numUnique(new int[] {2,4,4,2}));
		System.out.println(obj.numUnique(new int[] {2}));
	}

}
