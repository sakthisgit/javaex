package firstprj;

public class class2 extends class1
{
	boolean present;
   public class2(String type, int Model, double price, double MilesDrive,boolean present)
   {
		super(type, Model, price, MilesDrive);
		this.type=type;
		this.Model=Model;
		this.price=price;
		this.MilesDrive=MilesDrive;
		this.present=present;
		
	}

   void display1()
   {
	   System.out.println("present:"+present);
	   
   }
   double getPrice()
   {
	   double Newprice=price-(MilesDrive*150);
		return Newprice;
   }
	

}
