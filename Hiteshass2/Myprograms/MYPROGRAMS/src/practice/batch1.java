package practice;

public class batch1 {
	int id;
	String name;
	static String batchcode;
	
	void show()
	{
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("batch_code is:"+batchcode);
	}
	public static void main(String[]args)
	{
		batch1 b=new batch1();
		b.id=1;
		b.name="Hitesh";
		batch1.batchcode="ct-106";
		b.show();
		

		batch1 b1=new batch1();
		b1.id=2;
		b1.name="Akshay";
		//batch1.batchcode="ct-106";
		b1.show();
		
		

		batch1 b2=new batch1();
		b2.id=3;
		b2.name="kirti";
		batch1.batchcode="ct-107";
		b2.show();
		
		

		batch1 b3=new batch1();
		b3.id=4;
		b3.name="tejas";
		//batch1.batchcode="ct-106";
		b3.show();
		
		
		
	}
}
