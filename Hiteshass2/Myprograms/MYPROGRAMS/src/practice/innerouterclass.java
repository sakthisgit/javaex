package practice;

public class innerouterclass {
		class inner{
			int id=2;
			static final String name="Hitesh";
		}
		public void display()
		{
			inner i=new inner();
			System.out.println("id is :"+i.id);
			System.out.println("Name is :"+i.name);
		}
		public static void main(String[]args)
		{
			innerouterclass i=new innerouterclass();
			i.display();
		}
}
