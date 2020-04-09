public class StaticElectronic{
	int id=102;
	static String name="Note 4";
	static class mobile{
		int price =50000;
		static String company="Redmi";
		public void show()
		{     
			StaticElectronic s =new StaticElectronic();
			System.out.println("Id number is :"+s.id+
					"Name of Mobile is :"+s.name+
					"Price of Mobile is:"+price+
					"Company name is :"+company);

		}

	}
	public static void main(String[]args)
	{
		mobile m=new mobile();
		m.show();
	}


}
