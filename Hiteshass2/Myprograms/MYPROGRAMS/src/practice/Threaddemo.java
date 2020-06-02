package practice;

public class Threaddemo {
	
	public static void main(String[]args)
	{
		new Thread() {
			public void run() {
				System.out.println("Annonymus run method call");
			}
		}.run();
	}
}
