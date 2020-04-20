package practice;

public class TryCatchnesteddemo {

	public static void main(String[]args)
	{
		int div;
		try {
			System.out.println("outer tryblock");
			div=10/0;
			try {
				int arr[]=new int[5];
				arr[2]=div;
				System.out.println(arr[5]);
			}catch( ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);	
			}
		}
		catch(ArithmeticException b){
			System.out.println(b);

		}
	}
}


