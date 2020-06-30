package firstprj;

public class innerclass
{
	static class Animal
	{
		String name;
		String voice;
	}

	public static void main(String[] args)
	{
		innerclass a=new innerclass();
		a.call();
		Animal mainanimal=new Animal();
		mainanimal.name="snake";
		mainanimal.voice="quiet";
		System.out.println("animal name:"+mainanimal.name);
		System.out.println("animal voice:"+mainanimal.voice);

	}
	void call()
	{
		Animal animal=new Animal();
		animal.name="lion";
		animal.voice="loud";
		System.out.println("animal name:"+animal.name);
		System.out.println("animal voice:"+animal.voice);			
	}

}
