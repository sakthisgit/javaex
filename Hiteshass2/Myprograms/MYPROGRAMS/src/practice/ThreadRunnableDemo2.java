package practice;
class Worker extends Thread
{
	int id;
	String name;
	Worker (int i,String n)
	{
		
		this.id=i;
		this.name=n;
	}
	public void run()
	{
		System.out.println(name);
		System.out.println("Main Thread create in Constuctr");
	}
}
public class ThreadRunnableDemo2 {
	public static void main(String[]args)
	{
		Worker w=new Worker(1,"Hitesh");
	}
}
