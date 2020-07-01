class Animal
{
	public void show()
	{
		System.out.println("this is animal class");
	}
	
}
class Wild extends Animal{
	public void show()
	{
		System.out.println("this is ichild class ");
	}
	
	public void display()
	{
		System.out.println("This is wild animal..");
	}
}
public class Dyanamic_binding{
	
	public static void main(String[]args)
	{
		Animal obj1 =new Animal();
		obj1.show();
		

		obj1= new Wild();
		obj1.show();

 		// downcasting
		Wild obj2 = (Wild) obj1;

		obj2.show();
		obj2.display();
	}

}
