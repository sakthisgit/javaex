package practice;

import java.util.Scanner;

public class TheBloodgroup {

		public static void main(String[]args)
		{
			int num;
			String bg;
			
			System.out.println("Enter the num");
			Scanner sc=new Scanner (System.in);
			num=sc.nextInt();
			System.out.println("Enter your blood gorup");
			bg=sc.next();
			
			if(num==4)
			{
				if(bg=="A")
				{
					System.out.println("You can donate the blood to A blood grp people");
				}
				if(bg=="A+")
				{
					System.out.println("You can donate the blood to A+ blood grp people");
				}
				if(bg=="B")
				{
					System.out.println("You can donate the blood to B blood grp people");
				}
				if(bg=="B-")
				{
					System.out.println("You can donate the blood to B- blood grp people");
				}
			}
			else
			{
				System.out.println("Wrong input");
			}
			
		}
}
