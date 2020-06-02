package practice;
abstract class Fruit105{
	abstract void show();
}
public class AnnonClass {
	public static void main(String[]args)
	{
		Fruit105 f=new Fruit105() {
			public void show()
			{
				System.out.println("Fruit is a  Fruit");
			}
		};
		f.show();
	}

}
