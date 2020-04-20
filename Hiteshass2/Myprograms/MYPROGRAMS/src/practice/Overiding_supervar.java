package practice;
class Industry{
	int salary,leaves;
	String Qualification;
	
	static void display()
	{
		System.out.println("Industry information");
	}
	public void setDetails(int salary,int le,String qual)
	{
		this.salary=salary;
		this.leaves=le;
		this.Qualification=qual;
	}
	public void getDetails()
	{
		Industry.display();
		System.out.println("Industry  salary is :"+salary);
		System.out.println("Industry leaves is :"+leaves);
		System.out.println("Industry Qualification is :"+Qualification);
	}
}
class IT extends Industry{
	int salary=20000;
	int leaves=5;
	String Qualification="PG-DAC";
	static void display()
	{
		System.out.println("IT industry information");
	}
	public void getDetails()
	{	super.getDetails();
		IT.display();
		System.out.println("Industry  salary is :"+salary);
		System.out.println("Industry leaves is :"+leaves);
		System.out.println("Industry Qualification is :"+Qualification);
	}
	
	
}
public class Overiding_supervar {
	public static void main(String[]args)
	{
		IT i=new IT();
		i.setDetails(25000, 9, "CS");
		i.getDetails();
		
	}

}
