package practice;

import java.util.Scanner;

public class TheDay {
	
	public static void main(String[]args)
	{
		String day;
		System.out.println("Enter the first char of day ");
		Scanner sc= new Scanner (System.in);
		day=sc.next();
		
		switch(day)
		{
		case "s":
			System.out.println("Sunaday , Saturday");
			break;
		case "m":
			System.out.println("Monday");
			break;
		case "t":
			System.out.println("Tuesday");
			break;
		case "w":
			System.out.println("Wenusday");
			break;
		case "th":
			System.out.println("Thursday");
			break;
		case "f":
			System.out.println("Friday");
			break;
		default :
			System.out.println("Wrong input ");
		}
	}
}
