package practice;
abstract class Student111{

	int id;
	public String name;
	static String cname;
	protected int marks;
	final String add="Kalyan";

	abstract void showinfo();
}
public class Abstract_variableDemo extends Student111 {

	@Override
	void showinfo() {
		System.out.println("Student information");
	}
	public static void main(String[]args)
	{
		Abstract_variableDemo s=new Abstract_variableDemo();
		s.showinfo();
		s.id=2;
		s.name="Hitesh";
		s.marks=55;


		System.out.println("id is :"+s.id);
		System.out.println("name is :"+s.name);
		System.out.println("Marks is :"+s.marks);
		System.out.println("Address is :"+s.add);
	}
}
