interface product{
	int p_id=230;
	String p_name = "Sugar";
	String p_type ="small";
	void prod_info();
}
public class anoymous_Demo {
	public static void main(String[]args)
	{
		product obj1= new product()
		{
			public void prod_info()
			{
				System.out.println("productid: " +p_id );
				System.out.println("name " +p_name);
				System.out.println("type " +p_type);
			}

		};

		obj1.prod_info();
	}
}
