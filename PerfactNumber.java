package logicalproblems.com;
import java.util.*;
public class PerfactNumber {
	/*
	 * @purpose: Check given number is perfect or not perfect 
	 * @return: No return type
	 */
	 public static void main(String[] args) {
	        int i,sum=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: "); 
	        int num = sc.nextInt();
            for (i = 1; i<num; i++){ 
                if(sum % i == 0)
	                sum = sum+i; 
	                }
	            if (sum == num) 
	            System.out.println("Number is perfect"); 
	           else 
	            System.out.println("Number is not perfect");
	           }
	    }
	


