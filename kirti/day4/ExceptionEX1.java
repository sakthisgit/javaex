class Division1
{
public void div()
{
	try
	{
		int a[] = new int []{1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("value" +a[i]);
		}
	}
	catch(Exception ae)
	{
		System.err.println("Error" +ae);
	}
	finally
	{
		System.out.println("Finally block");
	}
	System.out.println("hello");
}}
public class ExceptionEX1 {
	
	public static void main(String[] args) {
	Division1 d =new Division1();
	d.div();
	}

}
