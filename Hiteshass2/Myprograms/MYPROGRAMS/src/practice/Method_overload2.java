package practice;

import java.util.Scanner;

public class Method_overload2 
{
	
	public int show(int a,int b)
	{
		return a+b;
	}
	public double show(int p,int q,int r)
	{
		return p+q+r;
	}
	
	public static void main(String[]args)
	{
		Method_overload2 m=new Method_overload2();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the A,B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the P,Q,R");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(m.show(a, b));
		System.out.println(m.show(p, q, r));
		
	}

}
