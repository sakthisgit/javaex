package practice;
interface Book
{
	void read();
}
interface Kindle{
	void read();
}
public class Multipleinherit_interfaceUpcast implements Book,Kindle {

	public void read() {
		System.out.println("we can read from online also and book also");
	}
	public static void main(String[]args)
	{
		Multipleinherit_interfaceUpcast m=new Multipleinherit_interfaceUpcast();
		m.read();
		Book b=new Multipleinherit_interfaceUpcast();
		b.read();
	}
	

}
