package practice;
class Childthread22 implements Runnable {
	public void run() {
		System.out.println("Thread child is start");
		for(int i=0;i<5;i++)
		{	
			try {
				System.out.println(Thread.currentThread().getThreadGroup().getName()+":"+i);
				System.out.println("Sleeping Thread");
				Thread.sleep(500);
				System.out.println("Wokeup Thread");
			}catch(InterruptedException k)
			{
				System.out.println(k);
			}
		}
		System.out.println("End Child Thread");
	}
}
class ChildThread212 {
	Thread child;
	ChildThread212(Childthread22 c)
	{
		child=new Thread(c,"Hitesh");
		child.setName("Hello");
		child.start();
	}
//	public void run()
//	{
//		for(int i=0;i<5;i++)
//		{
//			try {
//				System.out.println(Thread.currentThread().getName()+i);
//				Thread.sleep(500);
//			}catch(InterruptedException k)
//			{
//				System.out.println(k);
//			}
//		}
//	}
}
public class Threaddemo13 {
	public static void main(String[]args)
	{
		Childthread22 c=new Childthread22();
		ChildThread212 k=new ChildThread212(c);
		
	}

}
