package practice;

import java.util.Scanner;
class HusbendThread159 implements Runnable{
	Thread husbend;
	SBI s;
	Scanner sc=new Scanner(System.in);
	HusbendThread159(SBI s)
	{
		this.s=s;
		husbend=new Thread(this,"Hitesh");
		husbend.start();
	}
	public void run()
	{ try {
		synchronized (s) {
			System.out.println("Balance is before deposite :"+s.balance);

			System.out.println("Enter the deposite value");
			int hdeposite=sc.nextInt();

			s.balance=s.deposite(hdeposite);

			System.out.println("After depsosite amount is" +s.balance);
		}
	}catch(Exception i)
	{
		System.out.println(i);
	}

	}
}
class WifeThread159 implements Runnable{
	Thread wife;
	SBI s;
	Scanner sc=new Scanner(System.in);
	WifeThread159(SBI s)
	{
		this.s=s;
		wife=new Thread(this,"Hitesh");
		wife.start();
	}
	public void run()
	{ try {
		synchronized (s) {
			System.out.println("Balance is before withdraw :"+s.balance);

			System.out.println("Enter the withdraw value");
			int Wwithdraw=sc.nextInt();

			s.balance=s.withdraw(Wwithdraw);

			System.out.println("After withdraw amount is" +s.balance);
		}
	}catch(Exception i)
	{
		System.out.println(i);
	}

	}

}

class SBI{
	volatile int balance=50000;
	private int deposite;
	private int withdraw;
	Scanner sc=new Scanner(System.in);

	public int deposite(int hdeposite)
	{
		try {
			balance=balance+hdeposite;
			Thread.sleep(500);

		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
		return balance;
	}
	public int withdraw(int Wwithdraw)
	{
		try {
			balance=balance-Wwithdraw;
			Thread.sleep(500);

		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
		return balance;
	}
}
public class ThreadDemo18 {

}
