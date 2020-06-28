package practice;

import java.util.Scanner;

public class Trycatchdemo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		float result;
		try {
		System.out.println("Enter the num1 ");
		num1=sc.nextInt();
		System.out.println("Enter the num2");
		num2=sc.nextInt();
		System.out.println("Enter the num3");
		num3=sc.nextInt();
		result=num1/num2;
		System.out.println(result);
		}catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hellooooo");
	}

}
