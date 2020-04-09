package cdac;

class Rangers{
	public String name;
	public Rangers(String name)
	{
		this.name=name;
	}
	public String attack()
	{
		return "rangers attack";
	}
}

class RedRanger extends Rangers{
	public RedRanger(String name)
	{
		super(name);
	}
	@Override
	public String attack()
	{
		return name+"=>>>>>Attack with red eagle fire power!";
	}
}
class BlueRanger extends Rangers{
	public BlueRanger(String name)
	{
		super(name);
	}
	@Override
	public String attack()
	{
		return name+"=>>>>>Attack with blue whale water power!";
	}
}
class GreenRanger extends Rangers{
	public GreenRanger(String name)
	{
		super(name);
	}
	@Override
	public String attack()
	{
		return name+"=>>>>>Attack with green nature power!";
	}
}
public class Test{
	public static void main(String[] args) {
		Rangers r1=new RedRanger("Jack");
		Rangers r2=new BlueRanger("mike");
		Rangers r3=new GreenRanger("Trent");
		System.out.println(r1.attack());
		System.out.println(r2.attack());
		System.out.println(r3.attack());
	}
}



