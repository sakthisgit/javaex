package practice;
class ChildThread123 implements Runnable
{
	Thread child;
	ChildThread123()
	{
		//child=new Thread(this,"mawww");
		//child.start();
		System.out.println("Change name of thread");
		//child.setName("Hitesh");
		//child.setPriority(10);
	}
	public void run()
	{
		System.out.println("Start Child Thread");
		for (int i=0;i<9;i++)
		{
			try {
			System.out.println(child.currentThread().getName()+" :"+i);
			System.out.println("Child Thread going to sleep");
			Thread.sleep(500);
			System.out.println("Child Thread going to wokeup");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("End Child Thread");
	}
	
}
public class ThreadDemo12 {
	
		public static void main(String[]args)
		{
			ChildThread123 c=new ChildThread123();
			Thread t=new Thread(c);
			t.setName("AShok");
			t.start();
					
		}

}
