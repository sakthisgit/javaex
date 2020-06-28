package practice;

public class TryFinallydemo {

	public static void main(String[]args)
	{
		try {
			int a=25;
			int n;
			n=a/0;
			System.out.println(n);
		}
		finally {
			System.out.println("by default jvm handle exception");
		}
	}
}
