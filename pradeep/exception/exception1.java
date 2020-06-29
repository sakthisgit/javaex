package firstprj;

public class exception1
{

	public static void main(String[] args)
	{
		int a=10;
		int b=1;
		int a1[]= {1,2,3,4,5};
		String s="my name is pradeep and i am a good boy";
		try
		{
			int c=a/b;
			System.out.println(c);
			System.out.println(a1[3]);
			System.out.println(s.charAt(0));
			System.out.println(s.charAt(55));
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("execption:"+ex.getMessage());
		}
		catch(StringIndexOutOfBoundsException ex1)
		{
			System.out.println("execption string out of range:"+ex1.getMessage());
		}
		catch(ArithmeticException ex1)
		{
			System.out.println("execption Arithmetic:"+ex1.getMessage());
		}
		finally
		{
			System.out.println("done");
		}
	}

}
