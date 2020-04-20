package practice;
class ChildThread147 implements Runnable{
	Thread child;
	ChildThread147(String name)
	{
		child=new Thread(this,name);
		child.start();
	}
	public void run()
	{
		System.out.println("Start Child Thread");
		for(int i=0;i<5;i++)
		{
//			try {
//			System.out.println(Thread.currentThread().getName()+" : "+i);
//			System.out.println("Sleeping mode is open");
//			Thread.sleep(500);
//			System.out.println("Wokeup Thread");
//			}catch(InterruptedException k)
//			{
//				System.out.println(k);
//			}
		}
	}
}
