package practice;
abstract class Student156{
	abstract void student();
	abstract void show();
}
public class InstituteDemo  {
	public static void main(String[]args)
	{
		Student156 s=new Student156() {
			public void student()
			{
				System.out.println("Studnet info");
			}
			public void show()
			{
				System.out.println("Show the student info");
			}
		};
		s.student();
		s.show();
	}

}
