import java.util.Scanner;
import java.io.IOException;
public class ThrowDemo{
                  
	public void info(int age)
	{
		if(age <= 18)
		{
			throw new ArithmaticException
		}
		else
		{
			System.out.println("Your the one come to my office and meet me");
		}

	}
	public static void main(String[]args)
	{
		System.out.println("Enter age here ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt;

		ThrowDemo t=new ThrowDemo();

		t.info(age);

	}
}
