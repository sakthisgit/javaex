package practice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[]args)
	{
		int num = 0;
		int reverse=0;
		System.out.println("Enter the num for reverse");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println(num);
		while(num!=0)
		{
			reverse=reverse*10;
			reverse=reverse+(num%10);
			num=num/10;
		}
		System.out.println(reverse);
	}
}
