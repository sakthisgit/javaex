package practice;
abstract class Car123{
	abstract void type();
}
abstract class Maruti123{
	abstract void info();
}
public class AnnonSwift extends Maruti123{
	public void info()
	{
		System.out.println("info abut maruti is here");
	}
	public static void main(String[]args)
	{
		AnnonSwift a=new AnnonSwift();
		a.info();
		Car123 c=new Car123() {
			public void type()
			{
				System.out.println("This is type of four wheel drive");
			}
		};
		c.type();
	}

}
