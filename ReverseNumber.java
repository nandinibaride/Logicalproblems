package logicalproblems.com;
import java.util.*;

public class ReverseNumber {
	public static void main(String args[]) {
		/*
		 * @Purpose: To calculate reverse number using formula.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		int reverse = 0 ;
		while(number > 0) {
		 int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			 number /= 10 ;
			}
		 System.out.println("Reverse Number is: " + reverse);
		}
	}
		
		
	

