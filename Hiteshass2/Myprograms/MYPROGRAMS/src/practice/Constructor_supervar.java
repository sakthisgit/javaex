package practice;
class Bank{
	int id,salary;
	String name,center;
	
	Bank(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Kotak extends Bank{
	Kotak(int id,String name,int salary,String center)
	{
		super(id,name);
		this.salary=salary;
		this.center=center;
	}
	void show()
	{
		System.out.println(" id is :"+id);
		System.out.println(" name is :"+name);
		System.out.println("salary is:"+salary);
		System.out.println("center is:"+center);
	}
	
}
public class Constructor_supervar {
	public static void main(String[]args)
	{
		Kotak k=new Kotak(1,"Hitesh",20000,"Kalyan");
		k.show();
		
		
	}

}
