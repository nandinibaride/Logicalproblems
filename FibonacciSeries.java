package logicalproblems.com;
import java.util.Scanner;

public class FibonacciSeries {
	/*
	 * @purpose: To find the fibonacciseries using 
	 * @return: No return type
	 */
	    public static void main(String[] args) {
	        int n1=0,n2=1,n3,i;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int num = sc.nextInt();
	        for (i=2; i<num; i++){
	            n3=n1+n2;
	            System.out.println(n3);
	            n1=n2 ;
	            n2=n3;
	          }
	   }    
}       
	   
	



