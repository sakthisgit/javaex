package practice;
class ChildThread extends Thread
{
	public void run()
	{
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.sleep(550);
		}
		}catch(InterruptedException i)
		{
			System.out.println(i);
		}
	}
}
public class ThreadDemo8 {
	public static void main(String[]args)
	{
		ChildThread c=new ChildThread();
		c.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
				
	}

}
