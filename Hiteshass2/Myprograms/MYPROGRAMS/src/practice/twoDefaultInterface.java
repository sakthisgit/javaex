package practice;
interface car2369{
	default void type()
	{
		System.out.println("FourWheel");
	}
}
interface bike{
	default void type()
	{
		System.out.println("TwoWheel");
	}
}
public class twoDefaultInterface implements car2369,bike{
	public void type(){

		System.out.println("main method ");
	}
	public static void main(String[]args)
	{
		twoDefaultInterface i=new twoDefaultInterface();
		i.type();
	}
}
