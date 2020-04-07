class Animal{
	public void behaviour()
	{
		System.out.println("making sound");
	}

}
class cat extends Animal{

}
class Dog extends Animal{


}
public class inherit{
public static void main(String[]args)
{
	cat c=new cat();
	c.behaviour();
	Dog d=new Dog();
	d.behaviour();
}
}
