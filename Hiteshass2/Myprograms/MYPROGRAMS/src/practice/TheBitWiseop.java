package practice;

import java.util.Scanner;

public class TheBitWiseop {
	public static void main(String[]args)
	{
		int a;
		int b;
		System.out.println("Enter the numbers A And B");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		int c=a&b;
		int d=a|b;
		int e=a^b;
		int f=a<<b;
		int g=a>>>b;
		
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
		
		System.out.println("c is :"+c);
		System.out.println("d is :"+d);
		System.out.println("e is :"+e);
		System.out.println("f is :"+f);
		System.out.println("g is :"+g);
	}
}
