package practice;
class ChildThread165 implements Runnable{
	Thread child;
	ChildThread165(String name)
	{
		child=new Thread(this,name);
		child.start();
		child.setPriority(2);
	}
	public void run()
	{
		System.out.println("Starting child Thread");
		for(int i=0;i<5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+":"+i);
				System.out.println("Thraed is sleeping");
				Thread.sleep(500);
				System.out.println("Thread is on");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("Child is end now");
	}

}
public class ThreadDemo15 {
	public static void main(String[]args)
	{
		ChildThread165 c=new ChildThread165("Hitesh");
		ChildThread165 c1=new ChildThread165("Ashok");
		ChildThread165 c2=new ChildThread165("Sonar");

		System.out.println("Thread is alive or not");
		System.out.println(c.child.getName()+"Alive ?"+c.child.isAlive());
		System.out.println(c1.child.getName()+"Alive ?"+c1.child.isAlive());
		System.out.println(c2.child.getName()+"Alive ?"+c2.child.isAlive());

		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("main thread :"+i);

				c.child.join();
				c1.child.join();
				c2.child.join();

				System.out.println(c.child.getName()+"Alive ?"+c.child.isAlive());
				System.out.println(c1.child.getName()+"Alive ?"+c1.child.isAlive());
				System.out.println(c2.child.getName()+"Alive ?"+c2.child.isAlive());
			}
		}catch(InterruptedException k)
		{
			System.out.println(k);
		}
		System.out.println("main thread shut down");
	}

}
