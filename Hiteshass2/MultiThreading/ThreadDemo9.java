package practice;
class Batch123 implements Runnable
{
	Thread t;
	Batch123(String name)
	{
		
		t=new Thread(this,"Child");
		t.start();
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t.currentThread().getName()+"Settion start");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo9 {
	public static void main(String[]args)
	{
		Batch123 b=new Batch123("Hitesh");
		
	}

}
