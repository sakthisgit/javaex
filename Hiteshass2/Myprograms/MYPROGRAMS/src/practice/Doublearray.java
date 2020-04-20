package practice;

import java.util.Scanner;

public class Doublearray {
	
	public static void main(String[]args)
	{
		int m=3;
		int n=3;
		int arr[][]=new int[m][n];
		System.out.println("Enter the Multiplearray : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
				
			}System.out.println( );
		}
	}
}
