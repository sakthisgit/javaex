package practice;

public class Clonableinterface implements Cloneable {
	int id;
	String name;
	public Clonableinterface(int id, String string) {
		
		this.id = id;
		this.name = string;
	}
	public void show()
	{
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
	public static void main(String[]args) throws CloneNotSupportedException
	{
		Clonableinterface c=new Clonableinterface(2,"Hitesh");
		c.show();
		Clonableinterface v=(Clonableinterface)c.clone();
	
	}

}
