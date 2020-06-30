interface product{
	int p_id=280;
	String p_name = "Sugar";
	String p_type ="small";
	void prod_info();
}
public class Anoymous_Product {
	public static void main(String[]args)
	{
		product obj= new product()
		{
			public void prod_info()
			{
				System.out.println("productid: " +p_id );
				System.out.println("name " +p_name);
				System.out.println("type " +p_type);
			}

		};

		obj.prod_info();
	}
}
