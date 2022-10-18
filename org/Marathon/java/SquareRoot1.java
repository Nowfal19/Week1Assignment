package org.Marathon.java;

public class SquareRoot1 {
	     
		 public static int square(int number){
		    int t;
		  
		    int squareroot = number / 2;    
		  
		    do {
		        t = squareroot;    
		        squareroot = (t + (number / t)) / 2;  
		    } while ((t - squareroot) != 0);
		  
		    return squareroot;
		}
		 
		public static void main(String[] args)
		{
		    int number = 25;
		    int root;
		    root = square((int) number);
		    System.out.println("Number : "+number);
		    System.out.println("Square Root : "+root);
		}
		}
	
	
	
	// method to find the squareroot
	
//	public int findSquareroot() {
//
//		// intialize value square
//		int square = 0;
//		int number = 4;
//		// loop for half of input number starting from 1
//		for (int i = 1; i <= number / 2; i++) {
//
//			// get the quotient of the number by iteration
//			square = number / i;
//
//			// Check both iterated value and quotient are equal
//			if (i == square) {
//				System.out.println("The square root of a number is ");
//				break;
//			}
//		}
//		return square;
//	}
//
//	public static void main(String[] args) {
//		SquareRoot1 obj = new SquareRoot1();
//		int SquareRoot1 = obj.findSquareroot();
//		System.out.println(SquareRoot1);
//	}
//}
