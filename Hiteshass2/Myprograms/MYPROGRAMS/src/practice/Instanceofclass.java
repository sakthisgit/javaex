package practice;
class Hitesh{
	
}
class Sonar extends Hitesh{
	
}
public class Instanceofclass {
	public static void main(String[]args)
	{
		boolean result;
		Hitesh h=new Hitesh();
		result=h instanceof Hitesh;
		System.out.println(result);
		boolean k1;
		Hitesh k=new Sonar();
		k1=k instanceof Hitesh;
		System.out.println(k1);
		
	}
}
