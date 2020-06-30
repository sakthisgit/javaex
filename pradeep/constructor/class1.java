package firstprj;


public class class1
	{
		String type;
		int Model;
		double price;
		static String owner;
		double MilesDrive;
		owners owners;
		double getPrice()
		{
			double Newprice=price-(MilesDrive*100);
			return Newprice;
			
		}
		void display()
		{
			System.out.println("type:"+type);
			System.out.println("Model:"+Model);
			System.out.println("price:"+price);	
			System.out.println("MilesDrive:"+MilesDrive);
			System.out.println("owner:"+owner);
			
		}
	

	public class1(String type,int Model,double price,double MilesDrive)
	{
		this.type=type;
		this.Model=Model;
		this.price=price;
		this.MilesDrive=MilesDrive;
		owners=new owners();
		owners.firstname="pradeep";
		
	}

}
