package practice;

public class ThreadMainDemo {
	public static void main(String[]args)
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Hitesh");
		System.out.println(t.getName());
		System.out.println(t);

		for(int i=6;i>0;i--)
		{
			try {
				System.out.println(i);
				Thread.sleep(450);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}

		}
		System.out.println("End Thread");
	}

}
