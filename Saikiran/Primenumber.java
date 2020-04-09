package cdac;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      for (int i = 2; i <= n; i++)  	   
	      { 
	    	  boolean isprime=true;
	         for(int j =2; j<i; j++)
	             {
		             if(i%j==0)
		                {
			                isprime = false;
			                break;
		                }
		         }
		       if (isprime)
		             {
		                    System.out.println("primeNumbers are"+i);
		             }	
	     }	

	}

}
