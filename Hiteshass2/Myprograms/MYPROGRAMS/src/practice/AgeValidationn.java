package practice;

import java.util.Scanner;

public class AgeValidationn {

	public static void main (String[]args)
	{
		int age;
		System.out.println("Enter the age : ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age<18)
		{
			System.out.println("Age is not valid for voting ");
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
}
