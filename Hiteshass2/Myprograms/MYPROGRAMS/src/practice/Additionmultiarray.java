package practice;

import java.util.Scanner;

public class Additionmultiarray {
		
	public static void main(String[]args)
	{
		int m=3;
		int n=3;
		
		int arr[][]=new int [m][n];
		int arr1[][]=new int [m][n];
		int add[][]=new int[m][n];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				add[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				System.out.println(add[i][j]);
			}
		}
		
	}

}
