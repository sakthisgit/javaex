package practice;
class Operation{
	int n;
	volatile boolean flagset=false;
	synchronized int get() throws InterruptedException
	{
		if(flagset==false)
		{
			wait();
		}
		System.out.println("Got :"+n);
		flagset=false;
		notify();
		return n;
	}
	synchronized void put(int n) throws InterruptedException
	{
		if(flagset==true)
		{
			wait();
		}
		this.n=n;
		System.out.println("put :"+n);
		flagset=false;
		notify();

	}
}
class Producer implements Runnable
{
	Thread p;
	Operation o;
	Producer(Operation o)
	{
		this.o=o;
		p=new Thread(this,"Producer");
		p.start();
	}
	public void run()
	{
		int i=0;
		try {
			while(true)
			{
				o.put(i);
				i++;
				Thread.sleep(500);
			}
		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
	}
}
class Consumer implements Runnable
{
	Thread p;
	Operation o;
	Consumer(Operation o)
	{
		this.o=o;
		p=new Thread(this,"Consumer");
		p.start();
	}
	public void run()
	{
		int i=0;
		try {
			while(true)
			{
				o.get();

				Thread.sleep(500);
			}
		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
	}
}
public class ThreadDemo19 {
	public static void main(String[]args)
	{
		Operation o=new Operation();
		Producer p=new Producer(o);
		Consumer c=new Consumer(o);
	}

}
