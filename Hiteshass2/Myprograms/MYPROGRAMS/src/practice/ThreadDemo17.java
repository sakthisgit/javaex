package practice;

import java.util.Scanner;
class HusbendThread11 implements Runnable{
	Thread husbend;
	Axis a;
	HusbendThread11(Axis a)
	{
		husbend=new Thread(this,"Hitesh");
		this.a=a;
		husbend.start();
	}
	public void run()
	{
		a.deposite();
	}
}
class WifeThread11 implements Runnable{
	Thread wife;
	Axis a;
	WifeThread11(Axis a)
	{
		wife=new Thread(this,"Hitesh");
		this.a=a;
		wife.start();
	}
	public void run()
	{
		a.withdraw();
	}

}
class Axis{
	volatile int balance =50000;
	private int deposite;
	private int withdraw;
	Scanner sc=new Scanner(System.in);

	public synchronized void deposite()
	{   try {
		System.out.println("Balance brfore deposite :"+balance);
		Thread.sleep(1000);
		System.out.println("Enter the deposite amount");
		deposite=sc.nextInt();
		Thread.sleep(500);
		balance=balance+deposite;
		Thread.sleep(500);
		System.out.println("Balance after deposite is :"+balance);
	}catch(InterruptedException k)
	{
		System.out.println(k);
	}
	}
	public synchronized void withdraw()
	{   try {
		System.out.println("Balance brfore withdraw :"+balance);
		Thread.sleep(1000);
		System.out.println("Enter the withdraw amount");
		withdraw=sc.nextInt();
		Thread.sleep(500);
		balance=balance-withdraw;
		Thread.sleep(500);
		System.out.println("Balance after withdraw is :"+balance);
	}catch(InterruptedException k)
	{
		System.out.println(k);
	}
	}
}
public class ThreadDemo17 {
	public static void main(String[]args)
	{
		Axis a=new Axis();
		HusbendThread11 h=new HusbendThread11(a);
		WifeThread11 w=new WifeThread11(a);
	}

}
