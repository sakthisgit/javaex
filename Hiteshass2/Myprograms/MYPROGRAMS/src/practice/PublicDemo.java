package practice;

public class PublicDemo {
	protected int i=1000;
	protected void show()
	{
		System.out.println(i);
	}
	public static void main(String[]args)
	{
		PublicDemo p=new PublicDemo();
		p.show();
		
	}
}
