package practice;

public class AgeValidation {

	public static void main(String[]args)
	{
		int age=25;
		
		if (age < 18)
		{
			System.out.println("Age is not valid for voting");
		}
		else
		{
			System.out.println("Age is valid for voting");
		}
	}
}
