class childThread implements Runnable
{
	Thread child;
	public childThread() {
		
		child=new Thread(this,"Demo");
		child.start();
		child.setName("demochild");
		child.setPriority(Thread.MIN_PRIORITY);
	}
	public void run() {
	
		System.out.println("Exection start");
		try
		{
			for(int i=3;i>0;i--)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("thread interrupted");
		}
		System.out.println("Exiting child Thread.");
	}

}
public class threadDemo{
public static void main(String[] args) {
	childThread ct=new childThread();
}
}

