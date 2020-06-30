
class Division
{
	public void div()
	{   try
	{
		int a=1,b=0,c;
		c = a/b;
		System.out.println("Division" +c);
	}
	catch(ArithmeticException ae)
	{
		System.err.println("Cannot divide by zero" +ae.getMessage());
	}
	
	System.out.println("Hello");
	}
}

public class ExceptionEX {


	public static void main(String[] args) {
	Division d = new Division();
		d.div();
	}
}
