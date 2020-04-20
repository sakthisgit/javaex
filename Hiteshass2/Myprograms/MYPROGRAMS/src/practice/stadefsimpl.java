package practice;
interface industry{
	static void hollywood()
	{
		System.out.println("Hollywood is the film industry");
	}
	default void bollywood()
	{
		System.out.println("Bollywood is the film industry");
	}
	void tollwood();
}
public class stadefsimpl implements industry {
	

	
	public void tollwood() {
		System.out.println("Tollywood is great");
		
	}
	public static void main(String[]args)
	{
		stadefsimpl s=new stadefsimpl();
		s.bollywood();
		s.tollwood();
		industry.hollywood();
	}

}
