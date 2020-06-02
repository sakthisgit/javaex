package practice;

import java.util.Scanner;

public class Pelingdromenum {
	
	public static void main(String[]args)
	{
		int num;
		int reverse=0;
		System.out.println("Enter the number for reversing");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		int original=num;
		
		while(num!=0)
		{
			reverse=reverse*10;
			reverse=reverse+(num%10);
			num=num/10;
		}
		System.out.println(reverse );
		
		if(reverse==original)
		{
			System.out.println("This is a pelingdrome number");
		}
		else
		{
			System.out.println("Not pelingdrome number");
		}
	}
}
