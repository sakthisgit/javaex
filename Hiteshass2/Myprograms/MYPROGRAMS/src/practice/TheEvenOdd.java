package practice;

import java.util.Scanner;

public class TheEvenOdd {
	
	public static void main(String[]args)
	{
		int num;
		System.out.println("Enter the num for checking even or odd");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is even num");
		}
		else
		{
			System.out.println("Num is odd");
		}
		
	}

}
