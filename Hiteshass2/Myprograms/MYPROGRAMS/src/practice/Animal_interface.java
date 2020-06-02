package practice;
interface Animal{
	void eat();
}
interface cat extends Animal{
	void voice();
}
public class Animal_interface implements cat {

	public void eat() {
		System.out.println("Animals eat kahipan khata rav");
	}

	public void voice() {
		System.out.println("Cat voice is meow meow meow");		
	}

	public static void main(String[]args)
	{
		Animal_interface a=new Animal_interface();
		a.eat();
		a.voice();
	}


}
