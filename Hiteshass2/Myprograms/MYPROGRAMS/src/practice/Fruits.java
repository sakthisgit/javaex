package practice;
class Mango{
	Mango()
	{
		System.out.println("First Constructor");
	}
}
class Apple extends Mango{
	Apple()
	{
		System.out.println("Second Constructor");
	}
}
class Cherry extends Apple{
	Cherry()
	{
		System.out.println("Third Constructor");
	}
}
public class Fruits {
	public static void main(String []args)
	{
		Cherry c=new Cherry();
	}

}
