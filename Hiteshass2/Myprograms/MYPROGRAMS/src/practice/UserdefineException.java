package practice;

public class UserdefineException  {
	public void div(int num1,int num2)throws  SubstractException
	{
		if(num1<num2)
		{
			throw new SubstractException(num1);
		}
		else
		{
			int num=num1-num2;
			System.out.println(num);
		}
	}
	public static void main(String[]args)
	{
		UserdefineException u=new UserdefineException();
		try {
			u.div(566, 55);
		}
		catch (ArithmeticException a)
		{
			System.out.println(a);
		} catch (SubstractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
