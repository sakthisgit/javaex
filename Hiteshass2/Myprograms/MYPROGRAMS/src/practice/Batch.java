package practice;

public class Batch {
	String name,place;
	int id,rollnum=1;
	
	Batch(String n,int i)
	{
		this.name=n;
		this.id=i;
	}
	Batch(String place)
	{
		this.place=place;
	}
	@Override
	public String toString() {
		return "Batch [name=" + name + ", place=" + place + ", id=" + id + ", rollnum=" + rollnum + "]";
	}
	public static void main(String[]args)
	{
		Batch b=new Batch("Hitesh",11);
		Batch m=new Batch("Kalyan");
		System.out.println(m);
		
		System.out.println("Id is :"+b.id+"n"+"Name is :"+b.name+"\n"+"Place is :"+m.place);
				
	}
}
