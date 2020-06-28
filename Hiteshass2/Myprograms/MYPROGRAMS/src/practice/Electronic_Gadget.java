package practice;

public class Electronic_Gadget {
	String name;
	static final int qty=2;
	static class Mobile{
		int price =20000;
		public void show()
		{	
			Electronic_Gadget e=new Electronic_Gadget();
			System.out.println("name of gadget :"+e.name);
			System.out.println("qty of gadget is :"+qty);
			System.out.println("price is :"+price);
		}
	}
	public static void main(String[]args)
	{
		Mobile m=new Mobile();
		m.show();
	}


}
