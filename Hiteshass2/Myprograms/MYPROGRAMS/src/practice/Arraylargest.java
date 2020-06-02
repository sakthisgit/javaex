package practice;

import java.util.Scanner;

public class Arraylargest {
	
	public static void main(String[]args)
	{
		int largest,n=6;
		int arr[]=new int[n];
		System.out.println("Enter the values");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}
}
