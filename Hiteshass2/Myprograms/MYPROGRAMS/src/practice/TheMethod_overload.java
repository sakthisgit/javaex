package practice;
class overload
{
	public int add (int x,int y)
	{
		return x+y;
	}
	public double add(int z)
	{
		return z; 
	}
}
public class TheMethod_overload {
		public static void main(String[]args)
		{
			overload o=new overload();
			System.out.println(o.add(4));
			System.out.println(o.add(5, 9));
			
		}

}
