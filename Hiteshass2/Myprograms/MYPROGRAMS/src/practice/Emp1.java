package practice;

public class Emp1 {
	int id;
	String name;
	String place;
	int salary;
	
	public Emp1(int id, String name, String place, int salary) {

		this.id = id;
		this.name = name;
		this.place = place;
		this.salary = salary;
	}
	
	public void show()
	{
		System.out.println("Id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("place is :"+place);
		System.out.println("salary is :"+salary);
	}
	
	public static void main(String[]args)
	{
		Emp1 e=new Emp1(1,"Hitesh","Kalyan",56236);
		e.show();
	}
}
