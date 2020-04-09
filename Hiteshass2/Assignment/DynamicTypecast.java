class Animal{
	public void show()
	{
		System.out.println("Some Animals has four legs some animals has four hands");
		System.out.println("this is parent class");
	}

	public void Count()
	{
		System.out.println("Animals are very Strong");
	}
}
class Dog extends Animal{
	public void show()
	{
		System.out.println("this is a child class ");
	}
	
	public void display()
	{
		System.out.println("This is a unique method");
	}
}
public class DynamicTypecast{
	
	public static void main(String[]args)
	{
		System.out.println("This is parent object only and call only parents methods");
		Animal a=new Animal();
		a.show();
		a.Count();

		System.out.println("This is a upcasting calling only overide method");
		 a=new Dog();
		a.show();
		a.Count();
		

		System.out.println("This is downcasting calling to unique methods present");
		Dog d=(Dog)a;
		d.show();
		
		d.display();
	}

}
