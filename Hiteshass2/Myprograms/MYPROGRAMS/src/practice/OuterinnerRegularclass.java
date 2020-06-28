package practice;

public class OuterinnerRegularclass {
	String name="laptop";
	     	class Laptop{
	     		String brand ="Dell";
	     		int price =20000;
	     		public void display()
	     		{
	     			System.out.println("name of laptop is :"+name);
	     			System.out.println("Brand is:"+brand);
	     			System.out.println("price is:"+price);
	     		}
	     	}
	     	public static void main(String[]args)
	     	{ 
	     		OuterinnerRegularclass o=new OuterinnerRegularclass();
	     		Laptop l=o.new Laptop();
	     		l.display();
	     	}

}
