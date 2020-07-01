package firstprj;

import java.util.Scanner;

public class factorial
{
	public static int facts(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
		 f=f*i;	
		}
		return f;
	}
	public static void main(String[] args)
	
	{   
		int factorial1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		factorial1=facts(num);
		System.out.println("the factorial of given num is :"+factorial1);
		
		
	}


}

	
