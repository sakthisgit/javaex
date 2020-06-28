package practice;
interface Animal123
{
	void show();
}
public class LamdaExprdemo {
	public static void main(String[]args)
	{
		Animal123 a=()->{
			System.out.println("Hello lamda0");
		};
		a.show();
	}

}
