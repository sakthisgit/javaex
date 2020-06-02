package practice;

import java.util.Scanner;

public class TheIndex {
	
		public static void main(String[]args)
		{
			int choice;
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Fundamentals java");
				break;
			case 2:
				System.out.println("Intro of java");
				break;
			case 3:
				System.out.println("Classes , construtor");
				break;
			case 4:
				System.out.println("Static variable,methods ,blocks");
				break;
			case 5:
				System.out.println("inheritance");
				break;
			default :
				System.out.println("Wrong input dear");
			}
		}
}
