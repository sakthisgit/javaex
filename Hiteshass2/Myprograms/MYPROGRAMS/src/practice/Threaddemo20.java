package practice;
class ThreadB extends Thread{
	int total=0;
	public void run()
	{
		synchronized (this) {
			System.out.println("Child Thread start Excution");
			for(int i=0;i<5;i++)
			{
				total=total+i;
			}
			System.out.println("Child thread give notification");
			this.notify();
		}
	}
}
public class Threaddemo20 {
	public static void main(String []args) throws InterruptedException
	{
		ThreadB b=new ThreadB();
		b.start();
		synchronized (b)
		{
			System.out.println("main thread calling wait method");
			b.wait();
			System.out.println("main thread got notification ");
			System.out.println("total is :"+b.total);
		}
	}

}
