package firstprj;
import java.util.*;


public class Constructor {

	public static void main(String[] args)
	{
	   
	   prime p=new prime();
	   p.d();
	}

}

class prime
{
	
	
	public  void d()
	{
//		System.out.println("Entered d");
		int count =0;
		int totalcount =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n=sc.nextInt();
//		System.out.println(n);
		System.out.println("the prime numbers between 1 to 10000 are:");
		for(int j=1;j<=10000;j++)
		{
		   count=0;
//			System.out.println(j);
		   for(int i=1;i<=j;i++)
		     {
		        if(j % i == 0)
		        {
			    count = count + 1;
		        }
		     } 
		   if(count == 2 )
		   {
			   totalcount=totalcount + 1;
			System.out.print(j+",");
			
			   
//			System.out.println("The number is Prime");
		   }
//		   else
//		   {
//			System.out.println("The number is Not a Prime");	
//		   }
	    }
		System.out.println();
		System.out.print("the total number of prime numbers between 1 to 10000 are :");
		System.out.print(totalcount);
	}
}
