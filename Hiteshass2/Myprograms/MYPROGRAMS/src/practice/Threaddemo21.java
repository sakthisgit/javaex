package practice;
class Operation2{
	int x;
	volatile boolean flag=false;
	public synchronized void put(int x) throws InterruptedException
	{
		while(flag)
		{
			wait();
		}

		this.x=x;
		System.out.println("put is :"+x);
		flag=true;
		notify();

	}
	public synchronized void get() throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		System.out.println("get is :"+x);
		flag=false;
		notify();
	}
}
class Producer123 implements Runnable{
	Thread p;
	Operation2 o;
	Producer123(Operation2 o)
	{
		this.o=o;
		p=new Thread(this,"Producer");
		p.start();
	}
	public void run()
	{
		try {
			int i=0;
			while(true)
			{
				o.put(i++);
				Thread.sleep(1000);
			}
		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
	}

}
class Consumer123 implements Runnable{
	Thread p;
	Operation2 o;
	Consumer123(Operation2 o)
	{
		this.o=o;
		p=new Thread(this,"Consumer");
		p.start();
	}
	public void run()
	{
		try {
			while(true)
			{
				o.get();
				Thread.sleep(5000);
			}
		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
	}

}
public class Threaddemo21 {
	public static void main(String[]args)
	{
		Operation2 o=new Operation2();
		Producer123 p=new Producer123(o);
		Consumer123 c=new Consumer123(o);
	}

}
