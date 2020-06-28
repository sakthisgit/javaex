package practice;

public class ThreadDemo3 extends Thread {
	String name;
	ThreadDemo3(String n)
	{
		this.name=n;
	}
	
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		int n=5;int m=1;
		for(int i=1;i<=5;i++)
		{
			try
			{
				m=i*n;
			
			Thread.sleep(5000);
			System.out.println(m);
			}
			catch(InterruptedException I)
			{
				System.out.println(I);
			}
		}
	}
	public static void main(String[]args)
	{
		ThreadDemo3 t=new ThreadDemo3("Child THread");
		t.start();
	}
}
