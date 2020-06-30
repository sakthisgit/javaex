package firstprj;

import java.util.Scanner;

public class palindrome
{
	public static int reverse(int n)
	{
		int r=0,s;
		while(n!=0)
		{
		s=n%10;
		r=(r*10)+s;
		n=n/10;
	    }
		return r;
	}
	
	public static void main(String[] args)
	{
		int rev;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		rev=reverse(num);
		if (num==rev)
		{
			System.out.println("Palindrome");

		}
		else
		{
			System.out.println("Not Palindrome");

		}
		
	
	}
}