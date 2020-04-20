package practice;

import java.util.Scanner;

public class Array1 {
	public static void main(String[]args)
	{
		int arr[]=new int[10];
		System.out.println("Enter the array values :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
}
