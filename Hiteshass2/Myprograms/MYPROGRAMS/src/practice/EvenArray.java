package practice;

import java.util.Scanner;

public class EvenArray {
	
	public static void main(String[]args)
	{
		int n=5;
		int arr[]=new int[n];
		System.out.println("Enter the values");
		Scanner  sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}
}
