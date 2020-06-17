package practice;

public class ThreadDemo10 {
	public static void main(String[]args)
	{
		Thread t=Thread.currentThread();
		System.out.println("Thread name ,priority,gorup");
		System.out.println(t);
		t.setName("Hitesh");
		System.out.println("Changingg thread name");
		System.out.println(t);
		
		for(int i=0;i<5;i++)
		{
			try {
			System.out.println(i);
			System.out.println("Sleeping mode on");
			Thread.sleep(500);
			System.out.println("Wokeup mode");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("End main Thread");
		
	}
}
