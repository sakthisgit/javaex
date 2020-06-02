package practice;

import java.util.Scanner;

public class Arraysmallest {
	public static void main(String[]args)
	{
		int n=5;
		int arr[]=new int[n];
		System.out.println("Enter the values in array");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
			
		}
		System.out.println(smallest);
	}

}
