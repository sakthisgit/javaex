package practice;

import java.util.Scanner;

public class SwitchArithmaatic {
	
		public static void main(String[]args)
		{
			int a;
			int b;
			char operation;
			
			System.out.println("Enter the two number :");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("A is :"+a);System.out.println("A is :"+a); 
			System.out.println("B is :"+b);
			System.out.println("Enter the arithmatic operation symbol + - * /");
			operation=sc.next().charAt(0);
			
			switch(operation)
			{
			case '+':
				int add=a+b;
				System.out.println("the Addition is :"+add);
				break;
			case '-':
				int sub=a-b;
				System.out.println("the Substraction is :"+sub);
				break;
			case '*':
				int mul=a*b;
				System.out.println("the Multiplication is :"+mul);
				break;
			case '/':
				int div=a/b;
				System.out.println("the division is :"+div);
				break;
			default :
				System.out.println("Erong input baby");
			}
		}

}
