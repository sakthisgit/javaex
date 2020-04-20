package practice;

import java.util.Scanner;

public class Primenum {
	
	public static void main(String[]args)
	{
		int num,count;
		System.out.println("how many prime num u want put here");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
				
		for(int i=1;i<=num;i++)
		{	
			 count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
		if(count==0)
		{
			System.out.println(i);
		}
		}
	}
}
