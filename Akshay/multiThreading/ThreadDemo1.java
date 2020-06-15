package multiThreading;

class Threadexample extends Thread
{
	Threadexample(String name)
	{
		getName();
		start();
	}
	
	public void run()
	{
		System.out.println("Execution of Child Thread Start From Here....");
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(getName()+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interruped.");
		}
		System.out.println("Exiting Child Thread.");
	}
}
public class ThreadDemo1  {

	public static void main(String[] args) {
		Threadexample t1=new Threadexample("thread-1");
		Threadexample t2=new Threadexample("thread-2");

	}

}
