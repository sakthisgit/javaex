interface School{
	
	void show();

}
interface Student extends School{

	void display();

}
public class ExtendInteface implements Student{

	public void show()
	{
		System.out.println("School  name is : Ganesh vidya Mandir");
	}
	public void display()
	{
		System.out.println(" Hitesh Sonar is Student of this school");
	}
	public static void main(String[]args)
	{
		ExtendInteface e=new ExtendInteface();
		e.show();
		e.display();
	}

}
