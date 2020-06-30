class Division
{
public void div()
{
	try
	{
		int a[] = new int []{10,20,30,40};
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
public class Exceptionobj1 {
	
	public static void main(String[] args) {
	Division1 d =new Division1();
	d.div();
	}

}
