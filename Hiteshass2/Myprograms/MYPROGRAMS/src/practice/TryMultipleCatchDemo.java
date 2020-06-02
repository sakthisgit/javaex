package practice;

public class TryMultipleCatchDemo {
	public void catch1()
	{
		System.out.println("call to catch1");
	}

	public void catch2()
	{
		System.out.println("call to catch2");
	}

	public static void main(String[]args)
	{
		TryMultipleCatchDemo t=new TryMultipleCatchDemo();
		try{
			int a=25;int b;
			b=a/0;
			System.out.println(b);
			int arr[]=new int[3];
			arr[3]=b;
			System.out.println(arr[3]);
		}catch(ArithmeticException a)
		{
			t.catch1();
			System.out.println(a);
		}
		catch( ArrayIndexOutOfBoundsException c)
		{
			t.catch2();
			System.out.println(c);
		}

	}

}
