package practice;

import java.util.Scanner;

public class ThePercentage {
	
		public static void main(String[]args)
		{
			System.out.println("1)Enter your fullname ");
			System.out.println("2)Enter your Roll number ");
			System.out.println("3)Enter your Maths test1 marks ");
			System.out.println("4)Enter your Maths test2 marks");
			System.out.println("5)Enter your Maths test3 marks ");
			
			String name;
			int rollnum;
			int math1;
			int math2;
			int math3;
			int add;
			double per;
			
			Scanner sc=new Scanner(System.in);
			name=sc.next();
			rollnum=sc.nextInt();
			math1=sc.nextInt();
			math2=sc.nextInt();
			math3=sc.nextInt();
			add=math1+math2+math3;
			System.out.println(" Name is :"+name);
			System.out.println("Roll num is :"+rollnum);
			System.out.println("Your TOTAL addition is : "+add);
			per=add*100/300;
			System.out.println("Your percentage is :"+per);
			
			
			if(per>80)
			{
				System.out.println("You got distingtion");
			}
			else if(per<80 && per >60)
			{
				System.out.println("You got first class ");
			}
			else if(per<60 && per>40 )
			{
				System.out.println("You got Second class");
			}
			else
			{
				System.out.println("You fail baby");
			}
			
		}
}
