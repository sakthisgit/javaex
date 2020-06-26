package practice;
class ChildThread145 implements Runnable{
	Thread child;
	ChildThread145(String name)
	{
		child=new Thread(this,name);
		child.start();
	}
	public void run()
	{
		System.out.println("Start Child Thread");
		for(int i=0;i<5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				System.out.println("Sleeping mode is open");
				Thread.sleep(500);
				System.out.println("Wokeup Thread");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("Child Thread ends");
	}
} 

public class ThreadDemo14 {

	public static void main(String[]args)
	{
		ChildThread145 t=new ChildThread145("Keshav");
		ChildThread145 t1=new ChildThread145("Ramdev");
		ChildThread145 t2=new ChildThread145("MAhadev");

		System.out.println("Start main Thread");
		for(int i=0;i<5;i++)
		{
			try {
				System.out.println("Main thread : "+i);
				System.out.println("Sleeping mode is open");
				Thread.sleep(500);
				System.out.println("Wokeup Thread");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("main Thread ends");

	}
}
