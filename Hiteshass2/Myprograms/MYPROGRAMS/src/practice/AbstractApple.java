package practice;
abstract class Fruit11
{
	public void info()
	{
		System.out.println("This is a Fruit Class");
	}
	abstract void show();
}
public class AbstractApple extends Fruit11 {

	@Override
	void show() {
		System.out.println("Apple is fruit");
	}
	public static void main(String[]args)
	{
		AbstractApple a=new AbstractApple();
		a.show();
		a.info();
	}

}
