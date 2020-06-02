package practice;

public class Employee {
	String name;
	int id;
	String place;
	int salary;
	
	public Employee(String name, int id, String place, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.place = place;
		this.salary = salary;
	}
	
	void show ()
	{
		System.out.println("Name of Emp : "+name+"\n"+"Id of emp :"+id+"\n"+"place of emp : "+place+"\n"+"salary of emp :"+salary);
		
	}
	
	public static void main(String[]args)
	{
		Employee e=new Employee("Hitesh",12,"Kalyan",5200);
		e.show();
	}
}
