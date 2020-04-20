package practice;

import java.util.Scanner;

public class ForEach {
	public static void main (String[]args)
	{
		int add=0,n=5;
		int arr[]=new int[n];
		Scanner sc=new Scanner(System.in);
		for (int i:arr)
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
		for(int i:arr)
		{
			add+=i;
		}
		System.out.println("Addition is : "+add);
	}
}
