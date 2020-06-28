package practice;

import java.util.Scanner;

public class Fibo {
	public static void main(String[]args)
	{
		try {
		int a=0;
		int b=1;
		int num,c;
		System.out.println("Enter the num ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(" "+a);
			 c=a+b;
				b=a;
			a=c;
		
		
		}
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}
		
		

}
