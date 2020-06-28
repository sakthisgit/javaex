package practice;

import java.util.Scanner;

public class ThraedRunnableDemo implements Runnable{
	ThraedRunnableDemo()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		if(i%2==0)
		{
			System.out.println("Even num");
		}
		else
		{
			System.out.println("odd num");
		}
	}
	public static void main(String[]args)
	{
		ThraedRunnableDemo t=new ThraedRunnableDemo();
		
	}

}
