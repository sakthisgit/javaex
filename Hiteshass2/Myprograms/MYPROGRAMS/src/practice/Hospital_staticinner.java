package practice;

public class Hospital_staticinner {
	static int floor;
	static String dname;
		static class Patient{
			String name;
		}
		public void display()
		{
			Patient p=new Patient();
			System.out.println("Name of patient :"+p.name);
			System.out.println("floor :"+floor);
			System.out.println("dname is :"+dname);
		}
		public static void main(String[]args)
		{
			Hospital_staticinner h=new Hospital_staticinner();
			h.display();
		}
}
