package practice;
interface Department{
	static void branch()
	{
		System.out.println("Branch is mech");
	}
	default void count()
	{
		System.out.println("total 50 students im mech ");
	}
}
public class StaticDefaultInterface implements Department {
	public static void main(String[]args)
	{
		StaticDefaultInterface s=new StaticDefaultInterface();
		Department.branch();
		s.count();
	}

}
