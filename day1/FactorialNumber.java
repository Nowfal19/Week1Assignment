package week.day1;

public class FactorialNumber { 
	
		 public static void main(String args[]){  
		  int i, fact = 1;  
		  int number=5;     //input number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}  