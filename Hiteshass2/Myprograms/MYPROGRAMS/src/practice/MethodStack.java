package practice;

public class MethodStack {

	public void div()
	{try {

		System.out.println("div");
		int a=20;
		int num=a/0;
		System.out.println(num);
	}catch(ArithmeticException a)
	{
		System.out.println(a);
	}
	}
	public void show()
	{
		div();
		System.out.println("Show");
		
	}
	public void display()
	{
		show();
		System.out.println("display");
		
	}
	public static void main(String[]args)
	{
		MethodStack m=new MethodStack();
		m.display();
	}


}
