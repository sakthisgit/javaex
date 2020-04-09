 class Hospital{
	static int floor=5;
	static String Dname="Doctor Hitesh";
	static class Patient{
	
		String Hname="Naidu Hospital";
		public void display()
		{	Hospital h=new Hospital();
			System.out.println("Hospital name is :"+Hname);
			System.out.println("Number pf floor in Hospitak :"+floor+"Doctor name is :"+Dname);
		}
	}
}
public class Staticinner{

	public static void main(String[]args)
	{
		Patient p=new Patient();
		p.display();
	}


}
