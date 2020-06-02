package practice;

public class ThreadRunnabledemo implements Runnable{
	public void run() {
		System.out.println("Runnable chi method");
	}
	public static void main(String[]args)
	{
		ThreadRunnabledemo y=new ThreadRunnabledemo();
		Thread t=new Thread(y);
		t.start();
	}

}
