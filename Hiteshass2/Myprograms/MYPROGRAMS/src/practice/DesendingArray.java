package practice;

import java.util.Scanner;

public class DesendingArray {
	public static void main(String[]args)
	{
	int n=5;
	int arr[]=new int[n];
	
	System.out.println("Enter the array values");
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	

	for(int i=0;i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	

	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}