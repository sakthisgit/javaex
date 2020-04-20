package practice;
abstract class Car1{ 
	abstract void type();
	abstract void speed();
}
abstract class Maruti1 extends Car1{
	abstract void brand();
}
public class AbstractSwift extends Maruti1 {

	@Override
	void brand() {
		System.out.println("Maruti is Car Brand");

	}

	@Override
	void type() {
		System.out.println("Four Wheel Drive Car");

	}

	@Override
	void speed() {
		System.out.println("MAruti Swiftt has very hidh speed ");		
	}
	public static void main(String[]args)
	{
		AbstractSwift a=new AbstractSwift();
		a.speed();
		a.brand();
		a.type();
	}
}
