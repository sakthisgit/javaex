package practice;
class Gadget{
	void  first()
	{
		System.out.println("purvi sarv gadget cha use karth hote");
	}
}
class Tv extends Gadget{
	void second()
	{
		System.out.println("ata sarv mug tv var ale");
	}
}
class SmartTv extends Tv
{
	void third()
	{
		System.out.println("mug tya tv mhdhe pan kahi upgrade kele ani ata smart tv aale");
	}
}
public class Multilevelinherit {
	public static void main(String[]args)
	{
		SmartTv s=new SmartTv();
		s.first();
		s.second();
		s.third();
	}
	
}
