package practice;
class person{
	public void show()
	{
		System.out.println("This is a parent Class");
	}
	public void info(int id,String person)
	{
		System.out.println(" id is :"+id);
		System.out.println("person is :"+person);
	}
}
class Emp extends person{
	public void show()
	{
		System.out.println("This is a Child Class");
	}
	public void Empinfo(int salary,String center)
	{
		System.out.println(" salary is :"+salary);
		System.out.println("center is "+center);
	}
}
public class Dynamic {
	public static void main(String[]args)
	{
		System.out.println("This is parent class call");
		person p=new person();
		p.show();
		p.info(12, "Hitesh");
		
		System.out.println("This is a upcasting");
		person c=new Emp();
		c.show();
	
		
		System.out.println("Downcasting for only child unique method accesing purpose used");
		Emp e=(Emp)c;
		e.Empinfo(25000, "It");
		e.info(12, "Hitesh");
	}

}
