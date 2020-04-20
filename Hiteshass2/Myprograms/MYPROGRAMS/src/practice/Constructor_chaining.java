package practice;

public class Constructor_chaining {
		int id,salary;
		String name,Add;
		Constructor_chaining()
		{
			this(2);
		}
		Constructor_chaining(int i)
		{
			
			this("Thane");
			this.id=i;
			
		}
		Constructor_chaining(int sal,String n)
		{
		
			this.salary=sal;
			this.name=n;
			
		}
		Constructor_chaining(String add)
		{
			this(22000,"hitesh");
			this.Add=add;
		}
		void show()
		{
			System.out.println("Name is :"+name);
			System.out.println("id is :"+id);
			System.out.println("salary is :"+salary);
			System.out.println("add is "+Add);
		}

	public static void main(String[] args) {
		
		Constructor_chaining c=new Constructor_chaining();
		c.show();
		

	}

}
