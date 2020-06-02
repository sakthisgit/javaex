package practice;

import java.util.Scanner;

public class TheBloodDonation {
	
	public static void main(String[]args)
	{
		int age;
		int weight;
		
		System.out.println("Enter your age here :");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("Enter the your perfect weight");
		weight=sc.nextInt();
		
		if(age<18)
		{
			if(weight<50)
			{
				System.out.println("You not applicable for blood donation sorry");
			}
			else
			{
				System.out.println("Your weight is perfect for blood donation");
			}
		}
		else
		{
			System.out.println("You are aplicable to donate blood ");
		}
				
	}
}
