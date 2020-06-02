package practice;
interface Emp1236
{
	private void pass()
	{
		System.out.println("XYZ");
	}
	default void info()
	{
		System.out.println("My passWord");
		pass();
	}
}

public class InterfacePrivatemethod implements Emp1236{
	public static void main(String[]args)
	{
		InterfacePrivatemethod i=new InterfacePrivatemethod();
		i.info();
	}

}
