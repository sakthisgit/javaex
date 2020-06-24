package practice;
class Emp198 implements Runnable
{
	String name;
	Emp198(String name)
	{
		this.name=name;
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setPriority(8);
		System.out.println(t.getPriority());
	}
	
}
public class Threadrunnabledemo {
	public static void main(String[]args)
	{
		Emp198 e=new Emp198("child Thread");
		Thread t=new Thread(e);
		t.start();
		
	}

}
