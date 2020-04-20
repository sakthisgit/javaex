package practice;
class Annony{
	Annony()
	{
		System.out.println("Counstructor call");
	}
	{
		System.out.println("Annonymous block");
	}
	{
		System.out.println("second Annonymous block");
	}
}
public class Annonymousdemo {
	
		public static void main(String[]args)
		{
			Annony a=new Annony();
		}

}
