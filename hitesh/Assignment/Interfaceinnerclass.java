interface Hitesh{

	void name();

}
public class Interfaceinnerclass{

	public static void main(String[]args)
	{
		Hitesh h=new Hitesh(){

		public void name()
		{
			System.out.println("My name Annonymous Hitesh");
		}

		};
		h.name();
	}


}
