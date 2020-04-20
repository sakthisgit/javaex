package practice;

import java.util.Scanner;

public class EvenLargestnum {
	
		public static void main(String[]args)
		{
			int n=5;
			int arr[]=new int[n];
			System.out.println("Enter the values of array");
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int largest=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0 && largest<arr[i])
				{
					largest=arr[i];
				}
			}
			System.out.println("Largest even num is :"+largest);
			
		}

}
