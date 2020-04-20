package practice;

public class TrycatchThrowdemo {

	public void ageinfo(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("age is less than 18");
		}
		else
		{
			System.out.println("age is valid");
		}
	}
	public static void main(String[]args)
	{
		TrycatchThrowdemo t=new TrycatchThrowdemo();
		try {
			t.ageinfo(5);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
