package firstprj;




public class classcons
{

	public static void main(String[] args) 
	
	{
		
		class1 car1=new class1("bmw",2020,1000,2);

		car1.owner="pradeep";
		System.out.println("info of bmw car");
		car1.display();
	     System.out.println(car1.getPrice());
		class1 car2=new class1("benz",2020,2000,2);
		System.out.println("info of benz car");
		car2.display();
		System.out.println(car2.getPrice());
		
		class2 truck1=new class2("tata",2021,7000,7,true);
		System.out.println("info of tata cartruck");
 		truck1.display();
 		truck1.display1();
 		System.out.println(truck1.getPrice());
	}

}
