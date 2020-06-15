package practice;

public class ThreadDemo2 extends Thread {
	public void run()
	{
		System.out.println("This is a run method of Thred");
	}
	public static void main(String[]args)
	{
		ThreadDemo2 t=new ThreadDemo2();
		t.start();
	}

}
