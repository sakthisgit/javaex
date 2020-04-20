package practice;

import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[]args)
	{
		int num,original,temp,ans=0;
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		original=num;
		while(num!=0)
		{
			temp=num%10;
			ans=ans+(temp*temp*temp);
			num=num/10;
			
		}
		System.out.println(ans);
		
		if(original==ans)
		{
			System.out.println("This is a armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
	}
}
