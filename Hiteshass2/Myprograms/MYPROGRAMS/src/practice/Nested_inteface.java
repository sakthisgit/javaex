package practice;
interface Institute{
	void show();
	interface Department{
		void info();
	}
}
public class Nested_inteface implements Institute ,Institute.Department  {


	public void info() {
		System.out.println("This nested class method");		
	}


	public void show() {
		System.out.println("This is parent class method");		
	}
	public static void main(String[]args)
	{
		Nested_inteface n=new Nested_inteface();
		n.show();
		n.info();
	}


}
