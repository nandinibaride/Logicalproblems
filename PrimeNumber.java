package logicalproblems.com;
import java.util.*;
public class PrimeNumber {
public static void main(String args[]) {
	/*
	 * @purpose:To Check enter number is prime or not prime
	 * @return: No return value
	 */
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: "); 
      int num = sc.nextInt();
    
     int counter = 0;
     for(int i=1; i<=num ; i++) {
    	if(num % i == 0) 
    	 counter++;
    	}
        if(counter == 2) 
        	System.out.println("Enter number is prime");
        
    	else 
    		System.out.println("Enter number is not  prime");
      }	
 } 
     

