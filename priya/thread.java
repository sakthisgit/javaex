class ThreadExample extends Thread
{
	public ThreadExample(String name)
	{
		setName(name);
		start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName()+i);
		}
	}
	public static void main(String []args)
	{
		ThreadExample t1=new ThreadExample("HELLO");
		ThreadExample t2=new ThreadExample("JAVA");
	}
}
