
 class student{
	static int rollno=3;
	static String studname="vibhawari";
	static class course{
	
		String course = "DAC";
		public void display()
		{	student obj1 = new student();
			System.out.println("rollno:" +rollno);
			System.out.println("name is:" +studname);
		       System.out.println("course is:" +course);

		}
	}
}
public class staticinnerclass{

	public static void main(String[]args)
	{
	  student.course obj2 = new student.course();
	  obj2.display();
	}


}
