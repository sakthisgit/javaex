package practice;

import java.util.Scanner;

public class Stringdemo9 {
	public static void main(String[]args)
	{
		String str,rev=" ",original;
		System.out.println("Enter the String here");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		for(int i=str.length()-1;i>0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}
}
