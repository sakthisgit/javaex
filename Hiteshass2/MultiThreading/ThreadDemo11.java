package practice;
class ChildThread12 extends Thread
{
	ChildThread12()
	{
		//Thread t=new Thread("Hitesh");
		//super("Hitesh");
		//t.start();
	}

	public void run()
	{
		System.out.println("Start Child Thread");
		for(int i=5;i>0;i--)
		{
			try {
				System.out.println(Thread.currentThread().getName()+i);
				System.out.println("Sleeping mode");
				Thread.sleep(500);
				System.out.println("wokeup mode");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("End Child Thread");
	}

}
public class ThreadDemo11 {

	public static void main(String[]args)
	{
		ChildThread12 c=new ChildThread12();
		c.start();
	}
}
