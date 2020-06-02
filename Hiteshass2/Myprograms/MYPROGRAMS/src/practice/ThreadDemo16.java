package practice;

import java.util.Scanner;
class HusbendThread implements Runnable{
	Thread hchild;
	Bank12 b;
	HusbendThread(Bank12 b)
	{
		this.b=b;
		hchild=new Thread(this,"HusbendThread");
		
		hchild.start();
	}
	public void run()
	{
		b.deposite();
	}
}
class WifeThread implements Runnable{
	Thread wchild;
	Bank12 b;
	WifeThread(Bank12 b)
	{
		this.b=b;
		wchild=new Thread(this,"WifeThread");
		
		wchild.start();
	}
	public void run()
	{
		b.withdraw();
	}
}//class WifeThread implements Runnable{



class Bank12{
	volatile int balance=5000;
	private int deposite;
	private int withdraw;
	Scanner sc=new Scanner(System.in);
	public void deposite()
	{	try {
		System.out.println("Balance before deposite : "+balance);
		Thread.sleep(1000);
		System.out.println("Enter the deposite ammount");
		deposite=sc.nextInt();
		Thread.sleep(500);

		balance=balance+deposite;
		Thread.sleep(1500);
		System.out.println("Balance after deposite : "+balance);

	}catch(InterruptedException o)
	{
		System.out.println(o);
	}
	}
	public void withdraw()
	{	
		try {
			System.out.println("Balance before withdraw : "+balance);
			Thread.sleep(20000);
			System.out.println("Enter the withdraw ammount");
			withdraw=sc.nextInt();
			Thread.sleep(10000);

			balance=balance-withdraw;
			Thread.sleep(1500);

			System.out.println("Balance after withdraw : "+balance);

		}catch(InterruptedException o)
		{
			System.out.println(o);
		}
	}
}
public class ThreadDemo16 {
	public static void main(String[]args)
	{
		Bank12 b=new Bank12();
		HusbendThread h=new HusbendThread(b);
		WifeThread w=new WifeThread(b);
	}

}

