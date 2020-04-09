interface Institute {
	void show();

	interface Department{
		void display();
	}
}
public class NestedInterface implements Institute,Institute.Department{
		
	   public void show()
	   {
		System.out.println("Institiute is a outer class ");
	   }
	   public void display()
	   {
		System.out.println("Department is nested class on Institute");
	   }

	   public static void main(String[]args)
	   {
		   NestedInterface n=new NestedInterface();
		   n.show();
		   n.display();
	   }
}
